import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private String titulo;
	private ArrayList<String> alternativas;
	
	public Menu(String titulo, int qtdAlternativas){
		this.titulo = titulo;
		alternativas = new ArrayList<>(qtdAlternativas);

		if(qtdAlternativas > 0) {			
			populaAlternativas(qtdAlternativas);
		}
	}
	
	public void populaAlternativas(int qtdAlternativas) {
		Scanner sc1 = new Scanner(System.in);
		for(int i = 0; i < qtdAlternativas; i++) {
			System.out.println("Digite o texto da alternativa " + (i+1) + ": ");
			alternativas.add(sc1.nextLine());
		}
	}
	
	public int lerOpcao() {
		Scanner sc1 = new Scanner(System.in);
		int opcao = 0;
		
		do {			
			System.out.println("\n============================");
			System.out.println(titulo);
			System.out.println("============================");
			for(int i = 0; i < alternativas.size(); i++) {
				System.out.println((i+1) + ": " + alternativas.get(i));
			}
			System.out.println("============================");
			System.out.println("Digite a opção desejada: ");
			try {
				opcao = Integer.parseInt(sc1.nextLine());
			}catch(Exception e) {
				lerOpcao();
			}
				
		}while(opcao <= 0 || opcao > alternativas.size());
		
		return opcao;
	}

	public String getAlternativa(int index) {
		return alternativas.get((index - 1));
	}
}
