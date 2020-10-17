public class Automovel extends Transporte {
    private String placa;

    public Automovel() {
    }

    public Automovel(String marca, String modelo, double quilometragem, int capacidadeTanque, String placa) {
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.placa = placa;
    }

    public void moverSe(double quilometros) {
        double auxQuilo = getQuilometragem();
        int auxLitro = getCapacidadeTanque();
        quilometros += auxQuilo;
        if (auxQuilo == 8) {
            auxLitro = auxLitro - 1;
            System.out.println("Total de litros apos 8 km pecorrido: " + auxLitro);
        }
    }

    public void exibir() {

        super.exibir();
        System.out.println("Placa do veiculo: " + placa);
    }

}
