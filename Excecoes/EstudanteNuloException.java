public class EstudanteNuloException extends Exception {
    private int estudante = 0;

    public EstudanteNuloException() {
        super("Erro: Estudante Nulo!");
    }
    public void TipoDoErro() {
        System.out.println("Erro do tipo:EstudanteNuloException");
    }
}
