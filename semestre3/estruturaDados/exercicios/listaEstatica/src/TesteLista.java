/*
 * Exercício 1 lista estática:
 * Inclua dois elementos no início da lista;
 * Inclua quatro elementos no final da lista;
 * Imprima a lista;
 * Remova o quinto elemento;
 * Limpe a lista;
 * Imprima a lista. 
 */

public class TesteLista {
	public static void main(String[] args) {
		AList<String> listaEstatica = new AList<String>();
		
		// Incluir dois elementos no início da lista
		listaEstatica.insert("0 Beatriz");
		listaEstatica.insert("1 Vidal");
		
		// Inclua quatro elementos no final da lista;
		listaEstatica.append("2 Layla");
		listaEstatica.append("3 Jamille");
		listaEstatica.append("4 Bia");
		listaEstatica.append("5 Alencar");
		
		// Imprima a lista
		listaEstatica.moveToPos(0);
		for(int i = 0; i < listaEstatica.length(); i++) {
			System.out.println(listaEstatica.getValue());
			listaEstatica.moveToPos(i + 1);
		}
		
		// Remova o quinto elemento
		listaEstatica.moveToPos(4);
		listaEstatica.remove();
		
		// Imprima a lista
		listaEstatica.moveToPos(0);
		for(int i = 0; i < listaEstatica.length(); i++) {
			System.out.println(listaEstatica.getValue());
			listaEstatica.moveToPos(i + 1);
		}
		
		// Limpe a lista
		//listaEstatica.clear();

		// Imprima a lista
		listaEstatica.moveToPos(0);
		for(int i = 0; i < listaEstatica.length(); i++) {
			System.out.println(listaEstatica.getValue());
			listaEstatica.moveToPos(i + 1);
		}
		System.out.println("Tamanho da lista: " + listaEstatica.length());
		System.out.println("Find Vidal: " + listaEstatica.find("1 Vidal"));
	}
}
