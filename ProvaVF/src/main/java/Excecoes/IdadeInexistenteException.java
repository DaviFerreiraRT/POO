package Excecoes;

/**
 *
 * @author davif
 */
public class IdadeInexistenteException extends Exception {

    private int idadeInvalida = 0;

    public IdadeInexistenteException() {
        super("ERRO: Idade inexistente!");
    }

    public IdadeInexistenteException(int IdadeInexistente) {
        this();
        this.idadeInvalida = IdadeInexistente;
    }

    public double getIdadeInvalido() {
        return this.idadeInvalida;
    }
}
