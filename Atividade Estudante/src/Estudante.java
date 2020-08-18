public class Estudante {
    int matricula;
    String nome;
    char sexo;
    double[] notas = new double[4];

    void atribuirNota(int numProva, double nota) {
        for (int i = 0; i < numProva-1; i++) {
            nota = notas[i];
        }
    System.out.println(numProva);
    }

    void exibir() {
        System.out.println("Matricula do aluno(a)= " + matricula);
        System.out.println("Nome do aluno(a)= " + nome);
        System.out.println("Sexo do aluno(a)= " + sexo);
    }

}