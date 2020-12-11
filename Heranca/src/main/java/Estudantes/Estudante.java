package Estudantes;
import Disciplina.Disciplina;
import Curso.Curso;

/**
 *
 * @author davif
 */

public class Estudante {
    private int matricula;
    private String nome;
    private char sexo;
    double[] notas = new double[4];
    Curso meuCurso;
    Disciplina[] materia = new Disciplina[5];

    public Estudante(String nom, char sex, int matri) {
        this.matricula = matri;
        this.nome = nom;
        this.sexo = sex;
    }

    public Estudante(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Estudante() {

    }
    

    public void Exibir() {
        System.out.println("Matricula do aluno(a)= " + this.matricula);
        System.out.println("Nome do aluno(a)= " + this.nome);
        System.out.println("Sexo do aluno(a)= " + this.sexo);
        double soma = 0;
        // For Each
        for (double teste : notas) {
            soma += teste;
            System.out.println("Todas as notas do aluno(a)=" + teste);
        }
        double media = soma / notas.length;
        System.out.println("A media do aluno(a) é= " + media);
        if (meuCurso != null) {
            meuCurso.exibir();
        }
    }

    public void Exibir(String titulo) {
        System.out.println(titulo);
        this.Exibir();
    }

    public void atribuirNota(int numProva, double nota) {
        if (nota >= 1 && nota <= 10) {
            this.notas[numProva - 1] = nota;
        } else {
            System.out.println("Nota inválida");
        }
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        }
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' && sexo == 'F') {
            this.sexo = sexo;
        }
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Nenhum nome foi informado.");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }


    public Curso getMeuCurso() {
        return meuCurso;
    }

    public void setMeuCurso(Curso curso) {
        meuCurso = curso;
    }

    public Disciplina[] getMateria() {
        return materia;
    }


    public void setMateria(Disciplina[] materia) {
        this.materia = materia;
    }

}