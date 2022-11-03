package unifly;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aviao {
	private String prefixo;
	private String modelo;
	private String fabricante;
	private int qtdVoos;
	public int qtdLugares;
	private ArrayList<Voo> voos;

	
	public Aviao(String prefixo, String modelo, String fabricante, int qtdVoos, int qtdLugares) {
		super();
		this.prefixo = prefixo;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.qtdVoos = qtdVoos;
		this.qtdLugares = qtdLugares;
		this.voos = new ArrayList<Voo>();
	}
	
	public void listarVoos() {
		System.out.println("Voos disponíveis: ");
		System.out.println("========================================");
		for (Voo voo : voos) {
			voo.mostrarVoo();
		    System.out.println("----------------------------------------");
		}
		System.out.println("========================================");
	}
	
	public boolean CadastrarVoo(Voo voo) {
		if(voos.size() < qtdVoos) {
			voos.add(voo);
			return true;
		}
		return false;
	}
	
	public void buscarVoos(String tipo, String opcao){
		ArrayList<Voo> voos = new ArrayList<>();
		
		for (Voo voo : this.voos) {
			if(tipo == "data" && voo.getDataVoo().equals(LocalDate.parse(opcao))) {
				voos.add(voo);
			}else if(tipo == "nrVoo" && voo.getNrVoo().equals(opcao)) {
				voos.add(voo);
			}else if(tipo == "origem" && voo.getOrigem().equals(opcao)) {
				voos.add(voo);
			}
		}
		
		if(voos.size() > 0) {
			System.out.println("Voos encontrados: ");
			for (Voo voo : voos) {
				voo.mostrarVoo();
			}
		}else {
			System.out.println("Nenhum voo encontrado");
		}
	}

	
	public ArrayList<Voo> getVoos() {
		return voos;
	}

	
}
