import java.util.Scanner;

public class TesteMenu {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		Menu m = new Menu("Exercicio 1", 4);
		
		int opcao;
		
		do {
			opcao = m.lerOpcao();
			switch(opcao) {
				case 1:
					System.out.println("ALTERNATIVA 1: Hello World!");
					break;
				case 2:
					System.out.println("Digite o primeiro valor: ");
					Float valor1 = Float.parseFloat(sc1.nextLine());
					
					System.out.println("Digite o primeiro valor: ");
					Float valor2 = Float.parseFloat(sc1.nextLine());
					System.out.println("ALTERNATIVA 2: A soma de " + valor1 + " com " + valor2 + " é igual a: " + (valor1 + valor2));
					break;
				case 3:
					System.out.println("Digite o primeiro valor: ");
					Float numero1 = Float.parseFloat(sc1.nextLine());
					
					System.out.println("Digite o primeiro valor: ");
					Float numero2 = Float.parseFloat(sc1.nextLine());
					if(numero1 > numero2) {
						System.out.println("ALTERNATIVA 3: O primero valor é maior");
					}else if(numero2 > numero1) {
						System.out.println("ALTERNATIVA 3: O segundo valor é maior");
					}else {
						System.out.println("ALTERNATIVA 3: Os valores são iguais");
					}
					break;			
			}
		}while(opcao != 4);
		System.out.println("Obrigada por utilizar nosso serviço, até mais! :)");
	}
}
