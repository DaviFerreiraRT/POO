public class Turma {

    private Estudante estudantes[] = new Estudante[10];
    private String nome;
    private int numEstudantes = 0;

    public Turma() {
    }

    public Turma(String nome) {
        this.nome = nome;
    }

    public void matricular(Estudante e) {
        estudantes[numEstudantes] = e;
        numEstudantes++;
    }

    public int getNumEstudantes() {
        return numEstudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public void setNumEstudantes(int numEstudantes) {
        this.numEstudantes = numEstudantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void exibir() {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                System.out.println("-----------" + nome + "-----------");
                estudantes[i].Exibir();

            }
        }
    }

    public Estudante pesquisar(int matricula) {
        for (int i = 0; i < numEstudantes; i++) {
            if (estudantes[i] != null && estudantes[i].getMatricula() == matricula) {
                System.out.println("Numero da matricula encontrada! \nNr da matricula requsitada: " + matricula);
                return estudantes[i];
            }
        }
        System.out.println("Matricula não encontrada!");
        return null;
    }

    public void trancar(int matricula) {
        boolean matriculaExiste = false;
        int index = 0;

        for (int i = 0; i < numEstudantes; i++) {
            if (estudantes[i].getMatricula() == matricula) {
                matriculaExiste = true;
                index = i;
                break;

            }

        }
        if (matriculaExiste) {
            for (int i = index; i < estudantes.length - 1; i++) {
                estudantes[i] = estudantes[i + 1];

            }
            estudantes[estudantes.length - 1] = null;
            numEstudantes--;
        } else {
            System.out.println("Matricula não existe! ");
        }

    }

    public void trancar(Estudante e) {
        boolean estudanteExiste = false;
        int index = 0;
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == e) {
                estudanteExiste = true;
                index = i;
                break;

            }
        }
        if (estudanteExiste) {
            for (int i = index; i < estudantes.length - 1; i++) {
                estudantes[i] = estudantes[i + 1];
            }
            estudantes[estudantes.length - 1] = null;
            numEstudantes--;
            System.out.println("Estudante com matricula " + e.getMatricula() + " apagada êxito!");
        } else {
            System.out.println("Estudante não encontrado! ");
        }
    }
}
