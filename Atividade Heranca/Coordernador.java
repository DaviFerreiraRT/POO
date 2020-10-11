public class Coordernador extends Professor {

    public Coordernador(String nome, int matricula, char sexo, String dataNascimento, int numeroHorasAulas, String Turma) {
        super(nome, matricula, sexo, dataNascimento, numeroHorasAulas);
        this.Turma=Turma;
        
    }
    private String Turma;
    public void setTurma(String Turma) {
        this.Turma = Turma;
    }
    public String getTurma() {
        return Turma;
    }
    @Override
    public void recebeSalario() {
        System.out.println("Coordenador recebendo salario");
    }
}
