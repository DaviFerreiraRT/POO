public class Estudante {
    private int matricula;
    private String nome;
    private char sexo;
    private double[] notas = new double[4];
    Curso meuCurso;

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
        if(meuCurso!=null){
            meuCurso.exibir();
        }
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

    public double setNota(int indice) {
        return this.notas[indice - 1] = 0.0;
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
        } 
        else {
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

    public double getNota(int numProva) {
        return this.notas[numProva - 1];
    }
    public Curso getMeuCurso(){
        return meuCurso;
    }
    public void setMeuCurso(Curso curso){
        meuCurso=curso;
    }

}