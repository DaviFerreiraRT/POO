import java.lang.reflect.Executable;

public class NotaInvalidaException extends Exception {

    private double notaInvalida;
    public NotaInvalidaException(){
        super("Erro: Tentativa de lançar nota invalida!");
    }
    public NotaInvalidaException(double notaInvalida) {
        this();
        this.notaInvalida = notaInvalida;

    }

    public double getNotaInvalida() {
        return this.notaInvalida;
    }
}
