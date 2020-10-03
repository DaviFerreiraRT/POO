public class testePessoaCarroLista {
    public static void main(String[] args) {
        
    PessoaLista p1 = new PessoaLista("Davi", 1);
    Carro c1 = new Carro("FIAT", "PVJ-7571",2014,70.00);
    Carro c2 = new Carro ("FIAT","OIM-8643",2012,100.00);
    p1.adicionar(c1);
    p1.adicionar(c2);
    c2.aplicarDesconto(10);
    p1.remover(c1);
    p1.remover("OIM-8643");
    p1.listar();
    
    }
    
    

    

}
