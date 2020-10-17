public class MotorNovo {
    private int potencia;
    private int cilindrada;

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public int getPotencia() {
        return potencia;
    }
    public void exibir(){
        System.out.println("Cilindradas: "+ this.cilindrada);
        System.out.println("Pontencia: "+this.potencia);
    }
}
