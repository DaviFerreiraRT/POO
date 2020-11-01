public class TesteAparelho {
    public static void main(String[] args) {
        Aparelho tv= new Televisão();

        Aparelho mi = new Microondas();
    
        testaraparelho(tv);
        testaraparelho(mi);
    }
    public static void testaraparelho(Aparelho aparelho){
        aparelho.ligar();
        aparelho.desligar();
    }
}
