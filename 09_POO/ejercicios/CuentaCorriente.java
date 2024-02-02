/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class CuentaCorriente {

  ///// ATRIBUTOS
  private String numero = "";
  private double saldo;

  // CONSTRUCTORES
  public CuentaCorriente() {
    generarAleatorio();
    saldo = 0;
  }

  public CuentaCorriente(double saldoInicial) {
    generarAleatorio();
    this.saldo = saldoInicial;
  }

  private void generarAleatorio(){
    boolean[] comparaNumeros = new boolean[10];
    for (int i = 0; i < 3; i++) {
      int digito;
      do {
        digito = (int) (Math.random() * 10);
      } while (comparaNumeros[digito]);
      comparaNumeros[digito] = true;
      numero += digito;
    }
  }

  public void ingreso(double cantidad) { // Sumamos cantidad a saldo
    this.saldo += cantidad;
  }

  public void cargo(double cantidad) { // Restamos cantidad a saldo
    this.saldo -= cantidad;
  }

  public void transferencia(CuentaCorriente destino, double cantidad) { // Transferencia suma cantidad a saldo.
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() { // Por si necesito consultarlo
    return saldo;
  }

  @Override // Por si quiero ver numero y saldo
  public String toString() {
    return String.format("Numero de cuenta: %s \t Saldo: %.2f", numero, saldo);
  }

}
