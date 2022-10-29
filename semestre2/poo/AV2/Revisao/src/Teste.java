import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Digite o titulo do menu: ");
		String titulo = sc1.nextLine();
		
		System.out.println("Digite a capacidade de alternativas do menu: ");
		int capacidade= Integer.parseInt(sc1.nextLine());
		
		Menu m = new Menu(titulo, capacidade);
		
		// Codigo e turma
		Map<Integer, Turma> turmas = new HashMap<>();
		
		// Matricula e aluno
		Map<String, Aluno> alunos = new HashMap<>();
		
		int opcao;
		
		do {
			opcao = m.lerOpcao();
			switch(opcao) {
				case 1:
					System.out.println("ALTERNATIVA 1: " + m.getAlternativa(1));
					System.out.println("Digite o código da turma: ");
					Integer codigo = receberInteiro(sc1.nextLine());
					
					System.out.println("Digite os horarios da turma: ");
					String horarios = sc1.nextLine();
					
					System.out.println("Digite a capacidade da turma: ");
					int capacidadeTurma = receberInteiro(sc1.nextLine());
					
					if(codigo > -1 && capacidadeTurma > 0) {
						Turma turma = new Turma(codigo, horarios, capacidadeTurma);
						turmas.put(codigo, turma);
						
						System.out.println("=> Turma cadastrada com sucesso!");	
					}else {
						System.out.println("=> [!!ERRO!!] Erro ao cadastrar turma, codigo ou capacidade inválido.");
					}
					
					break;
				case 2:
					System.out.println("ALTERNATIVA 2:"  + m.getAlternativa(2));

					System.out.println("Digite a matricula do aluno: ");
					String matricula = sc1.nextLine();
					
					System.out.println("Digite o nome do aluno: ");
					String nome = sc1.nextLine();
					
					Aluno aluno = new Aluno(matricula, nome);
					alunos.put(matricula, aluno);
					
					System.out.println("=> Aluno cadastrado com sucesso!");
					break;
				case 3:
					System.out.println("ALTERNATIVA 3:"  + m.getAlternativa(3));
					
					System.out.println("Digite o código da turma: ");
					Integer codigoTurma = receberInteiro(sc1.nextLine());
					
					System.out.println("Digite a matricula do aluno: ");
					String matriculaAluno = sc1.nextLine();
					
					if(turmas.containsKey(codigoTurma) && alunos.containsKey(matriculaAluno)) {
						turmas.get(codigoTurma).adicionarAluno(alunos.get(matriculaAluno));
						System.out.println("=> Aluno matriculado na turma com sucesso!");
					}else {
						System.out.println("=> Turma ou Aluno inválido.");
					}
					
					break;			
				case 4:
					System.out.println("ALTERNATIVA 4:"  + m.getAlternativa(4));
					
					System.out.println("Digite o código da turma: ");
					Integer codigoTurmaRemover = receberInteiro(sc1.nextLine());
					
					System.out.println("Digite a matricula do aluno: ");
					String matriculaAlunoRemover = sc1.nextLine();
					
					if(turmas.containsKey(codigoTurmaRemover) && alunos.containsKey(matriculaAlunoRemover) && turmas.get(codigoTurmaRemover).getAlunos().contains(alunos.get(matriculaAlunoRemover))) {
						turmas.get(codigoTurmaRemover).removerAluno(alunos.get(matriculaAlunoRemover));
						System.out.println("=> Matricula do aluno na turma cancelado com sucesso!");
					}else {
						System.out.println("=> Turma ou Aluno inválido.");
					}
					break;
				case 5:
					System.out.println("ALTERNATIVA 5:"  + m.getAlternativa(5));
					
					System.out.println("Digite o código da turma: ");
					Integer codTurma = receberInteiro(sc1.nextLine());
					
					if(turmas.containsKey(codTurma)) {
						turmas.get(codTurma).listarTurma();
					}else{
						System.out.println("=> Turma não cadastrada");
					}
					
			}
		}while(opcao != 6);
		System.out.println("Obrigada por utilizar nosso serviço, até mais! :)");
	}
	
	public static int receberInteiro(String input) {
		int numConvertido;
		try {
			numConvertido = Integer.parseInt(input);
		}catch(Exception e) {
			numConvertido = -1;
		}
		return numConvertido;
	}
}
