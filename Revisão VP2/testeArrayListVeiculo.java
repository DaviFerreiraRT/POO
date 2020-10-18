import java.util.*;

public class testeArrayListVeiculo  {
    public static void main(String[] args) {
        ArrayList<VeiculoNovo> veiculos = new ArrayList <VeiculoNovo>();
        
        Caminhao c = new Caminhao("HVP-4585", 554726, 2010, 4550, 160, 70000, 4, 10, 20, 7);

        carroPasseio ca = new carroPasseio("OIM-8465", 5545445, 2014, 940, 220, 4500, 5, "BRANCO", "SUV");

        PecaNovo p = new PecaNovo(145, "bateria","HELIAR");
    
        
        veiculos.add(c);
        veiculos.add(ca);
        for(VeiculoNovo vi : veiculos){
            vi.adicionar(p);
            vi.exibir();
        }
        
    }
}
