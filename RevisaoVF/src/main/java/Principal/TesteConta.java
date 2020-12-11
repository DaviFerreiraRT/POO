package Principal;

import Exceptions.DepositoInvalidoException;
import Exceptions.SaqueInvalidoException;
import Contas.ContaBancaria;

public class TesteConta {

    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria(200);
        try {
            cb.depositar(20);
            cb.sacar(210);
            cb.depositar(-10);

        } catch (SaqueInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("Valor inválido: " + e.getSaldoInvalido());
        } catch (DepositoInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("Valor inválido: " + e.getDepositoInvalido());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro Desconhecido!");

        } finally {
            System.out.println("Saldo final: " + cb.getSaldo());
        }
    }

}
