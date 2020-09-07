public class Func {
    private long cpf;
    private String nome;
    private String dataNascimento;
    private char sexo;
    private int tempoDeServico;
    private boolean aposentado;

    public Func(long cpf, String nome){
        this.cpf=cpf;
        this.nome=nome;
    }
    public Func(long cpf, String nome, String data){
        this.cpf=cpf;
        this.nome=nome;
        this.dataNascimento=data;
    }
    public Func(long cpf, String nome,String data, char sexo){
        this.cpf=cpf;
        this.nome=nome;
        this.dataNascimento=data;
        this.sexo=sexo;
    }
    public boolean ehAposentado(boolean aposentado){
        if(aposentado){
            System.out.println("Funcionario aposentando");
            return true;
        }
        else{
            System.out.println("Funcionario nao eh aposentado");
            return false;
        }
    }

    public void mostrar(){
        System.out.println("CPF: "+cpf);
        System.out.println("NOME:"+nome);
        System.out.println("Data de nascimento: "+dataNascimento);
        System.out.println("Sexo: "+sexo);
        System.out.println("Tempo de servico: "+tempoDeServico);
        ehAposentado(aposentado);
    }   

    public void incrementarTempoServico(){
        this.tempoDeServico=tempoDeServico+1;
    }
    public void incrementarTempoServico(int anos){
        this.tempoDeServico=tempoDeServico+anos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public char getSexo() {
        return sexo;
    }
    public int getTempoDeServico() {
        return tempoDeServico;
    }
}
