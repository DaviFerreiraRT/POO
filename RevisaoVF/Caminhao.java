public class Caminhao extends Veiculo {
    private float toneladas;
    private float alturaMax;
    private float comprimento;

    public Caminhao() {

    }

    public Caminhao(String placa, long chassi, int ano, int peso, float velocMax, float preco, int capacidade,
            float toneladas, float alturaMax, float comprimento) {

        super(placa, chassi, ano, peso, velocMax, preco, capacidade);
        
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void setToneladas(float toneladas) {
        this.toneladas = toneladas;
    }

    public void setAlturaMax(float alturaMax) {
        this.alturaMax = alturaMax;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getToneladas() {
        return toneladas;
    }

    public float getAlturaMax() {
        return alturaMax;
    }

    public float getComprimento() {
        return comprimento;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Toneladas do caminhão: " + getToneladas());
        System.out.println("Altura máxima do caminhão: " + getAlturaMax());
        System.out.println("Comprimento do caminhão: " + getComprimento());
    }
    
    public void exibir(String texto) {
        System.out.println(texto);
        this.exibir();
        
    }
}
