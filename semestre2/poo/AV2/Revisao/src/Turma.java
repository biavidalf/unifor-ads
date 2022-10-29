import java.util.ArrayList;

public class Turma {
	private Integer id;
	private ArrayList<Aluno> alunos;
	private String horarios;
	private int capacidade;
	
	public Turma(Integer id, String horarios, int capacidade) {
		alunos = new ArrayList<Aluno>(capacidade);
		this.id = id;
		this.horarios = horarios;
		this.capacidade = capacidade;
	}
	
	public boolean adicionarAluno(Aluno a) {
		if(alunos.size() < capacidade) {
			alunos.add(a);
			return true;
		}
		return false;
	}
	
	public boolean removerAluno(Aluno a) {
		if(alunos.size() > 0 && alunos.contains(a)) {
			alunos.remove(a);
			return true;
		}
		return false;
	}
	
	public void listarTurma() {
		System.out.println("Alunos matriculados na turma "+ id + ": ");
		for (Aluno aluno : alunos) {
			aluno.exibirDados();
		}
	}

	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	
}
