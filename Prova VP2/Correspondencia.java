public class Correspondencia {
    protected double peso;
    protected double preco;
    protected String dataDoEnvio;
    protected String dataDoRecebimento;
    protected String estado;


    public Correspondencia(double peso, double preco){
        this.peso=peso;
        this.preco=preco;
    }
    public Correspondencia(double peso, double preco, String dataDoEnvio )
    {
        this(peso, preco);
        this.dataDoEnvio=dataDoEnvio;
    }

    public void enviar(){
        this.dataDoEnvio+="01/01/2000";
        this.estado="Enviado";
    }
    public void enviar(String data){

        this.dataDoEnvio+=data;
        this.estado="Enviado";
    }

    public boolean conferirPreco(){
        if((this.peso<=200 && this.preco==1.4)){
          return true;
        }else if((this.peso<=600 && this.preco==2.8)){
          return true;
        }else if((this.peso>600 && this.preco==4)){
          return true;
        }else{
          return false;
        }
      }
    
    public String getDataDoEnvio() {
        return dataDoEnvio;
    }
    public String getDataDoRecebimento() {
        return dataDoRecebimento;
    }
    public String getEstado() {
        return estado;
    }
    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }
    public void setDataDoEnvio(String dataDoEnvio) {
        this.dataDoEnvio = dataDoEnvio;
    }
    public void setDataDoRecebimento(String dataDoRecebimento) {
        this.dataDoRecebimento = dataDoRecebimento;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
