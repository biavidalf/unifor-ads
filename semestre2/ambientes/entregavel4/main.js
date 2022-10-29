/*
  ENTREGÁVEL 1 - AMBIENTES DE DESENVOLVIMENTO DE SOFTWARE
  Beatriz Vidal, 2217226, ADS
  Algoritmos fundamentais em Javascript
*/
const numeroPrimo = require('./functions/primo/primo');
const somarNumeros = require("./functions/soma");
const mdc = require("./functions/mdc");
const fibonacci = require("./functions/fibonacci");
const ordenarVetor = require("./functions/ordem");
const contagem = require("./functions/contagem/contagem");
const readlineSync = require('readline-sync');

console.log(`===============================
    ALGORITMOS FUNDAMENTAIS
    Author: Beatriz Vidal
===============================\n`)

/*
* ================= ALGORITMO 1 =================
*/
console.log("ALGORITMO 1: Número Primo");
let input_numeroPrimo = perguntar();
console.log(numeroPrimo(input_numeroPrimo) + "\n");

/*
* ================= ALGORITMO 2 =================
*/
console.log("ALGORITMO 2: Somar números");
let input_quantidadeNumerosSoma = perguntar('Quantos numeros deseja somar? ', 'int');
let numerosParaSomar = [];

for(let i = 0; i < input_quantidadeNumerosSoma; i++){
  let numAtual = perguntar('Digite o valor ' + (i+1) + ': ');
  numerosParaSomar[i] = numAtual;
}
console.log(somarNumeros(numerosParaSomar) + "\n");

/*
* ================= ALGORITMO 3 =================
*/
console.log("ALGORITMO 3: Série Fibonacci");
let input_numTermos = perguntar('Digite a quantidade de termos: ', 'int');
console.log(fibonacci(input_numTermos) + "\n");

/*
* ================= ALGORITMO 4 =================
*/
console.log("ALGORITMO 4: MDC");
let input_mdcNum1 = perguntar('Digite o primeiro valor: ');
let input_mdcNum2 = perguntar('Digite o segundo valor: ');
console.log(mdc(input_mdcNum1, input_mdcNum2) + "\n");

/*
  * ================= ALGORITMO 5 =================
*/
console.log("ALGORITMO 5: Ordenar Vetor");
let input_quantidadeNumerosOrdenar = perguntar('Quantos numeros deseja ordenar? ', 'int');
let numerosParaOrdenar = [];

for(let i = 0; i < input_quantidadeNumerosOrdenar; i++){
  let numAtual = perguntar('Digite o valor ' + (i+1) + ': ');
  numerosParaOrdenar[i] = numAtual;
}
console.log(ordenarVetor(numerosParaOrdenar) + "\n");

/*
  * ================= ALGORITMO 6 =================
*/
console.log("ALGORITMO 6: Contar Inteiros");
let input_quantidadeNumerosContar = perguntar('Quantos numeros deseja contar? ', 'int');
let numerosParaContar = [];

for(let i = 0; i < input_quantidadeNumerosContar; i++){
  let numAtual = perguntar('Digite o valor ' + (i+1) + ': ');
  numerosParaContar[i] = numAtual;
}
console.log(contagem(numerosParaContar));


// Função para realizar a entrada de dados
// Faz um loop até o usuário digitar um número válido
// Caso o usuário digitar nada ou apenas letras, ele pergunta novamente
function perguntar(mensagem = 'Digite um numero: ', tipo = 'float'){
  let resposta = (tipo == 'int') ? parseInt(readlineSync.question(mensagem)) : parseFloat(readlineSync.question(mensagem));
  while(isNaN(resposta)){
    resposta = perguntar(mensagem, tipo);
  }
  return resposta;
}