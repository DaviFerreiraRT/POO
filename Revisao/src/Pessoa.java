public class Pessoa {
    private String nome;
    private String endereco;
    private String telephone;
    private int idade;
    private int totalCarros;

    Carro carros[] = new Carro[5];

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

    public void listar() {
        System.out.println("Nome da pessoa eh: " + nome);
        System.out.println("Endereco da pessoa: " + endereco);
        System.out.println("Telefone da pessoa: " + telephone);
        System.out.println("Idade da pessoa: " + idade);
        if (carros != null) {
            for (int i = 0; i < carros.length; i++) {
                if (carros[i] != null) {
                    carros[i].visualizar();
                }
            }
        } else {
            System.out.println("Nenhum veiculo informado!");
        }
    }

    public void remover(Carro carro) {
        boolean existeCarro = false;
        int index = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == carro) {
                existeCarro = true;
                index = i;
                break;
            }
        }
        if (existeCarro) {
            for (int i = index; i < carros.length - 1; i++) {
                carros[i] = carros[i + 1];
            }
            carros[carros.length - 1] = null;
            totalCarros--;
            System.out.println("Carro do proprietário " + getNome() + " removido!");
        }
    }

    public void remover(String pla) {
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] != null && carros[i].getPlaca() == pla) {
                carros[i].setPlaca(null);
                System.out.println("-------Placa removida!--------");
                break;

            }
        }
    }

    public void adicionar(Carro carro) {
        this.carros[totalCarros] = carro;
        totalCarros++;
    }

    public Carro pesquisar(String pla){
        for(int i = 0; i< carros.length;i++){
            if(carros[i]!=null && carros[i].getPlaca()==pla){
                System.out.println("Numero da placa encontrada!\nPlaca requistada: "+ pla);
                return carros[i];
            }
        }
        System.out.println("Placa não encontrada!");
        return null;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCarros(int carros) {
        this.totalCarros = carros;
    }

    public int getCarros() {
        return totalCarros;
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

    public void setCarro(Carro[] carro) {
        this.carros = carro;
    }

    public Carro[] getCarro() {
        return carros;
    }

    /*
     * public void removeCarro(Carro carro) { this.carros = null; }
     */
}
