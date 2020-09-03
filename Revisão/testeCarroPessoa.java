public class testeCarroPessoa {
    public static void main(String[] args) {
        Pessoa proprietario = new Pessoa("Davi", "Cascavel", "(85)996895225",20);
        Carro carro = new Carro("Prisma", "AEX-4542",2015, 75.000);

        proprietario.setCarro(carro);
        carro.aplicarDesconto(5);
        proprietario.mostrar();
        }
}
