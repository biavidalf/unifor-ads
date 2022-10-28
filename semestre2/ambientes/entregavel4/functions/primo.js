/*
  * Author: Beatriz Vidal
  * Description: Checar se um número é primo ou não
*/

export function numeroPrimo(numero) {
    let divisores = 0;

    for (let i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        divisores++;
      }
    }

    if (divisores == 2) {
      return "-> R: O número digitado (" + numero + ") é primo.";
    } else {
      return "-> R: O número digitado (" + numero + ") não é primo.";
    }
}