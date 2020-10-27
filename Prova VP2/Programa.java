public class Programa {
    public static void main(String[] args) {
        Correspondencia ca = new Correspondencia(120,1.5,"16/07/2020");
    Correspondencia ca2 = new Correspondencia(230,2.5,"06/08/2020");

    CorrespondenciaAR car = new CorrespondenciaAR(250, 5.0, "08/09/2020");
    CorrespondenciaAR car2 = new CorrespondenciaAR(350, 6.0, "12/10/2020");


    Malote ma = new Malote("Brasilia" , "18/10/2020");


    ma.adicionar(ca);
    ma.adicionar(ca2);
    ma.adicionar(car);
    ma.adicionar(car2);

    ma.conferirPrecos();

    ma.remover(ca2);

    ma.remeter();
    }
    


}
