package Principal;

import Veiculo.VeiculoAgregacao;
import Peca.Peca;
import Motor.Motor;
import Frota.Frota;

public class TesteMotorVeiculoPeca {

    public static void main(String[] args) {
        Motor m1 = new Motor(500, 100);
        Peca p1 = new Peca(100, "Bateria", "After");
        VeiculoAgregacao v1 = new VeiculoAgregacao("1", 234, 2010, 650, 75, 856, 5);
        VeiculoAgregacao v2 = new VeiculoAgregacao("2", 235, 2011, 650, 65, 800, 5);
        Frota f1 = new Frota();
        v1.setMotor(m1);
        v2.setMotor(m1);
        v1.incluirPecas(p1);
        v1.incluirPecas(p1);
        f1.adicionar(v1);

        f1.adicionar(v2);

        f1.listar();
        System.out.println("-------ANTES DE EXCLUIR---------");
        f1.excluir(2010);
        System.out.println("-------APOS EXCLUIR---------");
        f1.listar();

    }

}
