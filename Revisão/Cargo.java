public class Cargo {
    private String nome;
    private int codigo;
    private double salarioBase;

    public Cargo() {
    }

    public Cargo(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Cargo(String nome, int codigo, double salarioBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.salarioBase = salarioBase;
    }
    public void imprimir(){
        System.out.println("Nome do cargo: "+nome);
        System.out.println("Codigo do cargo: "+codigo);
        System.out.println("Salario base do cargo: "+salarioBase);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

}
