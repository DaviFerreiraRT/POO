import java.util.ArrayList;
import java.util.ListIterator;

public class PessoaLista {
    private String nome;
    private String endereco;
    private String telephone;
    private int idade;

    private ArrayList<Carro> carros = new ArrayList<Carro>();

    public PessoaLista() {

    }

    public PessoaLista(String nom, int id) {
        this.nome = nom;
        this.idade = id;

    }

    public PessoaLista(String nom, String tel, int id) {
        this.nome = nom;
        this.telephone = tel;
        this.idade = id;

    }

    public PessoaLista(String nom, String ender, String tel, int id) {
        this.nome = nom;
        this.endereco = ender;
        this.telephone = tel;
        this.idade = id;

    }

    public void listar() {
        ListIterator<Carro> cit = carros.listIterator();
        while (cit.hasNext()) {
            System.out.println("Carro de " + this.nome + " sendo exibido ");
            cit.next().visualizar();
        }
    }

    public void mostrar() {
        System.out.println("Nome do(a) proprietario eh: " + nome);
        System.out.println("Endereco do(a) proprietario: " + endereco);
        System.out.println("Telefone do(a) proprietario: " + telephone);
        System.out.println("Idade do(a) proprietario: " + idade);
        for (Carro i : carros) {
            i.visualizar();
        }
    }

    public boolean remover(Carro carro) {
        System.out.println("Carro removido");
        return carros.remove(carro);
    }

    public boolean remover(String pla) {
        for (Carro i : carros) {
            if (i.getPlaca().equals(pla)) {
                carros.remove(i);
                System.out.println("Carro com placa " + i.getPlaca() + " removido!");
                return true;
            }
        }
        System.out.println("Nenhum carro foi encontrado!");
        return false;
    }

    public void adicionar(Carro carro) {
        carros.add(carro);
    }

    public Carro pesquisar(String pla) {
        for (Carro i : carros) {
            if (i.getPlaca().equals(pla)) {
                System.out.println("Carro com placa " + i.getPlaca() + " encontrado");
                return i;
            }
        }
        System.out.println("Nenhum veiculo encontrado!");
        return null;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
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

    /*
     * public void removeCarro(Carro carro) { this.carros = null; }
     */
}
