public class Livro {
    private String titulo;
    private int isbn;
    private double preco;
    private Editora editora;

    public Livro() {
    }

    public Livro(String titulo, int isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public Livro(String titulo, int isbn, double preco) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.preco = preco;
    }

    public void exibir() {
        System.out.println("Nome do livro: " + titulo);
        System.out.println("ISBN do livro: " + isbn);
        System.out.println("Valor do livro:R$" + preco);
        if(editora!=null){
            editora.exibirEditora();
        }
        else{
            System.out.println("Nenhuma editora informada!");
        }
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public Editora getEditora() {
        return editora;
    }
}
