public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    Estudante alunos[]=new Estudante[5];


    public Disciplina(String nome,String codigo,int cargaHoraria){
        setCargaHoraria(cargaHoraria);
        setCodigo(codigo);
        setNome(nome);
    }

    public void incluirEstudante(Estudante e){

    }
    public void setNome(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        setCodigo(codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCargaHoraria(int cargaHoraria) {

        setCargaHoraria(cargaHoraria);

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void exibirEstudantes(){
        System.out.println("--------- DADOS DO ESTUDANTE----------");
        System.out.println("Nome do Estudante: "+nome);
        System.out.println("Codigo do Estudante: "+codigo);
        System.out.println("Carga Horaria do Estudante: "+cargaHoraria);
    }
}