public class Funcionario {
    private String nome;
    private int matricula;
    private char sexo;
    private String dataNascimento;
    private boolean salario;

    public Funcionario ( String nome, int matricula, char sexo, String dataNascimento, boolean salario){
        this.nome=nome;
        this.matricula=matricula;
        this.sexo=sexo;
        this.dataNascimento=dataNascimento;
        this.salario=salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(boolean salario) {
        this.salario = salario;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void imprimir(){
        System.out.println("Nome do funcionario: "+nome);
        System.out.println("Matricula do funcionario: "+matricula);
        System.out.println("Sexo do funcionario: "+sexo);
        System.out.println("Data de nascimente do funcionario"+dataNascimento);
        if(this.salario==true){
            System.out.println("Funcionario recebendo salario!");
        }
        else{
            System.out.println("Funcionario nao esta recebendo salario!");
        }
    }
    
}
