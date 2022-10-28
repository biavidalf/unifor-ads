/*
  * Author: Beatriz Vidal
  * Description: Contar os números inteiros
*/

export function contagem(numeros) {
  let contagem = 0;

  for(let i = 0; i < numeros.length; i++){
    let atual = numeros[i];
    if(isInteiro(atual)){
      contagem++;
    }
  }
  return "Quantidade de números inteiros: " + contagem;

  function isInteiro(numero){
      let fracionada = parseInt(Math.round((numero - parseInt(numero)) * 100));
      return fracionada == 0 ? true : false;
  }
}