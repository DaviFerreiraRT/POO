public class TesteInterface {
    public static void main(String[] args) {
        ArCondicionado  ac= new ArCondicionado();

        AutomovelComInterface auto = new AutomovelComInterface();
        testeInterface(ac);
        testeInterface(auto);


    }

    public static void testeInterface(Operacoes op){
        op.ligar();
        op.desligar();
    }
}
