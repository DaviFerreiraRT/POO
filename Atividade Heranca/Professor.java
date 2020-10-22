public class Professor extends Funcionario {
    public Professor(String nome, int matricula, char sexo, String dataNascimento,int numeroHorasAulas) {
        super(nome, matricula, sexo, dataNascimento);
        this.numeroHorasAulas=numeroHorasAulas;
    }

    private int numeroHorasAulas = 0;
    private boolean leciona;
   
    public boolean leciona(){
        if(leciona){
            System.out.println("Lecionando...");
            return true;
        }
        else{
            System.out.println("Não está lecionando...");
            return false;
        }
    }

   public void setLeciona(boolean leciona) {
       this.leciona = leciona;
   }
   

   public void setNumeroHorasAulas(int numeroHorasAulas) {
       this.numeroHorasAulas = numeroHorasAulas;
   }
   public int getNumeroHorasAulas() {
       return numeroHorasAulas;
   }
    @Override
    public void recebeSalario() {
        System.out.println("Professor recebendo salario");
    }
    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        super.imprimir();
        System.out.println("Numero de horas de aula: "+this.numeroHorasAulas);
    }
}
