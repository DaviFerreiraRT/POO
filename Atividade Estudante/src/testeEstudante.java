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
        
        e.exibir();
        e.exibir("DADOS DO ESTUDANTE");
        
      /*  Estudante a1=new Estudante();
        a1.nome="Davi Ferreira";
        a1.matricula=1919100;
        a1.sexo='M';
        a1.atribuirNota(1, 7.0);
        a1.atribuirNota(2, 5.0);
        a1.atribuirNota(3);
        a1.atribuirNota(4, 8.5);
        System.out.println("Nota requisitada= "+a1.lerNota(5));
        a1.exibir();
        a1.exibir("DADOS DO ESTUDANTE");
        
        Estudante a2 = new Estudante("Emily Lima",'F');
        a2.matricula=210519;
        a2.atribuirNota(1, 7.0);
        a2.atribuirNota(2, 5.0);
        a2.atribuirNota(3);
        a2.atribuirNota(4, 8.5);
        a2.exibir();
        a2.exibir("DADOS DO ESTUDANTE");
*/

        

    }
}