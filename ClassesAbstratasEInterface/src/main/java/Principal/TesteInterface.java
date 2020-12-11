package Principal;
import Implementacoes.ArCondicionado;
import Implementacoes.Automovel;
import Interfaces.Operacoes;
public class TesteInterface {
    public static void main(String[] args) {
        ArCondicionado  ac= new ArCondicionado();

        Automovel auto = new Automovel();
        testeInterface(ac);
        testeInterface(auto);


    }

    public static void testeInterface(Operacoes op){
        op.ligar();
        op.desligar();
    }
}
