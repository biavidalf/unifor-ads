
public abstract class Livro {
	private String titulo;
	private Double preco;
	private Autor autor;
	private int ano;
	
	public Livro(Autor autor) {
		this.autor = autor;
	}
	public Livro(String titulo, Double preco, Autor autor, int ano) {
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
		this.ano = ano;
	}


	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Detalhes do livro:");
		System.out.println("Titulo: " + titulo);
		System.out.println("Valor: " + preco);
		System.out.println("Autor: " + autor.getNome());
		System.out.println("Ano: " + ano);
	}
	
}
