
public class Teste {
	public static void main(String[] args) {
		Autor leo = new Autor("Leo", "123", "nao@digo.com");
		LivroFisico livro = new LivroFisico(leo);
		Livro l = new Ebook(leo);
	}
}
