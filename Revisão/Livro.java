public class Livro {
    private String titulo;
    private int isbn;
    private double preco;

    public Livro (){

}  
      public Livro(String titulo, int isbn){
        this.titulo=titulo;
        this.isbn=isbn;
}
    public Livro(String titulo, int isbn,double preco){
        this.titulo=titulo;
        this.isbn=isbn;
        this.preco=preco;
}
 

    public void exibir(){
        System.out.println("Nome do livro: "+titulo);
        System.out.println("ISBN do livro: "+isbn);
        System.out.println("Valor do livro: "+preco);
    }

}

