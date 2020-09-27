public class Curso {

    private String nome;
    private String codigo;
    private int cargaHoraria;

    public Curso(String nome,String codigo,int cargaHoraria){
        setCargaHoraria(cargaHoraria);
        setcodigo(codigo);
        setNome(nome);
    }

    public void setNome(String nome) {
        setNome(nome);

    }

    public String getNome() {
        return nome;
    }

    public void setcodigo(String codigo) {
        setcodigo(codigo);

    }

    public String getcodigo() {
        return codigo;
    }

    public void setCargaHoraria(int cargaHoraria) {
        setCargaHoraria(cargaHoraria);

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibir(){
        System.out.println("--------- DADOS DO CURSO----------");
        System.out.println("Nome do curso: "+nome);
        System.out.println("Codigo do curso: "+codigo);
        System.out.println("Carga Horaria do curso: "+cargaHoraria);
    }
}