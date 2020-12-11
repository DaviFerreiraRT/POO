/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author davif
 */
public class MatriculaInexistenteException extends Exception {
    private int Mestudante;

    public MatriculaInexistenteException() {
       super("Erro:Matricula com estudante inexistente!");
        
    }

    public MatriculaInexistenteException(int Mestudante) {
        this();
        this.Mestudante=Mestudante;
    }

    public int getEstudante() {
        return Mestudante;
    }
    public void TipoDoErro() {
        System.out.println("Erro do tipo:MatriculaInexistenteException");
    }

}

