/*
  * Author: Beatriz Vidal
  * Description: Calcular o MDC
*/

module.exports = function mdc(first, second){
    let resto;
    let f_old = first;
    let s_old = second;

    do{
      resto = first % second;
      first = second;
      second = resto;
    }while(resto != 0);

    return `-> R: MDC de ${f_old} e ${s_old} é igual a: ${first}`;
}