public class testeFrota {
  public static void main(String[] args) {
    VeiculoNovo v = new VeiculoNovo("OIM-4545", 4545, 2010, 750, 220, 4500, 5);
    Frota f = new Frota();
    CarroPasseio cp = new CarroPasseio("OEX-4545", 7845135, 2012, 7500, 220, 62000, 5, "PRETO", "SUV");
    Caminhao ca= new Caminhao("AIM-7871", 7854568, 1991, 1470, 160, 200000, 4, 78500, 5, 30);
    Caminhao caq= new Caminhao("QOP-7515", 7854569, 1991, 1470, 160, 200000, 4, 78500, 4, 25);

    

    f.incluir(ca);
    f.incluir(cp);
    f.incluir(v);
    f.incluir(caq);
    f.excluirPorAno(1991);

    f.listar();


  
  }  
}
