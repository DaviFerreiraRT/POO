public class Presidente {
    private String nome;
    private String dataPosse;

    public Presidente() {
    }

    public Presidente(String nome, String dataPosse) {
        this.nome = nome;
        this.dataPosse = dataPosse;
    }

    public void exibir() {
        System.out.println("Nome do Presidente: " + nome);
        System.out.println("Data da posse do presidente: " + dataPosse);
    }

    public String getDataPosse() {
        return dataPosse;
    }

    public String getNome() {
        return nome;
    }

    public void setDataPosse(String dataPosse) {
        this.dataPosse = dataPosse;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
