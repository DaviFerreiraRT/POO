public class MatriculaInexistenteException extends Exception {
    private int Mestudante;

    public MatriculaInexistenteException() {
       super("Erro:Matricula com estudante inexistente!");
        
    }

    public MatriculaInexistenteException(int Mestudante) {
        this();
        this.Mestudante=Mestudante;
    }

    public int getEstudante() {
        return Mestudante;
    }
    public void TipoDoErro() {
        System.out.println("Erro do tipo:MatriculaInexistenteException");
    }

}
