public class EstudanteEstagiario extends Estudante {
    private double salario;
    private String empresa;

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getSalario() {
        return salario;
    }

    public EstudanteEstagiario(int matricula, String nome, char sexo, double salario, String empresa) {
        setMatricula(matricula);
        setNome(nome);
        setSexo(sexo);
        this.salario = salario;
        this.empresa = empresa;
    }


    public void Exibir() {
        super.Exibir();
        System.out.println("Salario do aluno na empresa: " + salario);
        System.out.println("Empresa: " + empresa);
    }

    public void trabalhar() {
        System.out.println("Trabalhando......");
    }

    @Override
    public void atribuirNota(int numProva, double nota) {
        notas[numProva - 1] = nota;
        if (nota <=7.0) {
            System.out.println("Estagiario Desligado!");
        }
    }

}
