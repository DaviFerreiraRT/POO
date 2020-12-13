package Negocio;

/**
 *
 * @author davif
 */
public class Aeronave {

    private String codigo, tipo;
    private int idade;

    public Aeronave(String codigo, String tipo, int idade) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.idade = idade;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public void aterrissar() {
        System.out.println("aterrissando...");
    }

    public void fazerRevisao() {
        System.out.println("fazendo revisão...");
    }
}
