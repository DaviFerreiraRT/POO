package Transportes;

public class Automovel extends Transporte {

    private String placa;

    public Automovel() {
    }

    public Automovel(String marca, String modelo, double quilometragem, 
            int capacidadeTanque, String placa) {
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.placa = placa;
    }

    public void moverSe(double quilometros) {
        if (this.capacidadeTanque >= quilometros / 8) {
            this.quilometragem += quilometros;
            this.capacidadeTanque -= quilometros / 8;
            System.out.println("O carro andou: " + quilometragem + 
                    " e ficou com total de litros: " + capacidadeTanque);
        } else {
            System.out.println("O carro não se possui combustivel suficiente!");
        }
    }

    public void exibir() {

        super.exibir();
        System.out.println("Placa do veiculo: " + placa);
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}
