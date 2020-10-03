public class testePessoaCarroLista {
    public static void main(String[] args) {
        
    PessoaLista p1 = new PessoaLista("Davi", 1);
    Carro c1 = new Carro("Fiat", "PVJ-7571",2014,70.000);
    Carro c2 = new Carro ("Fiat","OIM-8643",2012,100.000);
    Carro c3 = new Carro ("Renault","IOM-4468",2001,28.000);
    p1.adicionar(c1);
    p1.adicionar(c2);
    p1.adicionar(c3);
    c2.aplicarDesconto(10);
    c3.aplicarDesconto(55);
    p1.pesquisar("OIM-8643");
    //p1.listar();
    
    }
    
    

    

}
