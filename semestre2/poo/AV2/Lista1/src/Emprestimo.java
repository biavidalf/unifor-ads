package Lista1;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
	private List<Livro> livros;
	private Pessoa pessoa;
	private int prazo;
	private boolean devolvidos;
	private boolean finalizado;
	
	public Emprestimo() {
		this.livros = new ArrayList<Livro>();
		this.prazo = 0;
		this.devolvidos = false;
		this.finalizado = false;
	}
	
	// FUNÇÕES DE LIVRO
	public void relacaoLivros() {
		for(int i = 0; i < livros.size(); i++) {
			System.out.println((i+1) + ": " + livros.get(i).titulo);
		}
	}
	public void adicionarLivro(Livro livro) throws Exception {
		if(!finalizado) {
			if(this.pessoa instanceof Aluno && livros.size() < 3) {
				livros.add(livro);
				//System.out.println("Livro " + livro.titulo + " adicionado com sucesso");
			}else if(this.pessoa instanceof Professor && livros.size() < 5) {
				livros.add(livro);
				//System.out.println("Livro " + livro.titulo + " adicionado com sucesso");
			}else {
				// ERRO DE THROW - TRATAÇÃO DE ERRO - NÚMERO MÁXIMO DE LIVROS ATINGIDOS
				throw new Exception("Número maximo de livros atingidos!!!");
			}
		}else {
			System.out.println("O empréstimo já foi finalizado, não é mais possível adicionar livros.");
		}
		
	}
	public void devolverLivro(Livro livro) {
		if(finalizado) {
			if(this.livros.size()  == 0) {
				System.out.println("Todos os livros já foram devolvidos.");
			}else if(this.livros.size() > 0) {
				boolean remocao = this.removerLivro(livro.codigo); 
				if(remocao) {
					System.out.println("Livro " + livro.codigo + " removido com sucesso");
				}else {
					System.out.println("Livro não encontrado na lista de livros do empréstimo");
				}
				if(this.livros.size()  == 0) {
					this.setDevolvidos(true);
					System.out.println("Todos os livros devolvidos.");
				}
			}
			
		}
	}
	private boolean removerLivro(int codigo) {
		for(int i = 0; i < livros.size(); i++) {
			if(livros.get(i).codigo == codigo) {
				this.livros.remove(livros.get(i));
				return true;
			}
		}
		return false;
	}
	
	// PRAZO
	public void calcularPrazo() {
		if(this.pessoa instanceof Aluno) {
			this.setPrazo(10);
		}else if(this.pessoa instanceof Professor) {
			this.setPrazo(30);
		}
	}
	
	// FINALIZAR EMPRÉSTIMO
	public void finalizarEmprestimo() {
		this.calcularPrazo();
		this.setFinalizado(true);
		this.status();
	}
	
	// STATUS DO EMPRÉSTIMO
	public void status() {
		System.out.println("\nEmpréstimo fechado: " + (this.finalizado ? "Sim" : "Não"));
		System.out.println("Empréstimo pertencente a: " + this.getPessoa().nome);
		System.out.println("Livros em posse do usuário: ");
		if(this.livros.size() > 0)
			this.relacaoLivros();
		else
			System.out.println("Nenhum");
		System.out.println("Prazo de devolução: " + this.getPrazo() + " dias.");
		System.out.println("Todos os livros devolvidos: " + (this.devolvidos ? "Sim" : "Não"));
	}
	
	// Getters e Setters
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		if(!finalizado) {
			for(Livro livro : livros) {
				try {
					adicionarLivro(livro);
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }
				
			}
		}
		
	}

	
	public boolean isDevolvidos() {
		return devolvidos;
	}

	public void setDevolvidos(boolean devolvidos) {
		this.devolvidos = devolvidos;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		if(pessoa instanceof Aluno) {
			this.pessoa = pessoa;
		}else if(pessoa instanceof Professor) {
			this.pessoa = pessoa;
		}else {
			System.out.println("Para realizar empréstimos é necessário ser Aluno ou Professor.");
		}
	}

	
	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	
	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

}
