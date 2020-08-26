public class testeEstudante {

    public static void main(String[] args) {
        Estudante e = new Estudante("Maria", 'F', 202020);
        /*
         * e.matricula = 2004001; e.nome = "Maria Silva"; e.sexo = 'F';
         */

        System.out.println("Matricula= " + e.getMatricula());
        e.setNota(1, 7.0);
        e.setNota(2, 8.2);
        e.setNota(3, 6.0);
        e.setNota(4, 5.5);

        // e.exibir();
        e.Exibir("DADOS DO ESTUDANTE 1 ");

        Estudante a1 = new Estudante("Davi Ferreira", 'M');
        a1.setMatricula(1919100);
        // a1.matricula = 1919100;
        a1.setNota(1, 7.0);
        a1.setNota(2);
        a1.setNota(3,4.5);
        a1.setNota(4, 8.5);

        // a1.exibir();
        a1.Exibir("DADOS DO ESTUDANTE 2 "); 
        Estudante a2 = new Estudante("Emily Lima", 'F', 25052019);

        a2.setNota(1, 7.0);
        a2.setNota(2, 5.0);
        a2.setNota(3);
        a2.setNota(4, 10.0);
        System.out.println("MATRICULA COM GET="+a2.getMatricula());
        System.out.println("NOME COM GET="+a2.getNome());
        System.out.println("SEXO COM GET="+a2.getSexo());
        
        //sem get
        a2.Exibir("DADOS DO ESTUDANTE 3 ");
    }
}