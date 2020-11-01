public class Transporte {
    protected String marca;
    protected String modelo;
    protected double quilometragem;
    protected int capacidadeTanque;

    public Transporte (){}

    public Transporte ( String marca, String modelo, double quilometragem, int capacidadeTanque){
        this.marca=marca;
        this.modelo=modelo;
        this.quilometragem=quilometragem;
        this.capacidadeTanque=capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getQuilometragem() {
        return quilometragem;
    }

    public void moverSe(double quilometros){
        this.quilometragem=quilometragem+quilometros;
        System.out.println("Total de quilometros medido apos mover-se: "+this.quilometragem);
    }
    public void abastecer(int litros){
        this.capacidadeTanque+=litros;
        System.out.println("Capacidade do tanque atualmente apos reabastecer: "+capacidadeTanque);
    }
    public void exibir(){
        System.out.println("DADOS DO TRANSPORTE");
        System.out.println("Marca do transporte: "+this.marca);
        System.out.println("Modelo do transporte: "+this.modelo);
        System.out.println("Km total do transporte: "+this.quilometragem);
        System.out.println("Capacidade do tanque: "+this.capacidadeTanque);
    }
}