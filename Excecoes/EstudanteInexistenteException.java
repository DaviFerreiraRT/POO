public class EstudanteInexistenteException extends Exception {
    private int Mestudante;

    public EstudanteInexistenteException() {
       super("Erro:Estudante inexistente!");
        
    }

    public EstudanteInexistenteException(int Mestudante) {
        this();
        this.Mestudante=Mestudante;
    }

    public int getEstudante() {
        return Mestudante;
    }
    public void TipoDoErro() {
        System.out.println("Erro do tipo:EstudanteInexistenteException");
    }

}
