public class testeFunc {
     public static void main(String[] args) {
         
        Func funcionario1= new Func(1, "Davi", "06/05/2000", 'M');
        funcionario1.setAposentado(true);
        funcionario1.setTempoDeServico(5);
        funcionario1.incrementarTempoServico(5);
        funcionario1.mostrar();
     } 
}
