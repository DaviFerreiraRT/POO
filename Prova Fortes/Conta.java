public class Conta {
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Foi descontado " + valor + " da sua conta\nNovo saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque");
        }
    }

    public void depositar(double valor) {
        this.saldo+=valor;
        System.out.println("Foi depositado " + valor + " na sua conta\nNovo saldo: " + this.saldo);
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo: " + this.saldo);
    }
}
