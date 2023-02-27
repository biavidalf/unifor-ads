// Lista simplesmente encadeada com suporte a freelist
class Link<E>{
	// Atributos 
	private E element; // Valor para este nó
	private Link<E> next; // Aponta para o próximo nó na lista
	 
	// Construtores
	Link(E it, Link<E> nextval) {E element = it; next = nextval;}
	Link(Link<E> nextval) { next= nextval; }
	 
	// Métodos
	Link<E> next() {return next;}
	Link<E> setNext(Link<E> nextval){return next = nextval;}
    E element() { return element; }
    E setElement(E it){ return element = it; }

	// Extensões para suportar freelists
	static Link freelist = null; // Freelist para a classe

	// Pega o próximo novo link
	static <E> Link<E> get(E it, Link<E> nextval) {
		if (freelist == null) return new Link<E>(it, nextval); // Pega do "new"
		
		Link<E> temp = freelist; // Pega da freelist
		freelist = freelist.next();
		temp.setElement(it);
		temp.setNext(nextval);
		return temp;
	}

	//Retorna Link para freelist
	void release() {
		element = null; // Dropa referencia do elemento
		next = freelist;
		freelist = this;
	}
}