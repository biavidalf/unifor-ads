package unifly;

import java.time.LocalDate;

public class Teste2 {
	public static void main(String[] args) {
		Aviao aviao = new Aviao("123", "amc", "latam", 3, 4);
		
		Voo voo = new Voo(LocalDate.parse("2022-12-10"), "Pernambuco", "Fortaleza", "1", 4);

		aviao.CadastrarVoo(voo);
		
		aviao.buscarVoos("data", "2022-12-10");
	}
	
}
