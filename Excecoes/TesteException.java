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
            est.atribuirNota(5, 10);
            est2.atribuirNota(4, 11);

        } catch (ProvaInexistenteException e) {
            System.out.println("Prova inexistente...");
        } catch (NotaInvalidaException e) {
            System.out.println("Atribuição de nota invalida!");
        }
        System.out.println("Após o tratamento do erro...");

    }

}
