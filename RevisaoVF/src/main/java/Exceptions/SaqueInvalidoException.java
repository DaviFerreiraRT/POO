package Exceptions;

public class SaqueInvalidoException extends Exception {

    private double valorInvalido = 0;

    public SaqueInvalidoException() {
        super("Erro: Saque inválido!");
    }

    public SaqueInvalidoException(double SaqueInvalidoException) {
        this();
        this.valorInvalido = SaqueInvalidoException;
    }

    public double getSaldoInvalido() {
        return this.valorInvalido;
    }

}
