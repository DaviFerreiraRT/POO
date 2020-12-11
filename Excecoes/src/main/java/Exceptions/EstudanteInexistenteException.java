/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;
import Estudante.Estudante;
/**
 *
 * @author davif
 */
public class EstudanteInexistenteException extends Exception {
    private Estudante Mestudante;

    public EstudanteInexistenteException() {
       super("Erro:Estudante inexistente!");
        
    }

    public EstudanteInexistenteException(Estudante Mestudante) {
        this();
        this.Mestudante=Mestudante;
    }

    public Estudante getEstudante() {
        return Mestudante;
    }
    public void TipoDoErro() {
        System.out.println("Erro do tipo:EstudanteInexistenteException");
    }

}

