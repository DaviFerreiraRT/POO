package Correspondencias;

public class CorrespondenciaAR extends Correspondencia {

    private boolean avisoDeRecebimento;

    public CorrespondenciaAR(double peso, double preco, String dataDoEnvio) {
        super(peso, preco, dataDoEnvio);
    }

    public CorrespondenciaAR(double peso, double preco, String dataDoEnvio,
            boolean avisoDeRecebimento) {
        this(peso, preco, dataDoEnvio);
        this.avisoDeRecebimento = avisoDeRecebimento;
    }

    public boolean conferirPreco() {
        if (this.peso <= 600 && this.preco == 6.00) {
            System.out.println("Peso: " + this.peso + " e preco: " + this.preco);
            System.out.println("TRUE");
            return true;
        } else if (this.preco == 8.00) {
            System.out.println("Peso: " + this.peso + " e preco: " + this.preco);
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("Peso: " + this.peso + " e preco: " + this.preco);
            System.out.println("FALSE");
            return false;
        }
    }

    public void exibir() {
        System.out.println("Peso:" + peso);
        System.out.println("Preco:" + preco);
    }
}
