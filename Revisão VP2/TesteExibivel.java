public class TesteExibivel {
    public static void main(String[] args) {
        Parafuso p = new Parafuso(1254,"Parafuso grande","HHHX",5,0.54);
        Rosca r = new Rosca(5656,"Rosca Grande","HHHA",0.6,6.1);

        Equipamento equipamento = new Equipamento("Parafusadeira");

        equipamento.adicionar(p);
        equipamento.adicionar(r);

        Relatorio relatorio = new Relatorio ("Relatorio de Peças");
        relatorio.imprimir(equipamento);
    }
}
