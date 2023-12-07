import java.util.Scanner;

/**
 * Escribe un programa que pinte por pantalla un par de calcetines, de los que
 * se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
 * El usuario debe introducir la altura. Suponemos que el usuario introduce una
 * altura mayor o igual a 4. Observa que la talla de los calcetines y la
 * distancia
 * que hay entre ellos (dos espacios) no cambia, lo único que varía es la
 * altura.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivel = 1;
        int contador = 1;

        System.out.print("Introduzca la altura de sus calcetines: ");
        int altura = sc.nextInt();

        // se repite el patrón de 3 asteriscos por pierna. pintamos asteriscos espacios
        // y asterisco.
        while (nivel <= altura - 2) {

            for (int i = 1; i <= 3; i++) {
                System.out.print("*");
            }
            for (int i = 1; i < 6; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 3; i++) {
                System.out.print("*");
            }
            System.out.println();
            nivel++;
        }
        // parte de las botas

        while (contador <= 2) {
            for (int i = 1; i <= 6; i++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2; j++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 6; i++) {
                System.out.print("*");
            }
            System.out.println();

            contador++;
        }
    }
}
