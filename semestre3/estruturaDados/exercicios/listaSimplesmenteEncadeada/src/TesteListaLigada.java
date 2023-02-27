/* 
 * Exercício 1 - Lista Ligada:
    - Inclua dois elementos no início da lista;
    – Inclua quatro elementos no final da lista;
    – Imprima a lista;
    – Remova o quinto elemento;
    – Limpe a lista;
    – Imprima a lista
 */

public class TesteListaLigada {
    public static void main(String[] args) {
        LList<String> lista = new LList<>();

        lista.insert("Beatriz");
        lista.insert("Vidal");
        lista.moveToPos(0);
        System.out.println(lista.getValue());

        lista.append("Layla");
        lista.append("Jamille");
        lista.append("Bia");
        lista.append("Alencar");

        /* lista.moveToPos(0);
		for(int i = 0; i < lista.length(); i++) {
			System.out.println(lista.getValue());
			lista.moveToPos(i + 1);
		}

        lista.moveToPos(4);
        lista.remove();

        lista.clear(); */
    }
}
