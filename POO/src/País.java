public class País {
    private String nome;
    private String continente;
    private Presidente novoPresidente;

    public País() {
    }

    public País(String nome, String continente) {
        this.nome = nome;
        this.continente = continente;
    }

    public void exibir() {
        System.out.println("Nome do pais:" + nome);
        System.out.println("Nome do continente:" + continente);
        if (novoPresidente != null) {
            novoPresidente.exibir();
        } else {
            System.out.println("Nenhum presidente foi encontrado");
        }
    }

    public void setNovoPresidente(Presidente novoPresidente) {
        this.novoPresidente = novoPresidente;
    }
    public Presidente getNovoPresidente() {
        return novoPresidente;
    }
    public void setNomePais(String nome) {
        this.nome = nome;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getNome() {
        return nome;
    }

    public String getContinente() {
        return continente;
    }

}
