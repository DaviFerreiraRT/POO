public class EstudanteInexistenteException extends Exception {
    private Estudante Mestudante;

    public EstudanteInexistenteException() {
       super("Erro:Estudante inexistente!");
        
    }

    public EstudanteInexistenteException(Estudante Mestudante) {
        this();
        this.Mestudante=Mestudante;
    }

    public Estudante getEstudante() {
        return Mestudante;
    }
    public void TipoDoErro() {
        System.out.println("Erro do tipo:EstudanteInexistenteException");
    }

}
