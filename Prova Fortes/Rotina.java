import java.util.Scanner;

class Aluno {
  private String nome;
  private double nota;

  public Aluno(String nome, double nota) {
    this.nome = nome;
    this.nota = nota;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

  public String getNome() {
    return nome;
  }

  public double getNota() {
    return nota;
  }
}

public class Rotina {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Aluno alunos[] = new Aluno[5];

    int indexMaiorNota = 0;
    int indexMenorNota = 0;
    double mediaDaTurma = 0;

    for (int i = 0; i < alunos.length; i++) {
      System.out.print("Digite o nome do aluno " + (i + 1) + ":");
      String nome = scan.next();
      System.out.print("Digite a nota do aluno " + (i + 1) + ":");
      double nota = scan.nextDouble();

      alunos[i] = new Aluno(nome, nota);

      mediaDaTurma += nota;

      if (i != 0) {
        if (nota > alunos[indexMaiorNota].getNota()) {
          indexMaiorNota = i;
        }
        if (nota < alunos[indexMenorNota].getNota()) {
          indexMenorNota = i;
        }
      }
    }

    mediaDaTurma /= alunos.length;

    System.out.println("O aluno com maior nota é: " + alunos[indexMaiorNota].getNome());
    System.out.println("O aluno com menor nota é: " + alunos[indexMenorNota].getNome());
    System.out.println("A média da turma é: " + mediaDaTurma);
  }
}
