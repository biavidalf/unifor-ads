
public class Aluno extends Pessoa {
	String curso;
	String turno;
	
	public Aluno(String matricula, String nome, String email, String telefone, String curso, String turno) {
		super(matricula, nome, email, telefone);
		this.curso = curso;
		this.turno = turno;
	}
	
	
}
