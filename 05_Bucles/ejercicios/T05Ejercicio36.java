import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda
 * usar
 * long en lugar de int ya que el primero admite números más largos.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numeroIntroducido;

        System.out.print("Introduzca un número para comprobar si es capicuo: ");
        numeroIntroducido = sc.nextLong();

        long numero = numeroIntroducido;
        long volteado = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }
        if (numeroIntroducido == volteado) {
            System.out.println("El número " + numeroIntroducido + " es capicúo.");
        } else {
            System.out.println("El número " + numeroIntroducido + " no es capicúo.");
        }
    }
}
