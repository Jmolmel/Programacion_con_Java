import java.util.Scanner;

/**
 * Escribe un programa que solicite por teclado la edad del usuario y muestre por pantalla si es menor,mayor de edad o si está jubilado.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int edad;
    System.out.println("Introduzca la edad para ver si es mayor de edad , menor o jubilado: ");
    edad = sc.nextInt();

    // if (edad > 18) {
    //   if (edad < 65) {
    //     System.out.println("Eres mayor de edad");
    //   }
    //   if (edad > 65) {
    //     System.out.println("Eres jubilado");
    //   }
    // }else{
    //   System.out.println("Eres menor de edad");
    // }


    if (edad >= 0) {
      if (edad < 18) {
        System.out.println("Eres menor de edad");
      }
      if ((edad >= 18) && (edad <65)) {
        System.out.println("Eres mayor de edad");
      }
      if (edad >=65){
      System.out.println("Eres un jubilado");
      }      
    } else {
      System.out.println("ERROR");
    }
  }
}
