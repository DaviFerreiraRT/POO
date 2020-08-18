public class testeEstudante {

    public static void main(String[] args) {
        Estudante e = new Estudante();
        e.matricula = 2004001;
        e.nome = "Maria Silva";
        e.sexo = 'F';

        e.atribuirNota(1, 7.0);
        e.atribuirNota(2, 8.2);
        e.atribuirNota(3, 6.0);
        e.atribuirNota(4, 5.5);

        System.out.println("Nota requisitada= "+e.lerNota(1));
        e.exibir();

    }
}