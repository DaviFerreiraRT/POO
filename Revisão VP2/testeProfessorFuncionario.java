public class testeProfessorFuncionario {
    public static void main(String[] args) {
    FuncionarioHeranca f = new FuncionarioHeranca("Davi","Analista de dados",500);
    ProfessorH p = new ProfessorH("Alex","Professor",1000,"REDES","SD");
    
    

    /*f.aumentarSalario(5);
    f.exibir();
    
    p.aumentarSalario(10);
    p.exibir();*/

    ProfessorH p2 = new ProfessorH ( "Julia", "Professora",2600,"Sistemas Operacionais", "ADS");
    p2.aumentarSalario(10);

    p2.exibir();
    }
}
