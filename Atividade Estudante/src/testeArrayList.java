import java.util.ArrayList;

public class testeArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("POO");
        al.add(20);
        al.remove(2);
        al.add(new Estudante ("Maria",'F'));
        
        print(al);
    }

    public static void print(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
