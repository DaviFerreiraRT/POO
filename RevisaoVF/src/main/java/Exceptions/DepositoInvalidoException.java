package Exceptions;

public class DepositoInvalidoException extends Exception {
    private double valorInvalido = 0;

    public DepositoInvalidoException() {
        super("Erro: Depósito inválido!");
    }

    public DepositoInvalidoException(double DepositoInvalidoException) {
        this();
        this.valorInvalido = DepositoInvalidoException;
    }
    public double getDepositoInvalido() {
        return this.valorInvalido;
    }

}
