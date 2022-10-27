import { soma } from './functions.js';

export function somar(){
    let valor1 = parseFloat(document.getElementById('input1').value);
    let valor2 = parseFloat(document.getElementById('input2').value);

    console.log(valor1, valor2);

    let resposta = soma(valor1, valor2);

    document.getElementById('resposta').innerHTML = 'Resposta: ' + resposta;
}