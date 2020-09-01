public class Veiculo {
    private String placa;
    private String chassi;
    private Pessoa proprietario;

    public Veiculo(String placa,String chassi){
        this.placa=placa;
        this.chassi=chassi;
    }

public void setPessoa(Pessoa pessoa){
    proprietario=pessoa;
}

public Pessoa getPessoa(){
    return proprietario;
}

public void imprimirDocumento(){
    System.out.println("Placa= "+placa);
    System.out.println("Chassi= "+chassi);
    // IF EVITA ERRO NULLPOINTEXCEPTION
}

}