public class Editora {
    private String nome;
    private String endereco;
    private int cnpj;

    public Editora ( String nome, String endereco, int cnpj){
        this.nome=nome;
        this.endereco=endereco;
        this.cnpj=cnpj;

    }
    public Editora ( String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }

    public void exibirEditora(){
        System.out.println("Nome da editora: "+nome);
        System.out.println("Endereco da editora: "+endereco);
        System.out.println("CNPJ da editora: "+cnpj);
    }
    public void alterarEndereco(String novoEndereco){
        this.endereco=novoEndereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public int getCnpj() {
        return cnpj;
    }
}
