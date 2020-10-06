public class testeHeranca {
    public static void main(String[] args) {
        EstudanteMonitor em = new EstudanteMonitor(111, "Davi", 'M', 500.00, "POO");
        em.setNota(1,10);
        em.setNota(2,8);
        em.setNota(3,9);
        em.setNota(4,7);  
        
        em.Exibir();
        em.tirarDuvidas();
        em.auxiliaProfessor();


        EstudanteEstagiario ee= new EstudanteEstagiario(112, "Davi", 'M', 500, "AMAZON");
        ee.setNota(1,8);
        ee.setNota(2,8);
        ee.setNota(3,9);
        ee.setNota(4,7);
        ee.Exibir("Dados do esutudante");
        ee.trabalhar();
    }
}
