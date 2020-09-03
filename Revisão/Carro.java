public class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private double valor;

    public Carro(){

    }
    public Carro(String mod, String pla){
        this.modelo=mod;
        this.placa=pla;
    }

    public Carro(String mod, String pla,int aa, int val){
        this.modelo=mod;
        this.placa=pla;
        this.ano=aa;
        this.valor=val;
    }

    public void aplicarDesconto(double percentual){
        
        this.valor=valor-(valor*percentual)/100;
    }

    public void visualizar(){
        System.out.println("Modelo do carro:"+modelo+" e ano do veiculo: "+ano+" com placa: "+placa);
        System.out.println("O preço deste carro é de: "+valor+" reais.");
    }


    public int getAno() {
        return ano;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public double getValor() {
        return valor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}


