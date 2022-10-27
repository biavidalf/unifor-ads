public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nAV2: Lista de exercicios numero 2");

        System.out.println("\n==================== Elevador: ====================");
        // Elevador
        Elevador elevador = new Elevador(4, 3);

        elevador.entra();
        elevador.sai();
        elevador.entra();
        elevador.sobe();
        elevador.desce();
        elevador.desce();
        
        System.out.println("\n==================== Televisao: ====================");
        // Televisão
        Televisao televisao = new Televisao(0, 100, 1, 20);
        ControleRemoto controle = new ControleRemoto(televisao);
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.aumentarCanal();
        controle.diminuirCanal();
        controle.mudarCanal(10);
        controle.mudarCanal(54);
    }
}

// Testes
    /* elevador.entra();
    elevador.entra();
    elevador.entra();
    elevador.entra(); 
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
    */