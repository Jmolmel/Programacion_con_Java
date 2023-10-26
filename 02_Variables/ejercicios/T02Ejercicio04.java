/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros
 * que se quiere convertir deberá estar almacenada en una variable.
 * 
 * @author Jose Molina Melendez
 */

public class T02Ejercicio04 {
  public static void main(String[] args){
    double euros = 6.00;
    int pesetas;
    pesetas = (int) (euros * 166.386);
    


    System.out.println(pesetas);
    System.out.printf("%.2f --> %d pta\n", euros, pesetas);
  } 
}
