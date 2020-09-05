public class testeEditoraLivro {
    public static void main(String[] args) {
        Livro livro= new Livro("Harry Potter, A Ordem da Fênix",6969,50.0);
        Editora editora = new Editora("JK ROLLING","London, UK",245748);
        livro.setEditora(editora);
        livro.exibir();
        livro.getEditora().setEndereco("Manchester,UK ");
        livro.exibir();
    }
}
