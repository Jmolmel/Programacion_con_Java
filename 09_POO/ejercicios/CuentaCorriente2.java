public class CuentaCorriente2 {

  //ATRIBUTOS
  private String numero = "";
  private double saldo;

  //CONSTRUCTORES
  public CuentaCorriente2(){
    generarAleatorio();
    saldo = 0;
  }

  public CuentaCorriente2(double saldoInicial){
    generarAleatorio();
    this.saldo = saldoInicial;
  }


  private void generarAleatorio(){
    for (int i = 0; i < 10; i++) {
      numero += (int) (Math.random() * 10);
    }
  }

  public void ingreso(double cantidad){
    this.saldo += cantidad;
  }
  public void cargo(double cantidad){
    this.saldo -= cantidad;
  }
  public void transferencia(CuentaCorriente2 destino, double cantidad){
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }
  public double getSaldo(){
    return saldo;
  }

  @Override
  public String toString() {
    return String.format("Numero de cuenta: %s \t Saldo: %.2f" , numero, saldo);
  }

  
}
