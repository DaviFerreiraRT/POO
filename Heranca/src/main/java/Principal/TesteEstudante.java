package Principal;

import Estudantes.Estudante;
import Estudantes.EstudanteEstagiario;
import Estudantes.EstudanteMonitor;
import Turma.Turma;

/**
 *
 * @author davif
 */
public class TesteEstudante {

    public static void main(String[] args) {
        Estudante e = new Estudante("Vinicius", 'M', 101);
        e.atribuirNota(1, 10);
        e.atribuirNota(2, 7);
        e.atribuirNota(3, 5);
        e.atribuirNota(4, 10);
        e.Exibir("----DADOS DO ALUNO ----");

        EstudanteMonitor em = new EstudanteMonitor(111, "Rodrigo", 'M', 500.00, "POO");

        em.atribuirNota(1, 10);
        em.atribuirNota(2, 8);
        em.atribuirNota(3, 9);
        em.atribuirNota(4, 7);

        System.out.println("Atribuindo como Estudante Monitor");
        em.Exibir();

        EstudanteEstagiario ee = new EstudanteEstagiario(112, "Jonas", 'M', 500, "AMAZON");
        ee.atribuirNota(1, 8);
        ee.atribuirNota(2, 8);
        ee.atribuirNota(3, 9);
        ee.atribuirNota(4, 7.5);

        //System.out.println("---------------------------------------");
        ee.Exibir("Dados do esutudante");
        //ee.trabalhar();
        Turma t1 = new Turma("POO");
        t1.matricular(ee);
        t1.matricular(em);
        t1.matricular(e);
        t1.exibir();
        System.out.println("Todas as classes que foram utilizadas");
        t1.imprimirClasse();

    }
}
