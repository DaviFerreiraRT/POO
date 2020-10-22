public class Coordernador extends Professor {

    public Coordernador(String nome, int matricula, char sexo, String dataNascimento, int numeroHorasAulas, String turma) {
        super(nome, matricula, sexo, dataNascimento, numeroHorasAulas);
        this.turma=turma;
        
    }
    private String turma;
    public void seturma(String turma) {
        this.turma = turma;
    }
    public String geturma() {
        return turma;
    }
    @Override
    public void recebeSalario() {
        System.out.println("Coordenador recebendo salario");
    }
    @Override
    public void imprimir() {
        // tODO Auto-generated method stub
        super.imprimir();
        System.out.println("Coordenador da turma de: "+this.turma);
    }
}
