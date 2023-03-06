public class Teste {
	public static void main(String[] args) {
		DDList<String> lista = new DDList<>();
		
		lista.insert("Beatriz");
        lista.insert("Vidal");
        lista.moveToPos(0);
        System.out.println(lista.getValue());

        lista.append("Layla");
        lista.append("Jamille");
        lista.append("Bia");
        lista.append("Alencar");

        lista.moveToPos(0);
		for(int i = 0; i < lista.length(); i++) {
			System.out.println(lista.getValue());
			lista.moveToPos(i + 1);
		}

		System.out.println("Tamanho da lista: " + lista.length());
        
		lista.moveToPos(4);
        lista.remove();
		System.out.println("Tamanho da lista: " + lista.length());

        lista.clear();
		System.out.println("Tamanho da lista: " + lista.length());
	}
}
