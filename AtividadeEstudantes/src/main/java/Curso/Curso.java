package Curso;

public class Curso {

    private String nome;
    private String codigo;
    private int cargaHoraria;

    public Curso(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setcodigo(String codigo) {

        this.codigo = codigo;

    }

    public String getcodigo() {
        return codigo;
    }

    public void setCargaHoraria(int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibir() {
        System.out.println("--------- DADOS DO CURSO----------");
        System.out.println("Nome do curso: " + nome);
        System.out.println("Codigo do curso: " + codigo);
        System.out.println("Carga Horaria do curso: " + cargaHoraria);
    }
}
