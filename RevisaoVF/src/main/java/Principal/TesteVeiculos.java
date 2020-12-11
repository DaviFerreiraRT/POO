package Principal;

import Exceptions.*;
import Veiculos.*;
import Frota.Frota;

public class TesteVeiculos {

    public static void main(String[] args) {
        Frota f = new Frota();
        Caminhao c = new Caminhao("HVR-0608", 5451257, 1997, 1000, 150, 50000,
                4, 12000, 5, 30);
        CarroPasseio cp = new CarroPasseio("AIN-5468", 2264623, 2015, 750, 
                2200, 75000, 5, "Preto", "Sedan");

        try {
            f.incluir(c);
            f.incluir(cp);
            f.incluir(null);
            f.excluirPorChassi(2264623);
            f.aumentarPrecoPlaca("HVR-0608", 4000);
            f.consultaPorPlaca("AIN-5468");
        } catch (VeiculoNuloException e) {
            System.out.println(e.getMessage());
        } catch (ChassiNaoLocalizadoException e) {
            System.out.println(e.getMessage());
            System.out.println("Chassi invalido: "+e.getChassi());
        } catch (AumentoNegativoException e) {
            System.out.println(e.getMessage());
            System.out.println("Valor invalido: "+e.getValor());
        }catch (PlacaNaoLocalizadaException e ){
            System.out.println(e.getMessage());
            System.out.println("Placa invalida: "+e.getPlaca());

        } catch (Exception e) {
            System.out.println("Erro desconhecido!");
        } finally {
            f.listar();
            System.out.println("Programa concluido!");
        }
    }

}
