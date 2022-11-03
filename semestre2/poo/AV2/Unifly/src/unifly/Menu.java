package unifly;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private String titulo;
	private ArrayList<String> alternativas;
	
	public Menu(String titulo, ArrayList<String> alternativas){
		this.titulo = titulo;
		this.alternativas = alternativas;
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
			System.out.println("Digite a opcao desejada: ");
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
