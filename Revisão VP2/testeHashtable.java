import java.util.Hashtable;
import java.util.Scanner;

public class testeHashtable {
    public static void main(String[] args) {
        Hashtable <String,CarroPasseio>carroHash = new Hashtable <> ();
        Hashtable <String,Caminhao>CaminhaoHash = new Hashtable <> ();

        Scanner scan = new Scanner(System.in);
        String escolha="";
        /*CarroPasseio cp = new CarroPasseio("AIM-4542", 55487812, 2010, 200, 220, 7500, 5, "BRANCO", "SEDAN");
        Caminhao ca= new Caminhao("OEX-0105", 65279912, 2001, 750, 160, 10000, 4, 7800, 5, 30);
        
        Hashtable <String,CarroPasseio>carroPasseio = new Hashtable <> ();
        carroPasseio.put(cp.getPlaca(), cp);    
    
        Hashtable <String,Caminhao>CaminhaoHash = new Hashtable <> ();
        CaminhaoHash.put(ca.getPlaca(),ca);


        for(Caminhao i : CaminhaoHash.values()){
                i.exibir();
        }*/

        while(!escolha.equalsIgnoreCase("Buscar")){
            System.out.println("Escolha a opção \n- carro\n- caminhão\n- buscar caminhao\n- buscar carro");
            escolha=scan.next();

            if(escolha.equalsIgnoreCase("Carro")){
                System.out.print("Digite o placa: ");
                String placa = scan.next();

                System.out.print("Digite o chassi: ");
                long chassi = scan.nextLong();

                System.out.print("Digite o ano: ");
                int ano = scan.nextInt();

                System.out.print("Digite o peso: ");
                int peso = scan.nextInt();

                System.out.print("Digite a velocidade máxima: ");
                float velocMax = scan.nextFloat();

                System.out.print("Digite o preço: ");
                float preco = scan.nextFloat();

                System.out.print("Digite a capacidade: ");
                int capacidade = scan.nextInt();

                System.out.print("Digite a cor: ");
                String cor = scan.next();

                System.out.print("Digite o modelo: ");

                String modelo = scan.next();

                CarroPasseio carro = new CarroPasseio(placa, chassi, ano, peso, velocMax, preco, capacidade, cor,
                        modelo);
                
                carroHash.put(carro.getPlaca(),carro);

            }
            else if(escolha.equalsIgnoreCase("Caminhao")) {
                System.out.print("Digite o placa: ");
                String placa = scan.next();

                System.out.print("Digite o chassi: ");
                long chassi = scan.nextLong();

                System.out.print("Digite o ano: ");
                int ano = scan.nextInt();

                System.out.print("Digite o peso: ");
                int peso = scan.nextInt();

                System.out.print("Digite a velocidade máxima: ");
                float velocMax = scan.nextFloat();

                System.out.print("Digite o preço: ");
                float preco = scan.nextFloat();

                System.out.print("Digite a capacidade: ");
                int capacidade = scan.nextInt();
                
                System.out.print("Digite as toneladas: ");
                float toneladas = scan.nextFloat();

                System.out.print("Digite a alturaMax: ");
                float alturaMax = scan.nextFloat();

                System.out.print("Digite o comprimento: ");
                float comprimento = scan.nextFloat();
                
                Caminhao caminhao = new Caminhao( placa, chassi, ano, peso, velocMax,  preco,  capacidade,
                 toneladas,  alturaMax,  comprimento);


                CaminhaoHash.put(caminhao.getPlaca(),caminhao);

            }
            else if (escolha.equalsIgnoreCase("Busca pro carro")){
                

            }

        }

        
    
        
        
        
        
    }
}
