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
public class ProvaInexistenteException extends Exception {
    private int indexProvaInvalida = 0;

    public int getProvaInvalida() {
        return indexProvaInvalida;
    }

    public ProvaInexistenteException() {
        super("Erro: Prova não existente!");
    }

    public ProvaInexistenteException(int indexProvaInvalida) {
        this();
        this.indexProvaInvalida = indexProvaInvalida;
    }

}
