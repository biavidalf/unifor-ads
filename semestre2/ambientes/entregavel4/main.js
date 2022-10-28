/*
  ENTREGÁVEL 1 - AMBIENTES DE DESENVOLVIMENTO DE SOFTWARE
  Beatriz Vidal, 2217226, ADS
  Algoritmos fundamentais em Javascript
*/
import { numeroPrimo } from "./functions/primo.js";
import { somarNumeros } from "./functions/soma.js";
import { mdc } from "./functions/mdc.js";
import { fibonacci } from "./functions/fibonacci.js";
import { ordenarVetor } from "./functions/ordem.js";
import { contagem } from "./functions/contagem.js";
import readlineSync from 'readline-sync';

console.log(`===============================
    ALGORITMOS FUNDAMENTAIS
    Author: Beatriz Vidal
===============================\n`)

/*
* ================= ALGORITMO 1 =================
*/
console.log("ALGORITMO 1: Número Primo");
let input_numeroPrimo = perguntar('Digite um numero: ');
console.log(numeroPrimo(input_numeroPrimo) + "\n");

/*
* ================= ALGORITMO 2 =================
*/
console.log("ALGORITMO 2: Somar números");
let input_quantidadeNumerosSoma = readlineSync.question('Quantos numeros deseja somar? ');
let numerosParaSomar = [];

for(let i = 0; i < input_quantidadeNumerosSoma; i++){
  let numAtual = parseFloat(readlineSync.question('Digite o valor ' + (i+1) + ': '));
  numerosParaSomar[i] = numAtual;
}
console.log(somarNumeros(numerosParaSomar) + "\n");

/*
* ================= ALGORITMO 3 =================
*/
console.log("ALGORITMO 3: Série Fibonacci");
let input_numTermos = parseInt(readlineSync.question('Digite a quantidade de termos: '));
console.log(fibonacci(input_numTermos) + "\n");

/*
* ================= ALGORITMO 4 =================
*/
console.log("ALGORITMO 4: MDC");
let input_mdcNum1 = parseFloat(readlineSync.question('Digite o primeiro valor: '));
let input_mdcNum2 = parseFloat(readlineSync.question('Digite o segundo valor: '));
console.log(mdc(input_mdcNum1, input_mdcNum2) + "\n");

/*
  * ================= ALGORITMO 5 =================
*/
console.log("ALGORITMO 5: Ordenar Vetor");
let input_quantidadeNumerosOrdenar = readlineSync.question('Quantos numeros deseja ordenar? ');
let numerosParaOrdenar = [];

for(let i = 0; i < input_quantidadeNumerosOrdenar; i++){
  let numAtual = parseFloat(readlineSync.question('Digite o valor ' + (i+1) + ': '));
  numerosParaOrdenar[i] = numAtual;
}
console.log(ordenarVetor(numerosParaOrdenar) + "\n");

/*
  * ================= ALGORITMO 6 =================
*/
console.log("ALGORITMO 6: Contar Inteiros");
let input_quantidadeNumerosContar = readlineSync.question('Quantos numeros deseja contar? ');
let numerosParaContar = [];

for(let i = 0; i < input_quantidadeNumerosContar; i++){
  let numAtual = parseFloat(readlineSync.question('Digite o valor ' + (i+1) + ': '));
  numerosParaContar[i] = numAtual;
}
console.log(contagem(numerosParaContar));


// Função para realizar a entrada de dados
// Faz um loop até o usuário digitar um número válido
// Caso o usuário digitar nada ou apenas letras, ele pergunta novamente
function perguntar(mensagem, tipo = 'float'){
  let resposta = (tipo == 'int') ? parseInt(readlineSync.question(mensagem)) : parseFloat(readlineSync.question(mensagem));
  while(isNaN(resposta)){
    resposta = perguntar(mensagem, tipo);
  }
  return resposta;
}