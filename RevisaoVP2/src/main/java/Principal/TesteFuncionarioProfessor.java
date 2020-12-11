package Principal;

import Funcionario.*;

/**
 *
 * @author davif
 */
public class TesteFuncionarioProfessor {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Davi", "Analista de dados", 500);
        Professor p = new Professor("Joao", "Professor", 1000, "REDES", "SD");

        f.aumentarSalario(5);
        f.exibir();

        p.aumentarSalario(10);
        p.exibir();

        Professor p2 = new Professor("Julia", "Professora", 2600, "Sistemas Operacionais", "ADS");
        p2.aumentarSalario(10);

        p2.exibir();
    }
}
