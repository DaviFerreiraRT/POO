public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Davi", 111, 'M', "06-05-2000");
        Professor p1 = new Professor ("Alex",123,'M',"27-05-1991",55);
        Contador c1 = new Contador("Jonas", 1234, 'M', "21-04-2000",1545);
        Coordernador co1 = new Coordernador("Alex",123,'M',"27-05-1991",55,"Redes 2");

        //c1.imprimir();

        //co1.imprimir();

        Funcionario af [] = new Funcionario [4];
        af[0]=f1;
        af[1]=p1;
        af[2]=c1;
        af[3]=co1;
        
        for( Funcionario i : af){
            i.recebeSalario();
        }
        

    }
}
