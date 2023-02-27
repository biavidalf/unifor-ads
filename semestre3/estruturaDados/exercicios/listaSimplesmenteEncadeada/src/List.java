public interface List<E>{
	// limpa a lista
	public void clear();
	
	// insere um elemento
	public void insert (E item);
	
	// insere um elemento no final da lista
	public void append (E item);
	
	// remove e retorna o elemento corrente
	public E remove();
	
	// move para o início da lista
	public void moveToStart();
	
	// move para o final da lista
	public void moveToEnd();
	
	// move uma posição para esquerda se
	// não estiver no início da lista
	public void prev();
	
	// move uma posição para direita se
	// não estiver no final da lista
	public void next();
	
	// Retorna a posição do elemento corrente
	public int currPos();
	
	// Move para uma determinada posição
	public void moveToPos(int pos);
	
	// Retorna o elemento corrente
	public E getValue();
}
