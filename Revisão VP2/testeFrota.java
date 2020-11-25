public class testeFrota {
  public static void main(String[] args) {

    FrotaAntigo f = new FrotaAntigo();
    CarroPasseio cp = new CarroPasseio("OEX-4545", 7845135, 2012, 7500, 220, 62000, 5, "PRETO", "SUV");
    CaminhaoVP2 ca= new CaminhaoVP2("AIM-7871", 7854568, 1991, 1470, 160, 200000, 4, 78500, 5, 30);
    CaminhaoVP2 caq= new CaminhaoVP2("QOP-7515", 7854569, 1991, 1470, 160, 200000, 4, 78500, 4, 25);

    

    f.incluir(ca);
    f.incluir(cp);
    f.incluir(caq);
    //f.listar();
    f.excluirPorAno(1991);     

  
    System.out.println("APOS EXCLUIR");

    f.listar();


  
  }  
}
