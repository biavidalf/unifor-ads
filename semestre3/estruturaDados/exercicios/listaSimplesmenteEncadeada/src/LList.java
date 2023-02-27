// Implementação da lista ligada
class LList<E> implements List<E>{
	private Link<E> head; // Referência para o cabeça da lista
	private Link<E> tail; // Referência para o último elemento
	protected Link<E> curr; // Referência para o elemento 	corrente
	int cnt; // Tamanho da lista

    // Construtores
	LList(int size){this();} // Construtor - Ignore size
	LList() {
		curr = tail = head = new Link<E>(null); // Cria as três referências
		cnt = 0;
	}

	//Remove todos elementos
	public void clear() {
		head.setNext(null); // Limpa as ligações
		curr = tail = head = new Link<E>(null); // Cria as três referências
		cnt = 0;
	}

	// Insere "it" na posição corrente
	public void insert(E it) {
		curr.setNext(new Link<E>(it, curr.next()));
		if (tail == curr) tail = curr.next(); // Nova cauda
		cnt++;
	}
	
	public void append(E it) {
		tail = tail.setNext(new Link<E>(it, null));
		cnt++;
	}

	//Seta curr para o inicio da lista
	public void moveToStart(){
		curr = head;
	}

	// Remove e retorna o elemento corrente
	public E remove(){
		if (curr.next() == null) return null; // Nada para remover
		E it = curr.next().element(); // Lembrar valor
		if (tail == curr.next()) tail = curr; // Removido último
		curr.setNext(curr.next().next()); // Remove da lista
		cnt--; // Decrementa o tamanho da lista
		return it; // Retorna o valor
	}

	//Seta curr para o final da lista
	public void moveToEnd()	{ curr = tail; }
	
	// Move curr um passo para esquerda; nenhuma mudança se é o início
	public void prev() {
		if (curr == head) return; // Não há elemento anterior
		Link<E> temp = head;
		// Procura até encontrar o elemento anterior
		while (temp.next() != curr) temp = temp.next();
		curr = temp;
	}

	// Move curr um passo para direita; nenhuma mudança se é o final
	public void next() {
		if (curr != tail) curr = curr.next();
	}
	
	// Tamanho da lista
	public int length() { return cnt; }
	
	// Retorna a posição do elemento corrente
	public int currPos() {
		Link<E> temp = head;
		int i;
		for (i=0; curr != temp; i++) temp = temp.next();
		return i;
	}

	// Movimenta para a posição "pos"
	public void moveToPos(int pos) {
		if (!((pos>=0) && (pos<=cnt))) {
			System.out.println("Posição fora do intervalo !!");
		}else {
			curr = head;
			for(int i=0; i<pos; i++) curr = curr.next();
		}
    }

	//Retorna o elemento corrente
	public E getValue() {
		if(curr.next() == null) return null;
		return curr.next().element();
	}
}