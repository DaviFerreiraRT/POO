public class testeRemedio {
    public static void main(String[] args) {

        Remedio teste1 = new Remedio(1234, "Dipirona");
        System.out.println("-------PRIMEIRO REMEDIO---------------");
        teste1.setDataDeFabricacao("14/5/2020");
        teste1.setPreco(55.60);
        teste1.reduzirPreco(10.60);
        teste1.setValidade(5);
        teste1.imprimir();
        if (teste1.ehValido(2)) {
            System.out.println("O rem�dio ainda est� no prazo de validade!");
        } 
        else {
            System.out.println("O rem�dio est� fora do prazo de validade");
        }

        teste1.aumentarPreco(20.0);
        teste1.aumentarPreco();
        teste1.imprimir();

        Remedio teste2 = new Remedio(12356, "Nimesulida", "20/07/2020", 90, 7.50);
        System.out.println("-------SEGUNDO REMEDIO---------------");
        teste2.aumentarPreco(10);
        if (teste2.ehValido(20)) {
            System.out.println("O rem�dio ainda est� no prazo de validade!");
        } 
        else {
            System.out.println("O rem�dio est� fora do prazo de validade!");
        }

        teste2.imprimir();

        Remedio teste3 = new Remedio(1453, "Dorflex", "25/07/2019", 120);
        System.out.println("-------TERCEIRO REMEDIO---------------");
        teste3.setPreco(5.50);
        teste3.aumentarPreco(20);
        if (teste3.ehValido(10)) {
            System.out.println("O rem�dio ainda est� no prazo de validade!");
        } 
        else {
            System.out.println("O rem�dio est� fora do prazo de validade!");
        }
        teste3.imprimir();

    }

}
