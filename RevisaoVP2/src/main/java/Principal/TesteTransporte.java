package Principal;

import Transportes.*;

public class TesteTransporte {

    public static void main(String[] args) {

        Transporte t = new Transporte("MCV", "AEREO", 555, 800);
        t.exibir();
        t.moverSe(5);
        t.abastecer(10);

        Automovel a = new Automovel("SIENA", "CARRO", 560, 420, "AEX-4542");
        a.exibir();
        a.moverSe(8);
        a.abastecer(5);

        Aviao av = new Aviao("AZUL", "AVIAO", 1000, 10000, 1222);

        av.moverSe(20);
        av.exibir();

    }
}
