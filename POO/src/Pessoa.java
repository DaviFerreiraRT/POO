public class Pessoa {
    private String nome;
    private int cnh;
    private Veiculo v;

    public Pessoa(String nome, int cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public void setVeiculo(Veiculo carro) {
        v = carro;
    }

    public Veiculo getVeiculo() {
        return v;
    }

    public void exibir() {
        System.out.println("Nome=" + nome);
        System.out.println("CNH= " + cnh);
        if (v != null) {
            v.imprimirDocumento();
        }
    }
}