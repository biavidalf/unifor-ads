
public class Professor extends Pessoa {
	String titulacao;

	public Professor(String matricula, String nome, String email, String telefone, String titulacao) {
		super(matricula, nome, email, telefone);
		this.titulacao = titulacao;
	}
	
}
