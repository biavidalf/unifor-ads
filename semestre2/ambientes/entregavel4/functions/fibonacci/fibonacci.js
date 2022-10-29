/*
  * Author: Beatriz Vidal
  * Description: Série de Fibonacci
*/

module.exports = function fibonacci(quantidadeTermos){
    let anterior = 0;
    let atual = 1;
    let resultado = "0, ";

    for(let i = 1; i < quantidadeTermos; i++){
      if(i == quantidadeTermos - 1){
        resultado += atual + ".";
      }else{
        resultado += atual + ", ";
      }
      let aux = atual;
      atual = anterior + aux;
      anterior = aux;
    }

    return "-> R: Série Fibonacci com " + quantidadeTermos + " termos: " + resultado;
}