package Contas;

import Exceptions.DepositoInvalidoException;
import Exceptions.SaqueInvalidoException;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) throws DepositoInvalidoException {
        if (valor < 0) {
            throw new DepositoInvalidoException(valor);
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) throws SaqueInvalidoException {
        if (this.saldo < valor) {
            throw new SaqueInvalidoException(valor);
        } else {
            this.saldo -= valor;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

}
