public class CorrespondenciaAR extends Correspondencia {
    private boolean avisoDeRecebimento;

    public CorrespondenciaAR(double peso, double preco, String dataDoEnvio) {
        super(peso, preco, dataDoEnvio);
    }

    public CorrespondenciaAR(double peso, double preco, String dataDoEnvio, boolean avisoDeRecebimento) {
        this(peso, preco, dataDoEnvio);
        this.avisoDeRecebimento = avisoDeRecebimento;
    }

    public boolean conferirPreco() {
        if (this.peso<= 600 && this.preco==6.00) {
            return true;
        } 
        else if (this.preco==8.00) {
            
            return true;
        }
        else{
            return false;
        }
    }   

}
