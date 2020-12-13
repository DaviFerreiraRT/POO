package Negocio;

/**
 *
 * @author davif
 */
import java.util.ArrayList;
import java.util.ListIterator;
import Excecoes.CodigoNaoEncontradoException;
import Excecoes.IdadeInexistenteException;

public class CompanhiaAerea {

    private String nome;
    private long cnpj;
    private ArrayList<Aeronave> aeronaves = new ArrayList<Aeronave>();

    public CompanhiaAerea(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void adquirir(Aeronave e) {
        aeronaves.add(e);
    }

    public void vender(Aeronave e) {
        aeronaves.remove(e);
    }

    public void liberarAterrissagem(String codigo) throws CodigoNaoEncontradoException {
        for (int i = 0; i < aeronaves.size(); i++) {
            if (aeronaves.get(i).getCodigo().equals(codigo)) {
                System.out.println("Aterrisagem autorizada!");
                break;
            }
            if (i == aeronaves.size() - 1) {
                throw new CodigoNaoEncontradoException(codigo);
            }
        }
    }

    public void revisar(int idade) throws IdadeInexistenteException {
        ListIterator<Aeronave> it = aeronaves.listIterator();
        int cont = 0;
        while (it.hasNext()) {
            if (it.next().getIdade() < idade) {
                it.next().fazerRevisao();
                cont++;
            }
        }
        if (cont == 0) {
            throw new IdadeInexistenteException(idade);
        }
    }
}
