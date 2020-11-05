import java.util.ArrayList;

public class Equipamento implements Exibivel {
    private String nome;
    public Equipamento(String nome){
        this.nome=nome;
    }
    private ArrayList<PecaNovo> pecas = new ArrayList<PecaNovo>();

    public void adicionar(PecaNovo peca) {
        pecas.add(peca);
    }

    public void remover(PecaNovo peca) {
        pecas.remove(peca);
    }

    public void exibir() {
        for (PecaNovo i : pecas) {
            i.exibir();
        }
    }

    public void exibir(String texto) {
        System.out.println(texto);
        for (PecaNovo i : pecas) {
            i.exibir();
        }
    }

}
