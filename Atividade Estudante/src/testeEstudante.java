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
        e.atribuirNota(0,7.0);
        e.atribuirNota(1,8.2);
        e.atribuirNota(2,6.0);
        e.atribuirNota(3,5.5);
      
        e.exibir();
    }

}