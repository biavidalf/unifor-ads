/*
  * Author: Beatriz Vidal
  * Description: Ordenar um vetor
*/

module.exports = function ordenarVetor(vetor) {
    let aux;

    // Ordenando
    for (let i = 0; i < vetor.length; i++) {
      for (let j = i + 1; j < vetor.length; j++) {
        if (vetor[i] > vetor[j]) {
          aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }

    return "-> R: Valores Ordenados: " + vetor;
}