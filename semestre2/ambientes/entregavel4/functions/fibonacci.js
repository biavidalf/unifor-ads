/*
  * Author: Beatriz Vidal
  * Description: Série de Fibonacci
*/

module.exports = function fibonacci(quantidadeTermos){
    let anterior = 0;
    let atual = 1;
    let resultado = "";

    for(let i = 0; i < quantidadeTermos; i++){
      if(i == 0){
        resultado +=  "0, ";
      }else if(i == quantidadeTermos - 1){
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