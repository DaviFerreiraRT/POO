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
public class EstudanteMonitor extends Estudante {
    private double bolsa;
    private String disciplina;

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getBolsa() {
        return bolsa;
    }   

    public String getDisciplina() {
        return disciplina;
    }

    public EstudanteMonitor(int matricula, String nome, char sexo, double bolsa, String disciplina) {
        super(nome,sexo,matricula);
        this.bolsa = bolsa;
        this.disciplina = disciplina;
    };

    public void tirarDuvidas(){
        System.out.println("Tirando duvidas...!");
    }
    public void auxiliaProfessor(){
        System.out.println("Auxiliando professor...!");
    }
    @Override
    public void Exibir() {
        super.Exibir();
        System.out.println("Bolsa: "+bolsa);
        System.out.println("Disciplina: "+disciplina);
    }
    @Override
    public void atribuirNota(int numProva, double nota) {
        super.atribuirNota(numProva, nota); 
        if(nota<=7.0){
            System.out.println("Monitor desligado! ");
        }
    }
}

