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
    public Estudante pesquisar(String nome){
        for(Estudante i : estudantes){
            if(i.getNome().equals(nome)){
                System.out.println("Nome do aluno pesquisado foi encontrado!\n Nome do aluno: "+i.getNome());
                return i;
            }
        }
        System.out.println("Estudante não encontrado!");
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
        for (Estudante i : estudantes)  {
            if (i==e) {
                estudantes.remove(e);
                System.out.println("Estudante removido com matricula "+i.getMatricula()+" removida!");
                return;
            }
        }
        System.out.println("Estudante não encontrado!");
    }
    public void listar(){
        ListIterator <Estudante> it = estudantes.listIterator();
        System.out.println("---USANDO ITERATOR---");
        while(it.hasNext()){
            System.out.println("------TURMA DE "+nome+"------");
            it.next().Exibir();            
        }
    }
}
