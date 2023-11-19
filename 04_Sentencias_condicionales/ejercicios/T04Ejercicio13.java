import java.util.Scanner;

/**
 * 
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduzca el tercer número: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        }
        if (num2 > num1) {
            if (num1 > num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
            if (num3 > num1) {
                if (num1 > num2) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                } else {
                    System.out.println(num3 + " " + num2 + " " + num1);
                }
            }
        }
    }
}
