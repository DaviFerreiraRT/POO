public class testeVeiculo {

    public static void main(String[] args) {
        /*Veiculo v = new Veiculo("OIM8646", "BXT5743");
        Pessoa p = new Pessoa("Davi", 8635156);
        v.setPessoa(p); // ASSOCIA PESSOA COM VEICULO
        v.imprimirDocumento();// IMPRIME DADOS DO VEICULO*/

        Pessoa p1 = new Pessoa("Davi", 865498);  //ASSOCIA VEICULO COM PESSOA
        Veiculo v1 = new Veiculo("OIM4587", "VTXK"); 
        p1.setVeiculo(v1);  
        p1.exibir();//IMPRIME DADOS DA PESSOA
        
    }
}