public class testeHeranca {
    public static void main(String[] args) {
        EstudanteMonitor em = new EstudanteMonitor(111, "Davi", 'M', 500.00, "POO");
        em.atribuirNota(1,10);
        em.atribuirNota(2,8);
        em.atribuirNota(3,9);
        em.atribuirNota(4,7.5);  
        
        em.Exibir();
        em.tirarDuvidas();
        em.auxiliaProfessor();


        EstudanteEstagiario ee= new EstudanteEstagiario(112, "Davi", 'M', 500, "AMAZON");
        ee.atribuirNota(1,8);
        ee.atribuirNota(2,8);
        ee.atribuirNota(3,9);
        ee.atribuirNota(4,7.5);
        ee.Exibir("Dados do esutudante");
        ee.trabalhar();
    }
}
