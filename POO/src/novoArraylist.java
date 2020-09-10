import java.util.ArrayList;
import javax.swing.JOptionPane;
public class novoArraylist {
   public static void main(String[] args) {
    ArrayList <Pessoa> testeArray = new ArrayList<>();       
   /* System.out.println(testeArray.isEmpty());
    //JOptionPane.showMessageDialog(null, "FUEDASE");
    String nome=JOptionPane.showInputDialog("Digite quantos cm é necessário pra você");
    JOptionPane.showMessageDialog(null, nome);*/
    Pessoa pessoa1 = new Pessoa ("Jonas",123 );
    Pessoa pessoa2= new Pessoa( "Davi ", 0);
    testeArray.add(pessoa1);
    testeArray.add(pessoa2);
    for(Pessoa p : testeArray) {
    	p.exibir();
    }
    
}

}   
