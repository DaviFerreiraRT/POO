package Exceptions;

public class AumentoNegativoException extends Exception {

    private double valor = 0;

    public AumentoNegativoException() {
        super("Erro: Aumento Inválido");
    }

    public AumentoNegativoException(double aumento) {
        this();
        this.valor = aumento;
    }

    public double getValor() {
        return valor;
    }
}
