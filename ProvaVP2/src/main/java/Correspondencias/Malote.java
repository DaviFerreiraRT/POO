package Correspondencias;

import java.util.ArrayList;
import java.util.ListIterator;

public class Malote {

    String dataDeRemessa;
    String destino;
    double pesoTotal;

    public Malote(String destino) {
        this.destino = destino;
    }

    public Malote(String dataDeRemessa, String destino) {
        this(destino);
        this.dataDeRemessa = dataDeRemessa;
    }

    ArrayList<Correspondencia> correspondencias = new ArrayList<>();

    public void adicionar(Correspondencia ca) {
        correspondencias.add(ca);
        pesoTotal += ca.peso;

    }

    public void remover(Correspondencia ca) {
        pesoTotal -= ca.peso;
        correspondencias.remove(ca);
        System.out.println("Removido!");
    }

    public void remeter() {
        ListIterator<Correspondencia> co = correspondencias.listIterator();

        while (co.hasNext()) {
            co.next().enviar(dataDeRemessa);
        }
        System.out.println("Remetendo correspondencias");
    }

    public void conferirPrecos() {
        for (Correspondencia ca : correspondencias) {
            ca.conferirPreco();
        }
        System.out.println("Conferindo precos....");
    }
}
