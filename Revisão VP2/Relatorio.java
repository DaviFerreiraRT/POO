public class Relatorio {
    private String titulo;

    public Relatorio(String titulo){
        this.titulo=titulo;
    }

    public void imprimir(Exibivel exibe) {
        System.out.println(titulo);
        exibe.exibir("Imprimindo relatório....");
    }
}
