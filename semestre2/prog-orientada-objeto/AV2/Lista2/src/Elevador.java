public class Elevador{
    private int andarAtual;
    private int andaresTotal;
    private int capacidadeAtual;
    private int capacidadeMaxima;

    // Inicializa
    public Elevador(int capacidadeMaxima, int andaresTotal){
        this.andaresTotal = andaresTotal;
        andarAtual = 0; // Iniciando no térreo
        
        this.capacidadeMaxima = capacidadeMaxima;
        capacidadeAtual = 0; // Iniciando vazio
    }

    // Entrada e saída de pessoas
    public void entra(){
        if(capacidadeAtual < capacidadeMaxima){
            capacidadeAtual++;
            System.out.println("Capacidade restante: " + (capacidadeMaxima - capacidadeAtual));
        }else{
            System.out.println("Erro ao entrar: Capacidade maxima atingida.");
        }
    }
    public void sai(){
        if(capacidadeAtual > 0){
            capacidadeAtual--;
            System.out.println("Capacidade restante: " + (capacidadeMaxima - capacidadeAtual));
        }else{
            System.out.println("Erro ao sair: Elevador esta vazio.");
        }
    }

    // Mudança de andar
    public void sobe(){
        if(andarAtual < andaresTotal){
            andarAtual++;
            System.out.println("Andar: " + andarAtual);
        }else{
            System.out.println("Erro ao subir de andar: O andar atual eh o ultimo.");
        }
    }
    public void desce(){
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("Andar: " + andarAtual);
        }else{
            System.out.println("Erro ao descer de andar: O andar atual eh o terreo.");
        }
    }


    // Getters e Setters
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndaresTotal() {
        return andaresTotal;
    }
    public void setAndaresTotal(int andaresTotal) {
        this.andaresTotal = andaresTotal;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }
    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
}