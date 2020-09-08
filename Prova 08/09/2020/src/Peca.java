public class Peca {
    private String codigo;
    private String nome;
    private double preco;
    private Marca marca;

    public Peca() {

    }

    public Peca(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Peca(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void imprimir() {
        System.out.println("Codigo da peca: " + codigo);
        System.out.println("Nome da peca: " + nome);
        System.out.println("Preco da peca: " + preco);
        if (marca != null) {
            marca.mostrar();
        } else {
            System.out.println("Nenhuma marca informada");
        }
    }

    public void aumentarPreco(int codMarca, double porcentagem) {
        if (marca.getCodigo() == codMarca) {
            this.preco = preco + (preco * porcentagem) / 100;
        }
    }

}
