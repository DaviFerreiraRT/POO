/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudantes;

/**
 *
 * @author davif
 */
public class EstudanteEstagiario extends Estudante {
    private double salario;
    private String empresa;

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getSalario() {
        return salario;
    }

    public EstudanteEstagiario(int matricula, String nome, char sexo, double salario, String empresa) {
        super(nome,sexo,matricula);
        this.salario = salario;
        this.empresa = empresa;
    }

    @Override
    public void Exibir() {
        super.Exibir();
        System.out.println("Salario do aluno na empresa: " + salario);
        System.out.println("Empresa: " + empresa);
    }

    public void trabalhar() {
        System.out.println("Trabalhando......");
    }

    @Override
    public void atribuirNota(int numProva, double nota) {
        super.atribuirNota(numProva, nota);
        if (nota <=7.0) {
            System.out.println("Estagiario Desligado!");
        }
    }

}

