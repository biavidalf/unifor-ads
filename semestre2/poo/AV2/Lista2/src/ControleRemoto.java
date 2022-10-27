public class ControleRemoto {
    private Televisao televisao;

    // Construtor
    public ControleRemoto(Televisao televisao){
        this.televisao = televisao;
    }

    // Aumentar e diminuir volume
    public void aumentarVolume(){
        if(televisao.getVolumeAtual() < televisao.getVolumeMax()){
            televisao.setVolumeAtual(televisao.getVolumeAtual() + 1);
            System.out.println("Volume: " + televisao.getVolumeAtual());
        }else{
            System.out.println("Erro ao aumentar volume: Volume maximo atingido (" + televisao.getVolumeAtual() + ")");
        }
    }
    public void diminuirVolume(){
        if(televisao.getVolumeAtual() > televisao.getVolumeMin()){
            televisao.setVolumeAtual(televisao.getVolumeAtual() - 1);
            System.out.println("Volume: " + televisao.getVolumeAtual());
        }else{
            System.out.println("Erro ao diminuir volume: Volume mínimo atingido (" + televisao.getVolumeAtual() + ")");
        }
    }

    // Mudança de canal
    public void aumentarCanal(){
        if(televisao.getCanalAtual() < televisao.getCanalMax()){
            televisao.setCanalAtual(televisao.getCanalAtual() + 1);
            System.out.println("Canal: " + televisao.getCanalAtual());
        }else{
            System.out.println("Erro ao aumentar canal: Canal maximo atingido (" + televisao.getCanalAtual() + ")");
        }
    }
    public void diminuirCanal(){
        if(televisao.getCanalAtual() > televisao.getCanalMin()){
            televisao.setCanalAtual(televisao.getCanalAtual() - 1);
            System.out.println("Canal: " + televisao.getCanalAtual());
        }else{
            System.out.println("Erro ao diminuir canal: Canal minimo atingido (" + televisao.getCanalAtual() + ")");
        }
    }
    public void mudarCanal(int novoCanal){
        if(novoCanal > televisao.getCanalMin() && novoCanal < televisao.getCanalMax()){
            televisao.setCanalAtual(novoCanal);
            System.out.println("Canal: " + televisao.getCanalAtual());
        }else{
            System.out.println("Erro ao mudar de canal: Canal nao existe.");
        }
    }


    // Getters e Setters
    public Televisao getTelevisao() {
        return televisao;
    }
    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }
}
