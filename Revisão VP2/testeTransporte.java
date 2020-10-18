import java.io.IOException;

public class testeTransporte {
    public static void main(String[] args) {
        /*
         * Transporte t = new Transporte ("U", "AVIAO",555, 800); t.exibir();
         * t.moverSe(5); t.abastecer(10);
         */
        Automovel a = new Automovel("A", "CARRO", 560, 420, "AEX-4542");
        a.exibir();
        a.moverSe(8);
        a.abastecer(5);

        Aviao av = new Aviao("AZUL", "AIRPLANE", 1000, 10000, 1222);

        av.moverSe(20);
        av.exibir();
        
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
           
            e.printStackTrace();
        }
    }
}
