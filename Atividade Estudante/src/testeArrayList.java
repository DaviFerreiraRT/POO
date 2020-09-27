import java.util.ArrayList;

public class testeArrayList {
    public static void main(String[] args) {
        
        Turma t1 = new Turma ("POO");
        ArrayList al = t1.getEstudantes();
        Curso c1= new Curso ("Sistemas de Informação","GSI",3600);
        Estudante e1 = new Estudante("Jonas", 'M', 154);
        Estudante e2 = new Estudante("Rodrigo", 'M', 155);
        Estudante e3 = new Estudante("Davi", 'M', 156);
        Estudante e4 = new Estudante("Vinicius", 'M', 157);
        Estudante e5 = new Estudante("Emily", 'F', 158);
        Estudante e6 = new Estudante("Beatriz", 'F', 159);
        
        e1.setMeuCurso(c1);
        e2.setMeuCurso(c1);
        e3.setMeuCurso(c1);
        e4.setMeuCurso(c1);
        e5.setMeuCurso(c1);
        e6.setMeuCurso(c1);
        e6.setNota(1, 10);
        e6.setNota(2, 9);
        e6.setNota(3, 9.5);
        e6.setNota(4,8.0);
        Turma t2 = new Turma ( "BD2 ");

        
        
    

        t1.matricular(e1);
        t1.matricular(e2);
        t1.matricular(e3);
        t1.matricular(e4);
        t1.matricular(e5);
        t1.matricular(e6);

        t2.matricular(e3);
        t2.matricular(e1);
        t2.matricular(e4);

        //t1.exibir();
        t1.trancar(155);
       // t2.exibir();
        //t2.trancar(e3);
        t1.trancar(e3);
        t2.pesquisar(156);

       // t1.exibir();
        t2.exibir();
    }
    

    public static void print(ArrayList<Estudante> a) {
        for (int i = 0; i < a.size(); i++) {
            a.get(i).Exibir("Dados do alunos!");
        }
    }
}
