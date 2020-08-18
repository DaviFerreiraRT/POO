public class Estudante {
    int matricula;
    String nome;
    char sexo;
    double[] notas = new double[4];

    void exibir() {
        System.out.println("Matricula do aluno(a)= " + this.matricula);
        System.out.println("Nome do aluno(a)= " + this.nome);
        System.out.println("Sexo do aluno(a)= " + this.sexo);
        double soma=0;      
        for (int i = 0; i < notas.length; i++) {
            soma+=notas[i];
            System.out.println("Todas as notas do aluno(a)=" + this.notas[i]);
        }
        double media=soma/notas.length;
        System.out.println("A média do aluno é= "+media);
    }

    void atribuirNota(int numProva, double nota) {
        this.notas[numProva - 1] = nota;
    }

    double lerNota(int numProva) {
        return this.notas[numProva - 1];
    }
}