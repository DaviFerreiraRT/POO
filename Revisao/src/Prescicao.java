public class Prescicao {
    private String paciente;
    private String data;
    private String medico;
    private Remedio remedio []=new Remedio[4];
    int totRemedio=0;

    public Prescicao() {
    }

    public Prescicao(String pac, String dt) {
        this.paciente = pac;
        this.data = dt;
    }

    public Prescicao(String pac, String dt, String med) {
        this.paciente = pac;
        this.data = dt;
        this.medico = med;
    }

    public void incluir(Remedio remedio){
        this.remedio[totRemedio] = remedio;
        totRemedio++;
    }

    public void excluir(Remedio remed){
        boolean existeRemedio = false;
        int index = 0;
        for(int i = 0;i< remedio.length;i++){
            if(remedio[i]==remed){
                existeRemedio=true;
                index=i;
                break;
            }
        }
        if(existeRemedio){
            for(int i = index ; i< remedio.length-1;i++){
                remedio[i]=remedio[i+1];
            }
            remedio[remedio.length-1]=null;
            totRemedio--;
            System.out.println("Remedio "+ remedio.getNome()+"Removido ");
        }
    }

    public String getData() {
        return data;
    }
    public String getMedico() {
        return medico;
    }
    public String getPaciente() {
        return paciente;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    public void setRemedio(Remedio[] remedio) {
        this.remedio = remedio;
    }
    public void setTotRemedio(int totRemedio) {
        this.totRemedio = totRemedio;
    }

    public Remedio[] getRemedio() {
        return remedio;
    }
    public int getTotRemedio() {
        return totRemedio;
    }

    
}
