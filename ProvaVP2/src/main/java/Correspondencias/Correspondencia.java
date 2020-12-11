package Correspondencias;

public class Correspondencia {

    protected double peso;
    protected double preco;
    protected String dataDoEnvio;
    protected String dataDoRecebimento;
    protected String estado;

    public Correspondencia(double peso, double preco) {
        this.peso = peso;
        this.preco = preco;
    }

    public Correspondencia(double peso, double preco, String dataDoEnvio) {
        this(peso, preco);
        this.dataDoEnvio = dataDoEnvio;
    }

    public void enviar() {
        this.dataDoEnvio = "01/01/2000";
        this.estado = "Enviado";
    }

    public void enviar(String data) {

        this.dataDoEnvio = data;
        this.estado = "Enviado";

        System.out.println("Estado: " + this.estado);
        System.out.println("Data de envio: " + this.dataDoEnvio);
    }

    public boolean conferirPreco() {
        if ((this.peso <= 200 && this.preco == 1.4)) {
            System.out.println("Peso: " + this.peso + " e Preco: " + this.preco);
            System.out.println("TRUE");
            return true;
        } else if ((this.peso <= 600 && this.preco == 2.8)) {
            System.out.println("Peso: " + this.peso + " e Preco: " + this.preco);
            System.out.println("TRUE");
            return true;
        } else if ((this.peso > 600 && this.preco == 4)) {
            System.out.println("Peso: " + this.peso + " e Preco: " + this.preco);
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("Peso: " + this.peso + " e Preco: " + this.preco);
            System.out.println("FALSE");
            return false;
        }
    }

    public String getDataDoEnvio() {
        return dataDoEnvio;
    }

    public String getDataDoRecebimento() {
        return dataDoRecebimento;
    }

    public String getEstado() {
        return estado;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setDataDoEnvio(String dataDoEnvio) {
        this.dataDoEnvio = dataDoEnvio;
    }

    public void setDataDoRecebimento(String dataDoRecebimento) {
        this.dataDoRecebimento = dataDoRecebimento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
