public class Aviao extends Transporte {

    private int codigo;

    public Aviao(){};

    public Aviao(String marca, String modelo, double quilometragem, int capacidadeTanque, int codigo){
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.codigo=codigo;

    }

    public void moverSe(double quilometros) {
        if(this.capacidadeTanque>=quilometros/10){
            this.quilometragem+=quilometros;
            this.capacidadeTanque-=quilometros/10;
            System.out.println("O avião voou: "+ quilometragem+" e ficou com total de litros: "+capacidadeTanque);
        }
        else{
         System.out.println("O avião não possui combustivel suficiente!");
        }
    }

    public void exibir() {
        super.exibir();
        System.out.println("Codigo do avião: "+this.codigo);
        

    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
}
