package unifly;

import java.time.LocalDate;

public class Voo {
	private LocalDate dataVoo;
	private String destino;
	private String origem;
	private String nrVoo;
	private int qtdLugares;
	private int qtdMaxLugares;
	
	public Voo(LocalDate dataVoo, String destino, String origem, String nrVoo, int qtdMaxLugares) {
		super();
		this.dataVoo = dataVoo;
		this.destino = destino;
		this.origem = origem;
		this.nrVoo = nrVoo;
		this.qtdLugares = qtdMaxLugares;
		this.qtdMaxLugares = qtdMaxLugares;
	}

	public boolean efetuarReserva() {
		if(qtdLugares > 0) {
			qtdLugares--;
			return true;
		}
		return false;
	}
	
	public boolean cancelarReserva() {
		if(qtdLugares < qtdMaxLugares) {			
			qtdLugares++;
			return true;
		}
		return false;
	}
	
	public void mostrarVoo() {
		System.out.println("Voo " + nrVoo + " - " + qtdLugares + " lugares disponíveis");
		System.out.println(dataVoo + " | " + origem + " -> " + destino);
	}
	
	// Getters
	public String getOrigem() {
		return origem;
	}

	public int getQtdLugares() {
		return qtdLugares;
	}

	public LocalDate getDataVoo() {
		return dataVoo;
	}

	public String getDestino() {
		return destino;
	}

	public String getNrVoo() {
		return nrVoo;
	}
}
