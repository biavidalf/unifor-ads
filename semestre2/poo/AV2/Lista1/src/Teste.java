package Lista1;
public class Teste {
	public static void main(String[] args) throws Exception {
		// Livros
		Livro livro1 = new Livro(1, "Livro 1", "Autor 1", "2022", "1");
		Livro livro2 = new Livro(2, "Livro 2", "Autor 1", "2022", "1");
		Livro livro3 = new Livro(3, "Livro 3", "Autor 1", "2022", "1");
		Livro livro4 = new Livro(4, "Livro 4", "Autor 1", "2022", "1");
		Livro livro5 = new Livro(5, "Livro 5", "Autor 1", "2022", "1");
		
		// Alunos
		Aluno aluno1 = new Aluno("123", "Beatriz Vidal", "Gmail", "5585" , "ADS", "Noite");
		Aluno aluno2 = new Aluno("124", "Vidal Beatriz", "Gmail", "5585" , "CC", "Tarde");
		
		// Professor
		Professor professor1 = new Professor("213", "Leandro Taddeo", "Gmail", "1 909" , "Mestre");
		
		// Emprestimo aluno
		Emprestimo emprestimoA1 = new Emprestimo();
		emprestimoA1.setPessoa(aluno1);
		try {
			emprestimoA1.adicionarLivro(livro1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		emprestimoA1.finalizarEmprestimo();
		
		Emprestimo emprestimoA2 = new Emprestimo();
		emprestimoA2.setPessoa(aluno2);
		try {
			emprestimoA2.adicionarLivro(livro2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		emprestimoA2.finalizarEmprestimo();

		// Emprestimo professor
		Emprestimo emprestimoP1 = new Emprestimo();
		emprestimoP1.setPessoa(professor1);
		
		// ERRO DE THROW - TRATAÇÃO DE ERRO - NÚMERO MÁXIMO DE LIVROS ATINGIDOS
		try {
			emprestimoP1.adicionarLivro(livro3);
			emprestimoP1.adicionarLivro(livro4);
			emprestimoP1.adicionarLivro(livro5);
			emprestimoP1.adicionarLivro(livro5);
			emprestimoP1.adicionarLivro(livro5);
			emprestimoP1.adicionarLivro(livro5);
        } catch (Exception e) {
        	throw new Exception(e.getMessage());
        }
		emprestimoP1.finalizarEmprestimo();
		emprestimoP1.devolverLivro(livro3);
		
		// Status dos emprestimos
		emprestimoA1.status();
		emprestimoA2.status();
		emprestimoP1.status();
		
	}
}
