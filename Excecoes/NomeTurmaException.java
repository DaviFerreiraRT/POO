public class NomeTurmaException extends Exception {

    public NomeTurmaException() {
        super("Erro:Nome da turma nulo!");
    }
    public void TipoDoErro() {
        System.out.println("Erro do tipo:NomeTurmaException");
    }
}
