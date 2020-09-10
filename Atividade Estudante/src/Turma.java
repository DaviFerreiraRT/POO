public class Turma {
    
Estudante estudantes[] = new Estudante[10];
String nome;
private int numEstudantes = 0;

public Turma (){}
public Turma ( String nome ) { 
    this.nome = nome; 
}

public void matricular (Estudante e) {
estudantes[numEstudantes] = e;
numEstudantes++;
}

public int getNumEstudantes() {
    return numEstudantes;
}
public void exibir(){
    for(int i=0;i<estudantes.length;i++){
        if(estudantes[i]!=null){
        System.out.println("Dados do aluno: "+estudantes[i]);
    }
}
}
}

