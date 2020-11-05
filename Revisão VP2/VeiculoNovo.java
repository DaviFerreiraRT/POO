import java.util.ArrayList;

public abstract class VeiculoNovo implements Exibivel{
    protected String placa;
    protected long chassi;
    protected int ano;
    protected int peso;
    protected float velocMax;
    protected float preco;
    protected int capacidade;
    protected MotorNovo motor;
    private ArrayList<PecaNovo> pecas = new ArrayList<PecaNovo>();

    public VeiculoNovo() {
    }

    public VeiculoNovo(String placa, long chassi, int ano, int peso, float velocMax, float preco, int capacidade) {
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
    public void setPecas(ArrayList<PecaNovo> pecas) {
        this.pecas = pecas;
    }
    public void setMotor(MotorNovo motor) {
        this.motor = motor;
    }
    public MotorNovo getMotor() {
        return motor;
    }
    public ArrayList<PecaNovo> getPecas() {
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

    public void adicionar(PecaNovo e) {
        pecas.add(e);
    }

    public void consultar(int codigo) {
        for (PecaNovo i : pecas) {
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
