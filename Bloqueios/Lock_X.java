public class Lock_X {

    private String U = "UNLOCK";
    private String S = "SHARE";
    private String X = "EXCLUSIVE";
    private String D = "Item de dado";

    public void teste() {
        if (D == U) {
            D = X;
        }

        if (D == S) {
            System.out.println("Inserir tx na fila_wait(D)");
        }
        if (D == X) {
            System.out.println("Inserir tx na fila_wait(D)");

        }

    }

}
