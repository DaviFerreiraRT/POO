public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f [] = new Funcionario [4];
        f[0]=new Funcionario("Davi", 111, 'M', "06-05-2000");
        f[1]=new Professor("Alex",123,'M',"27-05-1991",55);
        f[2]=new Contador("Jonas", 1234, 'M', "21-04-2000",1545);
        f[3]= new Coordernador("Alex",123,'M',"27-05-1991",55,"Redes 2");

        for(Funcionario i : f){
            i.recebeSalario();
        }
    }
}
