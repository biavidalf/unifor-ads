/*
  * Author: Beatriz Vidal
  * Description: Somar Números
*/

export function somarNumeros(numerosDigitados) {
    let soma = 0;
    for (let i = 0; i < numerosDigitados.length; i++) {
        soma += numerosDigitados[i];
    }

    return "-> R: A soma dos " + numerosDigitados.length + " números é igual a: " + soma;
}