package Implementacoes;

import Abstratas.Aparelho;

public class Televisão extends Aparelho {

    @Override
    public void ligar() {
        System.out.println("Ligando Televisão....");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando Televisão...");

    }
}
