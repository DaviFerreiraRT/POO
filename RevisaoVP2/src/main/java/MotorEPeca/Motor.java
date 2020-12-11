package MotorEPeca;

import Interfaces.Exibivel;

public class Motor implements Exibivel {

    private int potencia;
    private int cilindrada;

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public void exibir() {
        System.out.println("Cilindradas: " + this.cilindrada);
        System.out.println("Pontencia: " + this.potencia);
    }

    @Override
    public void exibir(String texto) {
        System.out.println(texto);
        this.exibir();
    }
}
