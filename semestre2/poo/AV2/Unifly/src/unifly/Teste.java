package unifly;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;

public class Teste {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		Menu m = new Menu("Menu", new ArrayList<String>(Arrays.asList("Cadastrar Aviao", "Cadastrar Voo", "Efetuar Reserva", "Cancelar Reserva", "Listar Voos", "Sair")));
		
		// Prefixo e aviao
		Map<String, Aviao> avioes = new HashMap<>();
		
		// nrVoo e voo
		Map<String, Voo> voos = new HashMap<>();
		
		int opcao;
		
		do {
			opcao = m.lerOpcao();
			switch(opcao) {
				case 1:
					System.out.println("ALTERNATIVA 1: " + m.getAlternativa(1));
					System.out.println("Digite o prefixo do aviao: ");
					String prefixo = sc1.nextLine();
					
					if(!avioes.keySet().contains(prefixo)) {
						System.out.println("Digite o modelo do aviao: ");
						String modelo = sc1.nextLine();
						
						System.out.println("Digite o fabricante do aviao: ");
						String fabricante = sc1.nextLine();
						
						System.out.println("Digite o numero maximo de voos do aviao: ");
						Integer qtdVoos = receberInteiro(sc1.nextLine());
						
						System.out.println("Digite o numero maximo de lugares do aviao: ");
						Integer qtdLugares = receberInteiro(sc1.nextLine());

						Aviao aviao = new Aviao(prefixo, modelo, fabricante, qtdVoos, qtdLugares);
						avioes.put(prefixo, aviao);
						
						System.out.println("=> Aviao cadastrado com sucesso!");	
					}else {
						System.out.println("=> [!!ERRO!!] Aviao ja cadastrado.");
					}
					break;
				case 2:
					System.out.println("ALTERNATIVA 2:"  + m.getAlternativa(2));

					System.out.println("Digite o prefixo do aviao: ");
					String prefixoAviao = sc1.nextLine();
					
					if(avioes.keySet().contains(prefixoAviao)) {
						System.out.println("Digite o dia do voo: ");
						int dia = receberInteiro(sc1.nextLine());
						
						System.out.println("Digite o mes do voo: ");
						int mes = receberInteiro(sc1.nextLine());
						
						System.out.println("Digite o ano do voo: ");
						int ano = receberInteiro(sc1.nextLine());
						
						LocalDate dataVoo = LocalDate.of(ano, mes, dia);
						
						System.out.println("Digite o destino do voo: ");
						String destino = sc1.nextLine();

						System.out.println("Digite a origem do voo: ");
						String origem = sc1.nextLine();
						
						System.out.println("Digite o numero do voo: ");
						String nrVoo = sc1.nextLine();
						
						Integer qtdMaxLugares = avioes.get(prefixoAviao).qtdLugares;

						Voo voo = new Voo(dataVoo, destino, origem, nrVoo, qtdMaxLugares);
						if(avioes.get(prefixoAviao).CadastrarVoo(voo)) {
							voos.put(nrVoo, voo);
							System.out.println("=> Voo cadastrado com sucesso!");								
						}else {
							System.out.println("=> [!!ERRO!!] Quantidade máxima de voos para o avião escolhido já atingida");
						}
					}else {
						System.out.println("=> [!!ERRO!!] Aviao invalido.");
					}
					break;
				case 3:
					System.out.println("ALTERNATIVA 3:"  + m.getAlternativa(3));

					System.out.println("Digite o prefixo do aviao: ");
					String idAviao = sc1.nextLine();
					
					// Se o aviao estiver cadastrado
					if(avioes.keySet().contains(idAviao)) {
						avioes.get(idAviao).listarVoos();
						System.out.println("\nInsira o numero do voo que deseja efetuar a reserva:");
						String idVoo = sc1.nextLine();
						
						// Se o voo escolhido estivar cadastrado no aviao escolhido
						if(avioes.get(idAviao).getVoos().contains(voos.get(idVoo))) {
							
							// Reservado com sucesso
							if(voos.get(idVoo).efetuarReserva()) {
								System.out.println("Reserva Confirmada");
							}else {
								System.out.println("Voo Lotado");
							}
						}else {
							System.out.println("Voo inexistente");
						}
					}
					
					break;			
				case 4:
					System.out.println("ALTERNATIVA 4:"  + m.getAlternativa(4));
					
					System.out.println("Digite o prefixo do aviao: ");
					String idAviao2 = sc1.nextLine();
					
					// Se o aviao estiver cadastrado
					if(avioes.keySet().contains(idAviao2)) {
						avioes.get(idAviao2).listarVoos();
						System.out.println("\nInsira o numero do voo que deseja cancelar a reserva:");
						String idVoo2 = sc1.nextLine();
						
						// Se o voo escolhido estivar cadastrado no aviao escolhido
						if(avioes.get(idAviao2).getVoos().contains(voos.get(idVoo2))) {
							
							// Reservado com sucesso
							if(voos.get(idVoo2).cancelarReserva()) {
								System.out.println("Reserva Cancelada");
							}else {
								System.out.println("Erro ao cancelar reserva");
							}
						}else {
							System.out.println("Voo inexistente");
						}
					}
					break;
				case 5:
					System.out.println("ALTERNATIVA 5:"  + m.getAlternativa(5));

					System.out.println("Digite o prefixo do aviao: ");
					String idAviao3 = sc1.nextLine();
					
					// Se o aviao estiver cadastrado
					if(avioes.keySet().contains(idAviao3)) {
						System.out.println("Deseja consultar voos por qual categoria? ");
						System.out.println("1 - Por Data");
						System.out.println("2 - Por Número do Voo");
						System.out.println("3 - Por Origem");
						System.out.println("Digite o número da sua escolha: ");
						int escolha = receberInteiro(sc1.nextLine());
						
						if(escolha == 1) {
							System.out.println("Digite o dia do voo: ");
							int dia2 = receberInteiro(sc1.nextLine());
							
							System.out.println("Digite o mes do voo: ");
							int mes2 = receberInteiro(sc1.nextLine());
							
							System.out.println("Digite o ano do voo: ");
							int ano2 = receberInteiro(sc1.nextLine());
							
							String date = ano2 + "-" + mes2 + "-" + dia2;
							avioes.get(idAviao3).buscarVoos("data", date);
						}else if(escolha == 2) {
							System.out.println("Digite o numero do voo: ");
							String nrVoo3 = sc1.nextLine();
							
							avioes.get(idAviao3).buscarVoos("nrVoo", nrVoo3);
						}else if(escolha == 3) {
							System.out.println("Digite a origem do voo: ");
							String origem3 = sc1.nextLine();
							
							avioes.get(idAviao3).buscarVoos("origem", origem3);
						}else {
							System.out.println("Escolha inválida");
						}
					}else {
						System.out.println("Aviao nao encontrado");
					}
					break;
			}
		}while(opcao != 6);
		System.out.println("Obrigada por utilizar nosso servico, ate mais! :)");
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
