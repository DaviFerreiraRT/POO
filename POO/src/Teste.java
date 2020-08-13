public class Teste {
    public static void main(String[] args) {
        Data hoje=new Data();
        hoje.dia=13;
        hoje.mes=8;
        hoje.ano=2020;
        hoje.exibir();
        hoje=new Data();
        hoje.dia=21;
        hoje.exibir();
    }
}