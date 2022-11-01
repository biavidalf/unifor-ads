var express = require('express');
var app = express();

var bodyParser = require('body-parser');
app.use(bodyParser.json());

app.get('/', function(req, res) {
  res.send('Oi, mundo :-)');
});

app.post('/calcular', function (req, res) {
    var body = req.body;
    var operador = body.operador;

    metodos = {
      soma: (valor1, valor2) => soma(valor1, valor2),
      subtracao: (valor1, valor2) => subtracao(valor1, valor2),
      multiplicacao: (valor1, valor2) => multiplicacao(valor1, valor2),
      divisao: (valor1, valor2) => divisao(valor1, valor2),
    }

    var resultado = metodos[operador](parseFloat(body.a), parseFloat(body.b));

    res.send(`O resultado da ${operador} de ${body.a} e ${body.b} é ${resultado}`);
});

var port = 3001;

// iniciando o processo do servidor
app.listen(port, function() {
  console.log(`App de Exemplo escutando na porta http://localhost:${port}/`);
});


function soma(a, b) {
  return a + b;
}
function subtracao(a, b) {
  return a - b;
}
function multiplicacao(a, b) {
  return a * b;
}
function divisao(a, b) {
  return a / b;
}