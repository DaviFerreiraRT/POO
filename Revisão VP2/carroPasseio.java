public class carroPasseio extends VeiculoNovo {
    private String cor;
    private String modelo;

    public carroPasseio() {
    }

    public carroPasseio(String placa, long chassi, int ano, int peso, float velocMax, float preco, int capacidade,
            String cor, String modelo) {
        super(placa, chassi, ano, peso, velocMax, preco, capacidade);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    @Override
    public void exibir() {
        System.out.println("Modelo do veiculo: "+getModelo());
        System.out.println("Cor do veiculo: "+getCor());
    }
    

}
