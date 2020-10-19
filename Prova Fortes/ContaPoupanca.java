public class ContaPoupanca extends Conta {

  public ContaPoupanca(double saldoInicial) {
    super(saldoInicial);
  }

  @Override
  public void sacar(double valor) {
    if (valor <= 500) {
      super.sacar(valor);
    } else {
      System.out.println("Saldo insuficiente para realizar o saque");
    }
  }

  @Override
  public void depositar(double valor) {
    if(valor>=200){
      super.depositar(valor);
    }else{
      System.out.println("Somente valores a partir de 200 reais podem ser depositados");
    }
  }
}