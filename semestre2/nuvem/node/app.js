const express = require("express");
const fs = require("fs");

const app = express();

const htmlIndex  = fs.readFileSync('index.html');
const htmlCadastro  = fs.readFileSync('cadastro.html');
const htmlLogin  = fs.readFileSync('login.html');

app.get("/", (request, response) => {
    response.end(htmlIndex);
});

app.get("/cadastro", (request, response) => {
    response.end(htmlCadastro);
});

app.get("/login", (request, response) => {
    response.end(htmlLogin);
});
app.get("/loggedin", (request, response) => {
    let success = `Seja bem-vindo, ${request.query.nome}! Seu cadastro foi realizado com sucesso!
    Email cadastrado: ${request.query.email}`;
    let fail = "Pagina apenas para usuarios cadastrados.";
    let output = request.query.nome ? success : fail;
    response.end(output);
});

app.listen(8888, erro => {
    if(erro){
        console.log("Erro");
    }else{
        console.log("Servidor está on...");
    }
});