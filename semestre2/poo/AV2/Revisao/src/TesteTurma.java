
public class TesteTurma {
	public static void main(String[] args) {
		// Cria��o de alunos
		Aluno a1 = new Aluno("1", "Beatriz Vidal");
		Aluno a2 = new Aluno("2", "Mikael Oliveira");
		Aluno a3 = new Aluno("3", "Victor Kaua");
		
		// Manipul��o da turma
		Turma turma = new Turma(1, "AB", 2);
		System.out.println(turma.removerAluno(a1));
		System.out.println(turma.adicionarAluno(a1));
		System.out.println(turma.adicionarAluno(a2));
		System.out.println(turma.adicionarAluno(a3));
	}
	
}
