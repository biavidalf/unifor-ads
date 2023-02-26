/*
 * Exercício 2 lista estática:
 * find(E) para procurar um elemento na lista.
 * sort() para ordenar os elementos da lista.
 * */

class AList<E> implements List<E> {
	private static final int defaultSize = 10; // Tamanho padrão
	private int maxSize; // Tamanho máximo da lista
	private int listSize; // Número de elementos agora
	private int curr; // Posição corrente do elemento
	private E[] listArray; // Array que armazena os elementos

	/** Construtores */
	/** Cria uma lista com uma capacidade default */
	AList() { this(defaultSize); }
	
	/** Cria uma lista com capacidade definida. */
	AList(int size) {
		maxSize = size;
		listSize = curr = 0;
		listArray = (E[])new Object[size];
	}

	/** Limpa a lista */
	public void clear() { listSize = curr = 0; }
	
	/** Insere "it" na posição corrente */
	public void insert(E it) {
		if (listSize+1 > maxSize) {
			System.out.println("Capacidade máxima "+maxSize+" da lista excedida ! ");
		}else {
			for (int i=listSize; i>curr; i--){
				listArray[i] = listArray[i-1];
			}
			listArray[curr] = it;
			listSize++;
			System.out.println("Elemento "+it+" inserido na lista!");
		}
	}

	public void append(E it) {
		if (listSize+1 > maxSize) System.out.println("Capacidade máxima	"+maxSize+" da lista excedida ! ");
		else {
			listArray[listSize++] = it;
			System.out.println("Elemento "+it+" inserido no final da lista!");
		}
	}

	public void moveToStart() { curr = 0; }

	//Remove e retorna i elemento corrente
	public E remove() {
		if ((curr<0) || (curr>=listSize)) return null; // Não há elemento corrente
		E it = listArray[curr]; // Copia o elemento
		for(int i=curr; i<listSize-1; i++) listArray[i] = listArray[i+1];
		listSize--; // Diminui o tamanho
		System.out.println("Elemento "+it+" removido da lista!");
		return it;
	}

	public void moveToEnd() { curr = listSize; }
	public void prev() { if (curr != 0) curr--; }
	public void next() { if (curr < listSize) curr++;}; 
	public int length() { return listSize; }
	public int currPos() { return curr; }

	//Seta a posição corrente para "pos"
	public void moveToPos(int pos) {
		if (!(pos>=0 && pos<=listSize)) System.out.println("Posição "+pos+" fora do intervalo !");
		else curr=pos;
	}

	//Retorna o elemento corrente
	public E getValue() {
		if (!(curr>=0 && curr<listSize)) System.out.println("Não retorna o elemento corrente !");
		return listArray[curr];
	}
	
	// EXERCÍCIO 2
	// find(E) para procurar um elemento na lista.
	public E find(E element) {
		if(listSize < 1) {
			System.out.println("Lista vazia");
			return null;
		}
		for (int i = 0; i < listSize; i++) {
			if(listArray[i].equals(element)) return element;
		}
		System.out.println("Elemento não encontrado");
		return null;		
	}
	
	// sort() para ordenar os elementos da lista.
}