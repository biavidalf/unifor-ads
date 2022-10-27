var express = require('express');
var app = express();

var bodyParser = require('body-parser');
app.use(bodyParser.json());

function soma(a, b) {
    return a + b;
}

app.get('/', function(req, res) {
  res.send('Oi, mundo :-)');
});

app.post('/soma', function (req, res) {
    var body = req.body;
    var resultado = soma(body.a, body.b);

    res.send(`O resultado da soma de ${body.a} e ${body.b} é ${resultado}`);
});

var port = 3001;

// iniciando o processo do servidor
app.listen(port, function() {
  console.log(`App de Exemplo escutando na porta http://localhost:${port}/`);
});