public class testeCarroPessoa {
    public static void main(String[] args) {
        Pessoa proprietario = new Pessoa("Davi", "Cascavel", "(85)996895225",20);
        Carro carro = new Carro("Prisma", "AEX-4542",2015, 75.000);

        proprietario.setCarro(carro);
        carro.aplicarDesconto(5);
        proprietario.mostrar();


        Pessoa Vini=new Pessoa("Vinicius","Iguatu","9696969696",19);
        Carro carrovini = new Carro("TTS","CUS6969",2020,80.000);
        
        Vini.setCarro(carrovini);
        carrovini.aplicarDesconto(1);
        Vini.mostrar();
        }
}
