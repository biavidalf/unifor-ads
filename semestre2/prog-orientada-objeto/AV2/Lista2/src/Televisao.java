public class Televisao {
    private int volumeMin;
    private int volumeMax;
    private int volumeAtual;

    private int canalMin;
    private int canalMax;
    private int canalAtual;

    // Construtor
    public Televisao(int volumeMin, int volumeMax, int canalMin, int canalMax) {
        this.volumeMin = volumeMin;
        this.volumeMax = volumeMax;
        this.volumeAtual = volumeMin;

        this.canalMin = canalMin;
        this.canalMax = canalMax;
        this.canalAtual = canalMin;
    }
    
    // Getters e Setters
    public int getVolumeMin() {
        return volumeMin;
    }
    public void setVolumeMin(int volumeMin) {
        this.volumeMin = volumeMin;
    }
    
    public int getVolumeMax() {
        return volumeMax;
    }
    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }
    
    public int getVolumeAtual() {
        return volumeAtual;
    }
    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }
    
    public int getCanalAtual() {
        return canalAtual;
    } 
    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getCanalMin() {
        return canalMin;
    }
    public void setCanalMin(int canalMin) {
        this.canalMin = canalMin;
    }

    public int getCanalMax() {
        return canalMax;
    }
    public void setCanalMax(int canalMax) {
        this.canalMax = canalMax;
    }

    
}
