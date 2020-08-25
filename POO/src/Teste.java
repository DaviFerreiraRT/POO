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
        hoje.setDia(30);
        hoje.setMes(5);
        hoje.setAno(2000);

        int meuDia = hoje.getDia();
        System.out.println("O dia eh: " + meuDia);
        System.out.println("Mostrando novamente o dia: " + hoje.getDia());

        int meuMes = hoje.getMes();
        System.out.println("O mes é: " + meuMes);
        System.out.println("Mostrando novamente o mes: " + hoje.getMes());

        int meuAno = hoje.getAno();
        System.out.println("O ano é: " + meuAno);
        System.out.println("Mostrando novamente o ano: " + hoje.getAno());

        hoje.exibir("Antes de incrementar, data original");
        hoje.incrementarAno();
        hoje.exibir("Depois de Incrementar");
        hoje.incrementarAno(3);
        hoje.exibir("Depois de incrementar 3 anos");

        Data nova = new Data(18, 8, 2020);

        nova.exibir("Nova data");

    }
}