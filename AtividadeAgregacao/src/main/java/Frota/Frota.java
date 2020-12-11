package Frota;

import Veiculo.VeiculoAgregacao;

public class Frota {

    private VeiculoAgregacao veic[] = new VeiculoAgregacao[5];

    int totalFrota = 0;

    public void adicionar(VeiculoAgregacao ve) {
        this.veic[totalFrota] = ve;
        totalFrota++;
    }

    public void excluir(String placa) {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] != null && veic[i].getPlaca().equals(placa)) {
                veic[i] = null;
            }
        }
        System.out.println("Veiculo com placa " + placa + " removido!");
    }

    public void excluir(long chassi) {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] != null && veic[i].getChassi() == chassi) {
                veic[i] = null;
            }
        }
    }

    public void excluir(int ano) {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] != null && veic[i].getAno() == ano) {
                veic[i] = null;
            }
        }
    }

    public void pesquisarPlaca(String placa) {
        for (int i = 0; i < veic.length; i++) {
            if (veic != null && veic[i].getPlaca().equals(placa)) {
                System.out.println("Veiculo de placa " + placa + " encontrado!");
            }
        }
    }

    public void pesquisarPlaca(long chassi) {
        for (int i = 0; i < veic.length; i++) {
            if (veic != null && veic[i].getChassi() == chassi) {
                System.out.println("Veiculo com chassi " + chassi + " encontrado!");
            }
        }
    }

    public void aumentarPreco(String placa, int aumento) {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] != null && veic[i].getPlaca().equals(placa)) {
                veic[i].aumentarPreco(aumento);
            }
        }
    }

    public void aumentarPreco(long chassi, int aumento) {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] != null && veic[i].getChassi() == chassi) {
                veic[i].aumentarPreco(aumento);
            }
        }
    }

    public void reduzirPreco(long chassi, int reducao) {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] != null && veic[i].getChassi() == chassi) {
                veic[i].reduzirPreco(reducao);
            }
        }
    }

    public void reduzirPreco(String placa, int reducao) {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] != null && veic[i].getPlaca().equals(placa)) {
                veic[i].reduzirPreco(reducao);
            }
        }
    }

    public void listar() {
        for (int i = 0; i < veic.length; i++) {
            if (veic[i] != null) {
                System.out.println("DADOS DO " + (i + 1) + "r VEICULO");
                veic[i].exibir();
            }
        }
    }

    public VeiculoAgregacao[] getVeic() {
        return veic;
    }

    public void setVeic(VeiculoAgregacao[] veic) {
        this.veic = veic;
    }
}
