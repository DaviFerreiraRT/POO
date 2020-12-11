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
public class EstudanteNuloException extends Exception {
    private int estudante = 0;

    public EstudanteNuloException() {
        super("Erro: Estudante Nulo!");
    }
    public void TipoDoErro() {
        System.out.println("Erro do tipo:EstudanteNuloException");
    }
}

