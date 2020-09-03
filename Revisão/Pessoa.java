public class Pessoa {
    private String nome;
    private String endereco;
    private String telephone;
    private int idade;
    Carro carro;

    public Pessoa() {

    }

    public Pessoa(String nom, int id) {
        this.nome = nom;
        this.idade = id;

    }

    public Pessoa(String nom, String tel, int id) {
        this.nome = nom;
        this.telephone = tel;
        this.idade = id;

    }

    public Pessoa(String nom, String ender, String tel, int id) {
        this.nome = nom;
        this.endereco = ender;
        this.telephone = tel;
        this.idade = id;

    }

    public void mostrar() {
        System.out.println("Nome da pessoa é: " + nome);
        System.out.println("Endereço da pessoa: " + endereco);
        System.out.println("Telefone da pessoa: " + telephone);
        System.out.println("Idade da pessoa: " + idade);
        if (carro != null) {
            carro.visualizar();
        } else {
            System.out.println("Essa pessoa não tem nenhum veiculo cadastrado! ");
        }
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void removeCarro(Carro carro) {
        this.carro=null;
    }
}
