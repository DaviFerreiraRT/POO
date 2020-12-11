package Turma;

import java.util.*;
import Estudante.Estudante;
import Exceptions.*;

/**
 *
 * @author davif
 */

public class Turma {

   private ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
   private String nome;

    public Turma(String nome) throws NomeTurmaException {
        if (nome == null)
            throw new NomeTurmaException();
        else
            this.nome = nome;
    }

    public void matricular(Estudante e) throws EstudanteNuloException {
        if (e == null) {
            throw new EstudanteNuloException();
        } else {
            estudantes.add(e);
        }
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

    public Estudante pesquisar(int matricula) throws MatriculaInexistenteException {

        for (Estudante i : estudantes) {

            if (i.getMatricula() == matricula) {
                System.out.println("Numero da matricula encontrada!\nNr da matricula requsitada: " + matricula);
                return i;
            }
        }
        throw new MatriculaInexistenteException(matricula);

    }

    public Estudante pesquisar(String nome) {
        for (Estudante i : estudantes) {
            if (i.getNome().equals(nome)) {
                System.out.println("Nome do aluno pesquisado foi encontrado!\nNome do aluno: " + i.getNome());
                return i;
            }
        }
        System.out.println("Estudante não encontrado!");
        return null;
    }

    public void trancar(int matricula) throws EstudanteInexistenteException {
        for (Estudante i : estudantes) {
            if (i.getMatricula() == matricula) {
                estudantes.remove(i);
                System.out.println("Estudante com matricula " + matricula + " removida!");
                return;
            }
            

        }
        throw new EstudanteInexistenteException();
    }

    public void trancar(Estudante e) throws EstudanteInexistenteException {
        for (Estudante i : estudantes) {
            if (i == e) {
                estudantes.remove(e);
                System.out.println("Estudante removido com matricula " + i.getMatricula() + " removida!");
                return;
            }

        }
        throw new EstudanteInexistenteException(e);
    }

    public void listar() {
        ListIterator<Estudante> it = estudantes.listIterator();
        System.out.println("---USANDO ITERATOR---");
        while (it.hasNext()) {
            System.out.println("------TURMA DE " + nome + "------");
            it.next().Exibir();
        }
    }
}
