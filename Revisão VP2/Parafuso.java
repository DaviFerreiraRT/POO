public class Parafuso extends PecaNovo {
    private int tamanho;
    private double bitola;

    public Parafuso() {
        super();
    } 

    public Parafuso(int codigo, String descricao, String marca, int tamanho, double bitola) {
        super(codigo, descricao, marca);
        this.tamanho = tamanho;
        this.bitola = bitola;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Bitola: " + this.bitola);
    }

}
