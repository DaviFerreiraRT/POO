public class FuncionarioHeranca {
    private String nome;
    private String funcao;
    private double salario;

    int numFuncionario = 0;

    public FuncionarioHeranca() {
    }

    public FuncionarioHeranca(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
        numFuncionario++;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario = salario + (salario * porcentagem) / 100;
    }

    public void exibir(){
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("Funcão do funcionario: "+this.funcao);
        System.out.println("Salario do funcionario: "+this.salario);
    }
}
