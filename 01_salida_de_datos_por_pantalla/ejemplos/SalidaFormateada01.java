/**
 * Salida formateada utilizando enteros decimales
 * 
 * @author Jose Molina
 *  */

public class SalidaFormateada01 {
  public static void main(String[] args) {
    System.out.printf("El numero %d no tiene decimales.\n", 21); //%d para numeros enteros
    System.out.printf("El numero %f no tiene decimales.\n", 21.0); // %f es para numeros decimales
    System.out.printf("El %.3f sale exactamente con %d decimales.\n", 50.0, 3); //el .3f le indica que salga con 3 decimales
    System.out.printf("Letra: %c.\n", 83); //%c. te muestra el caracter que le añadas ASNCI


    //Para ver el ORDEN
    System.out.printf("Mostramos el segundo argumento: %2$d \nY despues el primero: %1$.2f", 23.0, 56);

  }

}