package Veiculos;

import Veiculos.Veiculo;

public class CarroPasseio extends Veiculo {
    
    private String cor;
    private String modelo;
    
    public CarroPasseio() {
    }
    
    public CarroPasseio(String placa, long chassi, int ano, int peso, 
            float velocMax, float preco, int capacidade,
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
    
    public void exibir() {
        super.exibir();
        System.out.println("Modelo do veiculo: " + this.modelo);
        System.out.println("Cor do veiculo: " + this.cor);
    }
    
    public void exibir(String texto) {
        System.out.println(texto);
        this.exibir();
        
    }
    
}
