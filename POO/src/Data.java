public class Data {
    public Data (int x){
        x=ano;
    }
    public Data(int m, int n, int p) {
        dia = m;
        mes = n;
        ano = p;
    }

    public Data() {
        dia = 14;
        mes = 5;
        ano = 2015;
    }

    // Variaveis de instancia;
    int dia;
    int mes;
    int ano;

    // Metodos
    public void exibir(String Mensagem) {
        System.out.println(Mensagem);
        exibir();

    }

    void exibir() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    int diasDoano() {
        int dias = 0;
        return dias;
    }

    void incrementarAno(int nAnos) {

        ano += nAnos;
    }

    void incrementarAno() {
        ano++;
    }
};