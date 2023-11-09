import java.util.Scanner;

/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    int primera = 0;     // Almaceno la primera cifra del número

    System.out.print("Por favor, introduce un número entero positivo (5 cifras como máximo): ");
    numero = sc.nextInt();
    
    //numero de 1 cifra
    if (numero < 10) {
      primera = numero;
    }

    //numero de 2 cifras
    if ((numero >=10) && (numero < 100)) {
      primera = numero / 10;
    }

    //numero de 3 cifras
    if ((numero >=100) && (numero < 100)){
      primera = numero / 100;
      
    }
    //numero de 4 cifras
    if ((numero >=1000) && (numero < 10000)){
      primera = numero / 1000;
    }
    //numero de 5 cifras
    if ((numero >=10000) && (numero < 100000)){
      primera = numero / 10000;
    }
    System.out.println("La primera cifra del numero "+ numero + " es el " + primera);

    sc.close();
  }
}
