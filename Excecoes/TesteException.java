public class TesteException {
    public static void main(String[] args) {
        /*
         * try { int x = 10/0; int [] ar = new int [3]; ar[4]=0;
         * 
         * } catch (IndexOutOfBoundsException e ){
         * System.out.println("Indice fora dos limites!"); }
         * 
         * 
         * catch (ArithmeticException e) {
         * System.out.println("Divisão inválida, tente novamemnte..."); }
         * System.out.println("Fora do tratamento de Exceções!"); }
         */
        Estudante est = new Estudante();
        Estudante est2 = new Estudante();
        try {
            est.atribuirNota(3, 10);
            est2.atribuirNota(4, 11);

        } catch (ProvaInexistenteException e) {
            System.out.println(e.getMessage());
            System.out.println("Numero da prova invalida:" + e.getProvaInvalida());
            System.out.println("---Pilha de execução do erro:---");
            e.printStackTrace();
            
        } catch (NotaInvalidaException e) {
            System.out.println("Erro: Tentativa de lançar nota inválida!");
            System.out.println("Nota invalida: " + e.getNotaInvalida());
            System.out.println("---Pilha de execução do erro:---");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Sempre passa por aqui.");
        }

    }

}
