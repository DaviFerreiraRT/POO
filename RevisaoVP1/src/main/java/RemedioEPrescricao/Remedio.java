package RemedioEPrescricao;

public class Remedio {

    private int codigo;
    private String nome;
    private String dataDeFabricacao;
    private int validade;
    private double preco;

    public Remedio() {

    }

    public Remedio(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;

    }

    public Remedio(int codigo, String nome, String dataDeFabricacao) {
        this();
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Remedio(int codigo, String nome, String dataDeFabricacao, int validade) {
        this();
        this.validade = validade;

    }

    public Remedio(int codigo, String nome, String dataDeFabricacao, int validade, double preco) {
        this();
        this.preco = preco;
    }

    public void reduzirPreco(double valor) {
        if (preco - valor >= 0) {
            this.preco -= valor;

        } else {
            System.out.println("------Preço incorreto!-------");
        }
    }

    public boolean ehValido(int data) {

        if (this.validade <= data) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        System.out.println("O codigo do produto eh :" + this.codigo);
        System.out.println("O nome do produto eh :" + this.nome);
        System.out.println("A data do produto eh " + this.dataDeFabricacao);
        System.out.println("O preco do produto eh de R$ " + this.preco);
        System.out.println("A validade do produto eh de " + this.validade + " dias");

    }

    public void aumentarPreco() {
        preco = preco + 1.00;
    }

    public void aumentarPreco(double valor) {
        preco = preco + valor;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getValidade() {
        return validade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }
}
