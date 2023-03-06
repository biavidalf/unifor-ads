class DLink<E> {
	private E element; // Valor para este nó
  private DLink<E> next; // Referência para o próximo nó na lista
  private DLink<E> prev; // Referência para o nó anterior da lista

  // Construtores
  DLink(E it, DLink<E> n, DLink<E> p) { element = it; next = n; prev = p; }
  DLink(DLink<E> n, DLink<E> p) { next = n; prev = p; }

	// Métodos
  DLink<E> next() { return next; }
  DLink<E> setNext(DLink<E> nextval) { return next = nextval; }

  DLink<E> prev() { return prev; }
  DLink<E> setPrev(DLink<E> prevval) { return prev = prevval; }

  E element() { return element; }
  E setElement(E it) { return element = it; }
}
