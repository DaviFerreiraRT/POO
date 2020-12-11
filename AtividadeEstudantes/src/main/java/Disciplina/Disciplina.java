package Disciplina;

import Estudante.Estudante;

public class Disciplina {

    private String nome;
    private String codigo;
    private int cargaHoraria;
    Estudante alunos[] = new Estudante[5];

    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public void incluirEstudante(Estudante e) {

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCargaHoraria(int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibirEstudantes() {
        System.out.println("--------- DADOS DO ESTUDANTE----------");
        System.out.println("Nome do Estudante: " + nome);
        System.out.println("Codigo do Estudante: " + codigo);
        System.out.println("Carga Horaria do Estudante: " + cargaHoraria);
    }
}
