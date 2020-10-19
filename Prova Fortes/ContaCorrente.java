public class ContaCorrente extends Conta {

  public ContaCorrente(double saldoInicial) {
    super(saldoInicial);
  }

  @Override
  public void sacar(double valor) {
    if (valor <= 1000) {
      double valorSacado = (valor + valor / 100);
      if (this.saldo >= valorSacado) {
        super.sacar(valorSacado);
      } else {
        System.out.println("Saldo insuficiente para realizar o saque");
      }
    }
  }
}