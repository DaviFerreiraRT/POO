import java.util.*;

public class Turma {

    private ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
    private String nome;

    public Turma() {
    }

    public Turma(String nome) {
        this.nome = nome;
    }

    public void matricular(Estudante e) {
        estudantes.add(e);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void exibir() {
        for (Estudante i : estudantes) {

            System.out.println("-------TURMA DE " + nome + " --------");
            i.Exibir();

        }
    }

    public Estudante pesquisar(int matricula) {
        for (Estudante i : estudantes) {
            if (i.getMatricula() == matricula) {
                System.out.println("Numero da matricula encontrada!\nNr da matricula requsitada: " + matricula);
                return i;
            }
        }
        System.out.println("Matricula não encontrada!");
        return null;
    }

    public void trancar(int matricula) {
        for (Estudante i : estudantes) {
            if (i.getMatricula() == matricula) {
                estudantes.remove(i);
                System.out.println("Estudante com matricula " + matricula + " removida!");
                return;
            }

        }
        System.out.println("Estudante não foi encontrado!");
    }

    public void trancar(Estudante e) {
        for (Estudante i : estudantes) {
            if (i.equals(e)) {
                estudantes.remove(e);
                System.out.println("Estudante removido com matricula "+i.getMatricula()+" removida!");
                return;
            }
        }
        System.out.println("Estudante não encontrado!");
    }

}
