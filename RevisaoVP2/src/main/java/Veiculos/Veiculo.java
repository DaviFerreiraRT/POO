package Veiculos;

import java.util.ArrayList;
import Interfaces.Exibivel;
import MotorEPeca.*;

public abstract class Veiculo implements Exibivel {

    protected String placa;
    protected long chassi;
    protected int ano;
    protected int peso;
    protected float velocMax;
    protected float preco;
    protected int capacidade;
    protected Motor motor;
    private ArrayList<Peca> pecas = new ArrayList<Peca>();

    public Veiculo() {
    }

    public Veiculo(String placa, long chassi, int ano, int peso,
            float velocMax, float preco, int capacidade) {
        this.placa = placa;
        this.chassi = chassi;
        this.ano = ano;
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
        this.capacidade = capacidade;
    }

    public int getAno() {
        return ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public long getChassi() {
        return chassi;
    }

    public int getPeso() {
        return peso;
    }

    public String getPlaca() {
        return placa;
    }

    public float getPreco() {
        return preco;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setChassi(long chassi) {
        this.chassi = chassi;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public void setPecas(ArrayList<Peca> pecas) {
        this.pecas = pecas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }

    @Override
    public void exibir() {
        System.out.println("Placa= " + this.placa);
        System.out.println("Chassi= " + this.chassi);
        System.out.println("Ano= " + this.ano);
        System.out.println("Peso= " + this.peso + "kg");
        System.out.println("Velocidade Maxima=" + this.velocMax + "Km/h");
        System.out.println("Preco:R$" + this.preco);

    }

    public void adicionar(Peca e) {
        pecas.add(e);
    }

    public void consultar(int codigo) {
        for (Peca i : pecas) {
            if (i.getCodigo() == codigo) {
                System.out.println("Peca com codigo " + codigo + " removida!");
            }
        }
        System.out.println("Peca com codigo nao encontrado!");
    }

    public void aumentarPreco(double aumento) {
        this.preco = (float) (preco + aumento);
    }

    public void reduzirPreco(double reducao) {
        this.preco = (float) (preco - reducao);
    }
}
