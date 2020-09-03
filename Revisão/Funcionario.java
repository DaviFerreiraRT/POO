public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;
    private Cargo cargo;

    public Funcionario() {
    }

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void mostrar() {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Matricula do funcionário: " + matricula);
        System.out.println("Salário do funcionário: " + salario);
        if(cargo!=null){
            cargo.imprimir();
        }
        else{
            System.out.println("Funcionario sem nenhum cargo alocado");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

   
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    
    }
    public void mudarSalario(double salarioBase){
        this.salario=salarioBase;
    }
}