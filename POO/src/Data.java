public class Data {

    // Variaveis de instancia;
    private int dia;
    private int mes;
    private int ano;

    public Data(int x) {
        x = ano;
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

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia invalido");
        }
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mes invalido");
        }
    }

    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano invalido");
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

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