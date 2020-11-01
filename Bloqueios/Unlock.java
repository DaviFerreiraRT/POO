public class Unlock {
    private String U = "UNLOCK";
    private String S = "SHARED";
    private String X = "EXCLUSIVE";
    private String D = "Item de dado";
    private String V = "Vazio";
    private String LR = "Lista_Read";
    private String LW = "Lista_Wait";
    private String R = "Remover";

    public void testar() {
        if (R(D) == LR) {
            if (LR == V) {
                if (LW != V) {
                    System.out.println("REMOVE PRIMEIRO ELEMENTO DA FILA_WAIT(D) E FAZ O LOCK DESEJADO!");
                }
            }
        } else {
            System.out.println("Tipo de bloqueio= " + U);
        }

        if (LW != V) {
            System.out.println("REMOVE O PRIMEIRO ELEMENTO DA FILA_WAIT(D) E FAZ O LOCK DESEJADO");
        } else {
            System.out.println("Tipo de bloqueio= " + U);
        }

    }
}
