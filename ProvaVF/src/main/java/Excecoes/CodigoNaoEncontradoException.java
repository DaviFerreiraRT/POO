package Excecoes;

/**
 *
 * @author davif
 */
public class CodigoNaoEncontradoException extends Exception {

    private String CodigoInvalido = "";

    public CodigoNaoEncontradoException() {
        super("ERRO: Código não encontrado!");

    }

    public CodigoNaoEncontradoException(String CodigoInvalido) {
        this();
        this.CodigoInvalido = CodigoInvalido;
    }

    public String getCodigoInvalido() {
        return this.CodigoInvalido;
    }

}
