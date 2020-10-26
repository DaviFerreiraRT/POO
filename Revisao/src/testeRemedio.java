public class testeRemedio {
    public static void main(String[] args) {

        Remedio teste1 = new Remedio(1234, "Dipirona","14/05/2020",5,14);
        Prescicao p1 = new Prescicao("Davi", "05-10-2014", "Juliana");
        /*System.out.println("-------PRIMEIRO REMEDIO---------------");
        teste1.setDataDeFabricacao("14/5/2020");
        teste1.setPreco(55.60);
        teste1.reduzirPreco(56.60);
        teste1.setValidade(5);
        teste1.imprimir();
        if (teste1.ehValido(2)) {
            System.out.println("O remedio ainda esta no prazo de validade!");
        } 
        else {
            System.out.println("O remedio esta fora do prazo de validade");
        }

        teste1.aumentarPreco(20.0);
        teste1.aumentarPreco();
        teste1.imprimir();

        Remedio teste2 = new Remedio(12356, "Nimesulida", "20/07/2020", 90, 7.50);
        System.out.println("-------SEGUNDO REMEDIO---------------");
        teste2.aumentarPreco(10);
        if (teste2.ehValido(20)) {
            System.out.println("O remedio ainda esta no prazo de validade!");
        } 
        else {
            System.out.println("O remedio esta fora do prazo de validade!");
        }

        teste2.imprimir();

        Remedio teste3 = new Remedio(1453, "Dorflex", "25/07/2019", 120);
        System.out.println("-------TERCEIRO REMEDIO---------------");
        teste3.setPreco(5.50);
        teste3.aumentarPreco(20);
        if (teste3.ehValido(10)) {
            System.out.println("O remedio ainda esta no prazo de validade!");
        } 
        else {
            System.out.println("O remedio estaa fora do prazo de validade!");
        }
        teste3.imprimir();*/
        p1.incluir(teste1);
        teste1.aumentarPreco(5);
        Remedio r2 = new Remedio(4557, "NIMESULIDA", "07/05/2020", 120);
        System.out.println("PRIMEIRO REMEDIO");
        p1.incluir(r2);
        System.out.println("ADICIONANDO SEGUNDO REMEDIO");
        p1.imprimir();
        p1.excluir(1234);


       
        System.out.println("----------- APOS EXCLUIR O REMEDIO----------------");
        p1.imprimir();


        p1.buscar("NIMESULIDA");

        p1.buscar("DorFlex");

    }

}
