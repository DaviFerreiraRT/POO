package Turma;
import Estudante.Estudante;
import java.util.*;

public class TesteTurmaLista {

    public static void main(String[] args) {

        TurmaArrayList t1 = new TurmaArrayList("POO");
        ArrayList al = t1.getEstudantes();
        
        Estudante e1 = new Estudante("Jonas", 'M', 154);
        Estudante e2 = new Estudante("Rodrigo", 'M', 155);
        Estudante e3 = new Estudante("Davi", 'M', 156);
        Estudante e4 = new Estudante("Vinicius", 'M', 157);
        Estudante e5 = new Estudante("Emily", 'F', 158);
        Estudante e6 = new Estudante("Beatriz", 'F', 159);

        e6.setNota(1, 10);
        e6.setNota(2, 9);
        e6.setNota(3, 9.5);
        e6.setNota(4, 8.0);
        TurmaArrayList t2 = new TurmaArrayList("BD2 ");

        t1.matricular(e1);
        t1.matricular(e2);
        t1.matricular(e3);
        t1.matricular(e4);
        t1.matricular(e5);
        t1.matricular(e6);

        t2.matricular(e3);
        t2.matricular(e1);
        t2.matricular(e4);

        //t1.exibir();
        //t1.trancar(155);
        //t1.exibir();
        //t2.trancar(e3);
        // t1.trancar(e3);
        //t2.pesquisar(153);

        //t1.exibir();
        //t2.listar();
        //t2.listar();
        t1.pesquisar("Davi");
    }
}
