public class testeCarroPessoa {
    public static void main(String[] args) {
        Pessoa proprietario = new Pessoa("Davi", "Cascavel", "(85)996895225", 20);
        Carro novoCarro = new Carro("Huracan", "AEX-4542", 2015, 75.000);

        proprietario.adicionar(novoCarro);
        novoCarro.aplicarDesconto(10);
        proprietario.adicionar(new Carro("Fusca","OIP-4545",1985,10.00));
        // proprietario.mostrar();
        // System.out.println("---- APOS REMOVIDO O VEICULO DO PROPRIETARIO ----");
        // proprietario.remover(novoCarro);

        // proprietario.remover("AEX-4542");
        // proprietario.mostrar();
        // proprietario.pesquisar("AEX-4542");
        // proprietario.pesquisar("cacimbinha");
        proprietario.listar();
        proprietario.remover("AEX-4542");
        proprietario.listar();
        /*
         * proprietario.setCarro(carro); // proprietario.mostrar();
         * System.out.println("-------REMOVENDO CARRO DO PROPRIETARIO---------");
         * proprietario.removeCarro(carro); proprietario.mostrar();
         * System.out.println("-----------DEPOIS DE REMOVER O CARRO---------");
         * 
         * proprietario.setCarro(carro);
         * System.out.println("---------- APOS ADICIONAR O NOVO VEICULO---------");
         * proprietario.mostrar();
         */
    }
}
