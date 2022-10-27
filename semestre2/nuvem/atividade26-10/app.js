const express = require("express");
const fs = require("fs");
const path = require('path');
const calculadora = require('./functions');

const app = express();

const htmlIndex  = fs.readFileSync('index.html');

app.get("/", (request, response) => {
    response.sendFile(path.join(__dirname+'/index.html'));
});

app.get("/resultado", (request, response) => {
    let valor1 = parseFloat(request.query.valor1);
    let valor2 = parseFloat(request.query.valor2);

    let resultado = '';

    let op = request.query.op;

    if(op == 'soma'){
        resultado = valor1 + " + " + valor2 + " = " + calculadora.soma(valor1, valor2)
    }else if(op == 'sub'){
        resultado = valor1 + " - " + valor2 + " = " + calculadora.sub(valor1, valor2)
    }
    response.end(resultado);
});

app.listen(8888, erro => {
    if(erro){
        console.log("Erro");
    }else{
        console.log("Servidor está on...");
    }
});