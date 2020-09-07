public class testeFuncionarioCargo {
    public static void main(String[] args) {
        Cargo cargo1=new Cargo("Gerente",1,1200);
        Funcionario funci1 = new Funcionario("Davi Ferreira",2153,550);

        funci1.mudarSalario(4555);
        funci1.mostrar();
        funci1.setCargo(cargo1);
        funci1.mostrar();
        Cargo cargo2=new Cargo("Analista",2,800);
        Funcionario funci2=new Funcionario("Vinicius Lavor",2546,1500);
        funci2.mudarSalario(2200);
        funci2.setCargo(cargo2);
        funci2.mostrar();
        

        


    }
}
