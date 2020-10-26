import java.util.ArrayList;
import java.util.ListIterator;

public class Frota {
    private ArrayList<VeiculoNovo> veiculos = new ArrayList<VeiculoNovo>();

    public void incluir(VeiculoNovo novoVeiculo) {
        veiculos.add(novoVeiculo);
    }

    public void excluirPorPlaca(String placa) {
        for (VeiculoNovo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                veiculos.remove(v);
                System.out.println("Veiculo removido com exito!");
            }
        }
        System.out.println("Veiculo não encontrado!");
    }

    public void excluirPorChassi(long chassi) {
        for (VeiculoNovo v : veiculos) {
            if (v.getChassi() == chassi) {
                veiculos.remove(v);
                System.out.println("Veiculo removido com exito!");
                return;
            }
        }
        System.out.println("Veiculo não encontrado!");
    }

    public void excluirPorAno(int ano) {
        boolean veiculoEncontrado = true;
        while (veiculoEncontrado) {
            for (int i = 0; i < veiculos.size(); i++) {
                VeiculoNovo v = veiculos.get(i);
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

    public void consultaPorPlaca(String placa) {
        for (VeiculoNovo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                System.out.println("Veiculo com nome " + v.getPlaca() + " encontrado!");
            }
        }
        System.out.println("Veiculo não encontrado!");
    }

    public void consultaPorChassi(long chassi) {
        for (VeiculoNovo v : veiculos) {
            if (v.getChassi() == chassi) {
                System.out.println("Veiculo com chassi " + v.getChassi() + " encontrado!");
                break;
            }
        }
        System.out.println("Veiculo não encontrado!");
    }

    public void aumentarPrecoPlaca(String placa, float aumento) {
        for (VeiculoNovo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                v.aumentarPreco(aumento);
                System.out.println("Novo preço com aumento: " + aumento);
            }
        }
    }

    public void aumentarPrecoChassi(long chassi, float aumento) {
        for (VeiculoNovo v : veiculos) {
            if (v.getChassi() == chassi) {
                v.aumentarPreco(aumento);
            }
        }
    }

    public void reduzirPrecoChassi(long chassi, float reducao) {
        for (VeiculoNovo v : veiculos) {
            if (v.getChassi() == chassi) {
                v.reduzirPreco(reducao);
            }
        }
    }

    public void reduzirPrecoPlaca(String placa, float reducao) {
        for (VeiculoNovo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                v.reduzirPreco(reducao);
            }
        }
    }

    public void listar() {
        ListIterator<VeiculoNovo> it = veiculos.listIterator();
        while (it.hasNext()) {
            System.out.println("----NOVO VEICULO----");
            it.next().exibir();
        }
    }
}
