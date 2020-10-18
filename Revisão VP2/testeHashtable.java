import java.util.Hashtable;
public class testeHashtable {
    public static void main(String[] args) {
        Hashtable <carroPasseio, Caminhao> carroCaminhao = new Hashtable <> ();
        carroPasseio cp = new carroPasseio("AIM-4542", 55487812, 2010, 200, 220, 7500, 5, "BRANCO", "SEDAN");
        Caminhao ca= new Caminhao("OEX-0105", 65279912, 2001, 750, 160, 10000, 4, 7800, 5, 30);
        
        carroCaminhao.put(cp, ca);
        carroCaminhao.get(cp).exibir();
        
    }
}
