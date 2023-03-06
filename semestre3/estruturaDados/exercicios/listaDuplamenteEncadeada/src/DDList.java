public class DDList<E> implements List<E> {
	   private DLink<E> head; // Referência para o cabeça da lista
	   private DLink<E> tail; // Referência para o último elemento
	   protected DLink<E> curr; // Referência para o elemento corrente
	   int cnt; // Tamanho da lista
	  
	   DDList(int size) { this(); } // Construtor -- Ignore size
	   DDList() {
	     curr = tail = head = new DLink<E>(null,null,null); // Cria as três referências
	     cnt = 0;
	   }

	   // Insere "it" na posição corrente
	   public void insert(E it) {
	     curr.setNext(new DLink<E>(it, curr.next(), curr));
	     if (curr.next().next() != null) curr.next().next().setPrev(curr.next());
	     if (tail == curr) tail = curr.next(); // Nova cauda
	     cnt++;
	   }

	   // Insere "it" no final
	   public void append(E it) {
	     tail.setNext(new DLink<E>(it, null, tail));
	     tail = tail.next();
	     cnt++;
	   }

	   //Remove e retorna o primeiro elemento
	   public E remove() {
	     if (curr.next() == null) return null; // Nada a remover
	     E it = curr.next().element(); // Lembrar valor
	     if (curr.next().next() != null) curr.next().next().setPrev(curr);
	     else tail = curr; // Removido último objeto: setada cauda (set tail)
	     curr.setNext(curr.next().next()); // Remove da lista
	     cnt--;
	     return it; // Retorna valor removido
	   }

	   //Move curr um passo para esquerda; nenhuma mudança se no início
	   public void prev() {
	     if (curr != head) curr = curr.prev();
	   }
	  
	   public void next() {
	     if (curr !=tail ) curr=curr.next();
	   }
	  
	   public int length() { return cnt; }

	   public void clear() {
	     head.setNext(null); // Limpa as ligações
	     curr = tail = head = new DLink<E>(null,null,null); // Cria as três referências
	     cnt = 0;
	   }
	  
	   //Seta curr para o início da lista
	   public void moveToStart(){ curr = head; }
	  
	   //Seta curr para o final da lista
	   public void moveToEnd(){ curr = tail; }

	   //Retorna a posição do elemento corrente
	   public int currPos() {
	     DLink<E> temp = head;
	     int i;
	     for (i=0; curr != temp; i++) temp = temp.next();
	     return i;
	   }

	   //Movimenta para a posição "pos"
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