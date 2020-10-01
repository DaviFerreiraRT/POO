import java.util.*;
import java.util.HashMap;
public class testeHashMap {
    public static void main(String[] args) {
        HashMap <Integer, Estudante> hm = new HashMap <Integer, Estudante> ();
        Estudante e1= new Estudante("Maria",'F',111);
        Estudante e2=new Estudante("Jose", 'M', 123);
        hm.put(1, e1);
        hm.put(2, e2);
        hm.get(1).Exibir();
        
        
    }
}
