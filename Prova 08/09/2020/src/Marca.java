public class Marca {
    private int codigo;
    private String nome;

    public Marca() {
        codigo = 0;
        nome = null;
    }

    public Marca(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void mostrar() {
        System.out.println("Nome da marca: " + nome);
        System.out.println("Codigo da marca:" + codigo);

    }

    public void mostrar(String texto) {
        System.out.println(texto);
        mostrar();
    }

}
