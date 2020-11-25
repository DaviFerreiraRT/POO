
public class ProgramaTeste {
    public static void main(String[] args) {
        Frota f = new Frota();
        Caminhao c = new Caminhao("HVR-0608", 5451257, 1997, 1000, 150, 50000, 4, 12000, 5, 30);
        CarroPasseio cp = new CarroPasseio("AIN-5468", 2264623, 2015, 750, 220, 75000, 5, "Preto", "Sedan");

        try {
            f.incluir(c);
            f.incluir(cp);
            f.consultaPorPlaca("HVR-0452");
            f.excluirPorChassi(548545);
            f.aumentarPrecoPlaca("HVR-0608", -1);
        } catch (VeiculoNuloException e) {
           
        } catch (PlacaNaoLocalizadaException e) {
           
        } catch (ChassiNaoLocalizadoException e) {
           
        } catch (AumentoNegativoException e) {
            System.out.println("Erro: Aumento Inválido");

        } catch (Exception e) {
            System.out.println("Erro desconhecido!");
        }
    }

}