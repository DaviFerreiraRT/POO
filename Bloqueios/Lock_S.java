public class Lock_S {

    private String U = "UNLOCK";
    private String S = "SHARED";
    private String X = "EXCLUSIVE";
    private String D = "Item de dado";

    public void teste() {
        if (D == U) {
            System.out.println("Inserir tx na lista_read (D)");
        } else if (D == S) {
            System.out.println("Inserir tx na lista_read(D)");
        } else if (D == X) {
            System.out.println("Inserir tx na fila_wait(D)");
        }
    }

}
