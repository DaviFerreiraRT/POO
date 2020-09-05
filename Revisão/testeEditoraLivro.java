public class testeEditoraLivro {
    public static void main(String[] args) {
        Livro livro= new Livro("Harry Potter, A Ordem da Fênix",6969,50.0);
        Editora editora = new Editora("JK ROLLING","London, UK",245748);
        livro.setEditora(editora);
        livro.getEditora().setEndereco("Manchester,UK ");
        System.out.println(livro.getEditora().getCnpj());

        Livro livro2 = new Livro("Revolução dos Bichos",7575,0);
        livro2.exibir();
    }
}
