package Frota;

import Exceptions.*;
import Veiculos.Veiculo;
import java.util.*;

public class Frota {

    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    public void incluir(Veiculo novoVeiculo) throws VeiculoNuloException {
        if (novoVeiculo == null) {
            throw new VeiculoNuloException();
        } else {
            veiculos.add(novoVeiculo);
        }
    }

    public void excluirPorPlaca(String placa) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                veiculos.remove(v);
                System.out.println("Veiculo removido com exito!");
            }
        }
        System.out.println("Veiculo não encontrado!");
    }

    public void excluirPorChassi(long chassi) throws ChassiNaoLocalizadoException {
        for (Veiculo v : veiculos) {
            if (v.getChassi() == chassi) {
                veiculos.remove(v);
                System.out.println("Veiculo removido com exito!");
                return;
            }
        }
        throw new ChassiNaoLocalizadoException(chassi);
    }

    public void excluirPorAno(int ano) {
        boolean veiculoEncontrado = true;
        while (veiculoEncontrado) {
            for (int i = 0; i < veiculos.size(); i++) {
                Veiculo v = veiculos.get(i);
                if (v.getAno() == ano) {
                    veiculos.remove(v);
                    System.out.println("Veiculo removido com exito!");
                    break;
                } else if (i == veiculos.size() - 1) {
                    veiculoEncontrado = false;
                }
            }
        }
    }

    public void consultaPorPlaca(String placa) throws PlacaNaoLocalizadaException {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Veiculo com nome " + v.getPlaca() + " encontrado!");
            }
        }
        throw new PlacaNaoLocalizadaException(placa);
    }

    public void consultaPorChassi(long chassi) {
        for (Veiculo v : veiculos) {
            if (v.getChassi() == chassi) {
                System.out.println("Veiculo com chassi " + v.getChassi() + " encontrado!");
                break;
            }
        }
        System.out.println("Veiculo não encontrado!");
    }

    public void aumentarPrecoPlaca(String placa, double aumento) throws AumentoNegativoException {
        if (aumento > 0) {
            for (Veiculo v : veiculos) {
                if (v.getPlaca().equals(placa)) {
                    v.aumentarPreco(aumento);
                    System.out.println("Novo preço com aumento: " + aumento);
                }
                return ;
            }
        } else {
            throw new AumentoNegativoException(aumento);
        }

    }

    public void aumentarPrecoChassi(long chassi, float aumento) {
        for (Veiculo v : veiculos) {
            if (v.getChassi() == chassi) {
                v.aumentarPreco(aumento);
            }
        }
    }

    public void reduzirPrecoChassi(long chassi, float reducao) {
        for (Veiculo v : veiculos) {
            if (v.getChassi() == chassi) {
                v.reduzirPreco(reducao);
            }
        }
    }

    public void reduzirPrecoPlaca(String placa, float reducao) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                v.reduzirPreco(reducao);
            }
        }
    }

    public void listar() {
        ListIterator<Veiculo> it = veiculos.listIterator();
        while (it.hasNext()) {
            System.out.println("----NOVO VEICULO----");
            it.next().exibir();
        }
    }
}
