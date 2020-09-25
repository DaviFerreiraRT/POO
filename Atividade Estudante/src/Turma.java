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
            {
                System.out.println("-------TURMA DE " + nome + " --------");
                i.Exibir();

            }
        }
    }

    public Estudante pesquisar(int matricula) {
        for (Estudante i : estudantes) {
            if (i.getMatricula()==matricula) {
                System.out.println("Numero da matricula encontrada!\nNr da matricula requsitada: " + matricula);
                return i;
            }
        }
        System.out.println("Matricula não encontrada!");
        return null;
    }

    public boolean trancar(int matricula) {
        for (int i = 0; i < estudantes.size(); i++) {
            if (estudantes.get(i).getMatricula() == matricula) {
                estudantes.remove(estudantes.get(i));
                System.out.println("Estudante com matricula " + matricula + " removida!");
                return true;
            }
        }
        System.out.println("Estudante não encontrado!");
        return false;
    }

    public boolean trancar(Estudante e) {
        for (int i = 0; i < estudantes.size(); i++) {
            if (estudantes.get(i).equals(e)) {
                estudantes.remove(e);
                System.out.println("Estudante removido! ");
                return true;
            }
        }
        System.out.println("Estudante não encontrado!");
        return false;
    }
}
