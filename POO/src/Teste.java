public class Teste {
    public static void main(String[] args) {
        Data hoje = new Data();
        /*
         * hoje.dia = 13; hoje.mes = 8; hoje.ano = 2020;
         */
        hoje.exibir("Criado");
        /*
         * System.out.println("Dia do ano: " + hoje.dia);
         * System.out.println("O mes do ano: " + hoje.mes); System.out.println("O ano: "
         * + hoje.ano);
         */

        // Nova instancia de hoje é criada
        hoje = new Data();
        hoje.dia = 21;
        hoje.mes = 5;
        hoje.ano = 2019;
        hoje.exibir("Antes de incrementar, data original");
        hoje.incrementarAno();
        hoje.exibir("Depois de Incrementar");
        hoje.incrementarAno(3);
        hoje.exibir("Depois de incrementar 3 anos");

        Data nova = new Data (18,8,2020);

        nova.exibir("Nova data");

        Data outroAno=new Data(2010);
        outroAno.exibir("Criando somente ano ");

    }
}