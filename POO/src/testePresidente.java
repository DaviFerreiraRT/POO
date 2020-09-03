public class testePresidente {
    public static void main(String[] args) {
        País pais=new País("EUA","Norte Americano");
        Presidente presidente = new Presidente("Obama","01/02/1999");
        
        pais.setNovoPresidente(presidente);
        System.out.println("ANTIGO PRESIDENTE");
        pais.exibir();
        
        Presidente novoPresid = new Presidente("Trump","01/05/2001");
        pais.setNovoPresidente(novoPresid);
        System.out.println("NOVO PRESIDENTE");
        pais.exibir();

    }

}