public class testeFrota {
  public static void main(String[] args) {
    VeiculoNovo v = new VeiculoNovo("OIM-4545", 4545, 2010, 750, 220, 4500, 5);
    Frota f = new Frota();
    f.incluir(v);
    f.consultaPorChassi(4545);
    f.aumentarPrecoChassi(4545, 5);
    f.listar();
  
  }  
}
