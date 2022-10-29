
public class TesteTurma {
	public static void main(String[] args) {
		// Criação de alunos
		Aluno a1 = new Aluno("1", "Beatriz Vidal");
		Aluno a2 = new Aluno("2", "Mikael Oliveira");
		Aluno a3 = new Aluno("3", "Victor Kaua");
		
		// Manipulção da turma
		Turma turma = new Turma(1, "AB", 2);
		System.out.println(turma.removerAluno(a1));
		System.out.println(turma.adicionarAluno(a1));
		System.out.println(turma.adicionarAluno(a2));
		System.out.println(turma.adicionarAluno(a3));
	}
	
}
