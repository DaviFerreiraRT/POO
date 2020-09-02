public class Remedio {
    private int codigo;
    private String nome;
    private int diaDeFabricacao;
    private int mesDeFabricacao;
    private int anoDeFabricacao;
    private int validade;
    private double preco;

    public void reduzirPreco(double valor){
        preco=preco-valor;
        System.out.println("O novo valor do remédio é :"+preco);
    }
    public boolean ehValido(validade){
        if(validade){
            return 
        }
    }

}
