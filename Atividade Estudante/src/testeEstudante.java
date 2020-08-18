public class testeEstudante {

    public static void main(String[] args) {
        Estudante e = new Estudante();
        e.matricula = 2004001;
        e.nome = "Maria Silva";
        e.sexo = 'F';
        /*e.notas[0]=7.0;
        e.notas[1]=8.2;
        e.notas[2]=6.0;
        e.notas[3]=5.5;*/
        e.atribuirNota(1,7.0);
        e.atribuirNota(2,8.2);
        e.atribuirNota(3,6.0);
        e.atribuirNota(4,5.5);
        double nota1=e.lerNota(2);
        System.out.println("Nota 1 = "+nota1);
        e.exibir();
    }
}