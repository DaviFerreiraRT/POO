public class Teste {
    public static void main(String[] args) {
        Data hoje=new Data();
        hoje.dia=13;
        hoje.mes=8;
        hoje.ano=2020;
        System.out.println("Dia do ano: "+hoje.dia);
        System.out.println("O mes do ano: "+hoje.mes);
        System.out.println("O ano: "+hoje.ano);
    
        //Nova instancia de hoje é criada
        hoje=new Data();
        hoje.dia=21;
        hoje.mes=5;
        hoje.ano=2019;
        hoje.exibir();
    }
}