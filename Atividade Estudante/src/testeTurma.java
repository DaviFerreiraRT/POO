public class testeTurma {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Maria", 'F');
        Turma poo = new Turma("Programação Orientada a Objetos");
        estudante.setMatricula(1);
        estudante.setNota(1, 5);
        estudante.setNota(2, 7.5);
        estudante.setNota(3, 8.5);
        estudante.setNota(4, 10);
        poo.matricular(estudante);
        estudante = new Estudante("Davi", 'M');
        estudante.setMatricula(2);
        poo.matricular(estudante);
        poo.exibir();  

        /*
         * Estudante segundoEstudante = new Estudante("Davi",'M');
         * poo.matricular(segundoEstudante);
         */
        // poo.exibir();

        /*poo.pesquisar(5);
        poo.pesquisar(1);
        // poo.trancar(5);
        poo.exibir();
        poo.trancar(1);
        // poo.exibir();

        poo.trancar(estudante);

        poo.exibir();*/

    }
}
