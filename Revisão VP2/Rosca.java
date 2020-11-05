public class Rosca extends PecaNovo {
    private double espessura;
    private double diamentro;

    public Rosca() {
        super();
    }

    public Rosca(int codigo, String descricao, String marca, double espessura, double diamentro) {
        super(codigo, descricao, marca);
        this.espessura = espessura;
        this.diamentro = diamentro;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Espessura: " + this.espessura);
        System.out.println("Diametro: " + this.diamentro);
    }
}
