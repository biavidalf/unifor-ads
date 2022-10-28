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
let numero = parseFloat(readlineSync.question('Digite um numero: '));
console.log(numeroPrimo(numero) + "\n");

/*
* ================= ALGORITMO 2 =================
*/
console.log("ALGORITMO 2: Somar números");
let quantidade = readlineSync.question('Quantos numeros deseja somar? ');
let numeros = [];

for(let i = 0; i < quantidade; i++){
  let numAtual = parseFloat(readlineSync.question('Digite o valor ' + (i+1) + ': '));
  numeros[i] = numAtual;
}
console.log(somarNumeros(numeros) + "\n");

/*
* ================= ALGORITMO 3 =================
*/
console.log("ALGORITMO 3: Série Fibonacci");
let termos = parseInt(readlineSync.question('Digite a quantidade de termos: '));
console.log(fibonacci(termos) + "\n");

/*
* ================= ALGORITMO 4 =================
*/
console.log("ALGORITMO 4: MDC");
let numero1 = parseFloat(readlineSync.question('Digite o primeiro valor: '));
let numero2 = parseFloat(readlineSync.question('Digite o segundo valor: '));
console.log(mdc(numero1, numero2) + "\n");

/*
  * ================= ALGORITMO 5 =================
*/
console.log("ALGORITMO 5: Ordenar Vetor");
quantidade = readlineSync.question('Quantos numeros deseja ordenar? ');
numeros = [];

for(let i = 0; i < quantidade; i++){
  let numAtual = parseFloat(readlineSync.question('Digite o valor ' + (i+1) + ': '));
  numeros[i] = numAtual;
}
console.log(ordenarVetor(numeros) + "\n");

/*
  * ================= ALGORITMO 6 =================
*/
console.log("ALGORITMO 6: Contar Inteiros");
quantidade = readlineSync.question('Quantos numeros deseja contar? ');
numeros = [];

for(let i = 0; i < quantidade; i++){
  let numAtual = parseFloat(readlineSync.question('Digite o valor ' + (i+1) + ': '));
  numeros[i] = numAtual;
}
console.log(contagem(numeros));