public class Remedio {

    private int codigo;
    private String nome;
    private String dataDeFabricacao;
    private int validade;
    private double preco;

    public Remedio(){

    }

    public Remedio(int codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
        
    }
    public Remedio(int codigo, String nome,String dataDeFabricacao){
        this.codigo=codigo;
        this.nome=nome;
        this.dataDeFabricacao=dataDeFabricacao;
    }
    public Remedio(int codigo, String nome,String dataDeFabricacao, int validade){
        this.codigo=codigo;
        this.nome=nome;
        this.validade=validade;
        this.dataDeFabricacao=dataDeFabricacao;
    }

    public Remedio(int codigo, String nome,String dataDeFabricacao, int validade, double preco){
        this.codigo=codigo;
        this.nome=nome;
        this.validade=validade;
        this.dataDeFabricacao=dataDeFabricacao;
        this.preco=preco;
    }

    public void reduzirPreco(double valor) {
        preco = preco - valor;
        System.out.println("O novo valor do remédio é :" + preco);
    }

    public boolean ehValido(int data) {
        if (this.validade <= data) {
            return true;
        } else {
            
            return false;
        }
    }

    public void imprimir() {
        System.out.println("O codigo do produto é :" + codigo);
        System.out.println("O nome do produto é :" + nome);
        System.out.println("A data do produto é "+dataDeFabricacao);
        System.out.println("O preço do produto é de R$ " + preco);
        System.out.println("A validade do produto é de " + validade + " dias");

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