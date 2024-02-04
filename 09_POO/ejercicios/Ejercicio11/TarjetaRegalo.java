/**
 * La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
 * las tarjetas regalo. Como primer paso para implementar la aplicación, es
 * necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando
 * se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática
 * un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta,
 * se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar
 * creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
 * número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
 * originales se quedarían con 0 € de saldo.
 * 
 * @author José Molina Meléndez
 */
package Ejercicio11;

public class TarjetaRegalo {

  //Atributos
  private String numeroTarjeta = "";
  private double saldo;

  //Constructores
  public  TarjetaRegalo(double saldo){   //Introduces saldo y genera aleatoriamente un número de 5 dígitos
    this.saldo = saldo;
    for (int i = 0; i < 5; i++) {
      this.numeroTarjeta += (int) (Math.random() * 10);
    }
  }

  //Getters
  public String getNumeroTarjeta() {
    return numeroTarjeta;
  }
  public double getSaldo() {
    return saldo;
  }
  //Metodos
  public void gasta(double gasto){
    if (saldo < gasto) {
      System.out.println("ERROR. No dispone de fondos suficientes");
    } else {
      this.saldo -= gasto;
    }
  }

  TarjetaRegalo fusionaCon(TarjetaRegalo t) {            //Tarjeta que selecciones "t1" la unes con t.2.
    double nuevoSaldo = this.getSaldo() + t.getSaldo();  //Nueva variable para guardar el saldo de ambas
    this.setSaldo(0);                                    //Saldos de tu tarjeta y de la nueva "t" a 0.
    t.setSaldo(0);
    return new TarjetaRegalo(nuevoSaldo);               //Devuelve nueva tarjeta con nuevoSaldo ya inicializado
    }
    
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return "Tarjeta nº " + numeroTarjeta + " - " +  " Saldo: " + saldo + "€";
  }
}
