public class testeTurma {
 public static void main(String[] args) {
     Estudante novoEstudante = new Estudante("Maria",'F');
     Turma poo = new Turma("Programação Orientadas a Objetos");
     poo.matricular(novoEstudante);
     novoEstudante.Exibir();
     novoEstudante = new Estudante("Davi",'M');
     poo.exibir();
 }   
}
