import java.util.ArrayList;

public class ProfessorH extends FuncionarioHeranca {
    private ArrayList<String> disciplina = new ArrayList<String>();

    public ProfessorH() {
    }

    public ProfessorH(String nome, String funcao, double salario, String disciplina1, String disciplina2) {
        super(nome, funcao, salario);

        this.disciplina.add(disciplina1);
        this.disciplina.add(disciplina2);
    }

    public void setDisciplina(ArrayList<String> disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<String> getDisciplina() {
        return disciplina;
    }

    public void aumentarSalario(double porcentagem) {
        for (int i = 0; i<disciplina.size();i++){
            if (disciplina.size() > 0) {
                double novoSalario = getSalario();
                
                novoSalario += (novoSalario * porcentagem) / 100;
                novoSalario += 100;

                System.out.println("Novo salario do professor com aumento: " + novoSalario);
                break;
            }
        }
    }

    public void exibir() {
        super.exibir();
        System.out.println("Disciplinas do professor: " + getDisciplina());

    }
}
