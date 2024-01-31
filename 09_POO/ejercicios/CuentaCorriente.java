/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class CuentaCorriente {
  
  /////ATRIBUTOS
  private String numero = "";
  private double saldo;

  //CONSTRUCTORES
  public CuentaCorriente(){
    generarAleatorio();
    saldo = 0;
  }

  public CuentaCorriente(double saldoInicial){
    generarAleatorio();
    this.saldo = saldoInicial;
  }

  private void generarAleatorio(){
    for (int i = 0; i < 3; i++) {          //this.numero tambien se puede poner, pero no es necesario.
      numero += (int) (Math.random()* 10); 
                                            // numero, al ser un STRING no se hace operacion matematica de suma,
    }                                       // sino que se concatena los numeros del 0 al 9 que genera.
  } //HACER COMPROBACION CON UN ARRAY DE BOOLEAN PARA QUE NUMERO NO SE REPITA

  public void ingreso(double cantidad){  //Sumamos cantidad a saldo
    this.saldo += cantidad;
  }
  public void cargo(double cantidad){    //Restamos cantidad a saldo
    this.saldo -= cantidad;
  }
  public void transferencia(CuentaCorriente destino, double cantidad){ //Transferencia suma cantidad a saldo.
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() {  //Por si necesito consultarlo
    return saldo;
  }

  @Override                                //Por si quiero ver numero y saldo
  public String toString() {
    return String.format("Numero de cuenta: %s \t Saldo: %.2f" , numero, saldo);
  }
  
}
