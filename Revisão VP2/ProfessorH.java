
public class ProfessorH extends FuncionarioHeranca {
    private String disciplina[] = new String[2];

    public ProfessorH() {
    }

    public ProfessorH(String nome, String funcao, double salario, String disciplina1, String disciplina2) {
        super(nome, funcao, salario);
        this.disciplina[0] = disciplina1;
        this.disciplina[1] = disciplina2;
        numFuncionario++;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public void aumentarSalario(double porcentagem) {
        setSalario((getSalario() + (getSalario() * porcentagem) / 100) + 100 * disciplina.length);
    }

    public void exibir() {
        super.exibir();
        for(int i = 0 ; i<disciplina.length;i++){
            System.out.println("Disciplinas do professor: "+disciplina[i]);
        }


    }
}
