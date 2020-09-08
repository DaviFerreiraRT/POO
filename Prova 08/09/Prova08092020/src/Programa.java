public class Programa {
    public static void main(String[] args) {
        Marca marca1 = new Marca(11, "Nakata");
        Marca marca2 = new Marca(22, "Heliar");
        marca1.mostrar("-------Primeira Marca----------");
        marca2.mostrar("---------Segunda Marca---------");

        Peca peca1 = new Peca("111", "Amortecedor");
        Peca peca2 = new Peca("222", "Bateria", 400.00);
        peca1.setMarca(marca1);
        peca2.setMarca(marca2);
        System.out.println("--------PRIMEIRA MARCA E PECA--------");
        peca1.imprimir();
        System.out.println("--------SEGUNDA MARCA E PECA--------");
        peca2.imprimir();
        peca2.aumentarPreco(22, 10);
        System.out.println("--------APOS AUMENTO--------");
        peca2.imprimir();

    }
}
