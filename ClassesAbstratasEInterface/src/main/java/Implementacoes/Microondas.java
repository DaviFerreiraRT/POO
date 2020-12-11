package Implementacoes;

import Abstratas.Aparelho;

public class Microondas extends Aparelho {

    @Override
    public void ligar() {
        System.out.println("Ligando Microondas....");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando Microondas...");
    }

    @Override
    public void exibir() {
        super.exibir();
    }
    
}
