public class ProvaInexistenteException extends Exception {
    private int indexProvaInvalida = 0;

    public int getProvaInvalida() {
        return indexProvaInvalida;
    }

    public ProvaInexistenteException() {
        super("Erro: Prova não existente!");
    }

    public ProvaInexistenteException(int indexProvaInvalida) {
        this();
        this.indexProvaInvalida = indexProvaInvalida;
    }

}