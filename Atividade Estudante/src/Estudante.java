public class Estudante {
    private int matricula;
    private String nome;
    private char sexo;
    private double[] notas = new double[4];

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
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            System.out.println("Todas as notas do aluno(a)=" + this.notas[i]);
        }
        double media = soma / notas.length;
        System.out.println("A média do aluno(a) é= " + media);
    }

    public void Exibir(String titulo) {
        System.out.println(titulo);
        this.Exibir();
    }

    public void setNota(int numProva, double nota) {
        if (nota >= 1 && nota <= 10) {
            this.notas[numProva - 1] = nota;
        } else {
            System.out.println("Nota inválida");
        }
    }

    /*public void setNota(int indice) {
        if (indice == 0) {
            this.notas[indice - 1] = 0.0;
        }
    }*/

    public double getNota(int numProva) {
        return this.notas[numProva - 1];
    }

    public double setNota(int indice) {
        return this.notas[indice - 1]=0.0;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' && sexo == 'F') {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo inválido");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

}