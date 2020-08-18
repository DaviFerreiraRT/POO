public class Estudante {
    int matricula;
    String nome;
    char sexo;
    double[] notas = new double[4];

    void exibir() {
        System.out.println("Matricula do aluno(a)= " + this.matricula);
        System.out.println("Nome do aluno(a)= " + this.nome);
        System.out.println("Sexo do aluno(a)= " + this.sexo);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas do aluno(a)=" + this.notas[i]);
        }
    }

    void atribuirNota(int numProva, double nota) {
        this.notas[numProva - 1] = nota;
    }

    double lerNota(int numProva) {
        return this.notas[numProva - 1];
    }
}