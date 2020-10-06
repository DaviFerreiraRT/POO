public class EstudanteMonitor extends Estudante {
    private double bolsa;
    private String disciplina;

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getBolsa() {
        return bolsa;
    }   

    public String getDisciplina() {
        return disciplina;
    }

    public EstudanteMonitor(int matricula, String nome, char sexo, double bols, String disc) {
        setMatricula(matricula);
        setNome(nome);
        setSexo(sexo);
        bolsa = bols;
        disciplina = disc;
    };

    public void tirarDuvidas(){
        System.out.println("Tirando duvidas...!");
    }
    public void auxiliaProfessor(){
        System.out.println("Auxiliando professor...!");
    }
    @Override
    public void Exibir() {
        // TODO Auto-generated method stub
        super.Exibir();
        System.out.println("Bolsa: "+bolsa);
        System.out.println("Disciplina: "+disciplina);
    }
}
