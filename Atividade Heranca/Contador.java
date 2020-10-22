public class Contador extends Funcionario {
    public Contador(String nome, int matricula, char sexo, String dataNascimento, int numInscricao) {
        super(nome, matricula, sexo, dataNascimento);
        this.numInscricao=numInscricao;
    }

    private int numInscricao;

    public void setNumInscricao(int numInscricao) {
        this.numInscricao = numInscricao;
    }
    public int getNumInscricao() {
        return numInscricao;
    }
    @Override
    public void recebeSalario() {
        System.out.println("Contador recebendo salario");
    }
    @Override
    public void imprimir() {
        
        super.imprimir();
        System.out.println("Numero da inscrição eh: "+numInscricao);
    }

}
