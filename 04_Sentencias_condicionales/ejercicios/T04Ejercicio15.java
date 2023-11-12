import java.util.Scanner;

/**
 * 
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $,
 * &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el
 * vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char r;
        int vertice;

        System.out.println("Introduzca el caracter con el que quiere rellenar la pirámide: ");
        r = sc.next().charAt(0);
        System.out.println(
                "Introduzca hacia dónde quiere que apunte el vértice (1.Arriba / 2.Abajo / 3.Izquierda / 4.Derecha)");
        vertice = sc.nextInt();

        switch (vertice) {
            case 1:
                System.out.println("      " + r);
                System.out.println("     " + r + r + r);
                System.out.println("    " + r + r + r + r + r);
                System.out.println("   " + r + r + r + r + r + r + r);
                System.out.println("  " + r + r + r + r + r + r + r + r + r);
                break;
            case 2:
                System.out.println("  " + r + r + r + r + r + r + r + r + r);
                System.out.println("   " + r + r + r + r + r + r + r);
                System.out.println("    " + r + r + r + r + r);
                System.out.println("     " + r + r + r);
                System.out.println("      " + r);
                break;
            case 3:
                System.out.println("" + r);
                System.out.println("" + r + r + r);
                System.out.println("" + r + r + r + r + r);
                System.out.println("" + r + r + r + r + r + r + r);
                System.out.println("" + r + r + r + r + r + r + r + r + r);
                System.out.println("" + r + r + r + r + r + r + r + r + r + r + r);
                System.out.println("" + r + r + r + r + r + r + r + r + r);
                System.out.println("" + r + r + r + r + r + r + r);
                System.out.println("" + r + r + r + r + r);
                System.out.println("" + r + r + r);
                System.out.println("" + r);
                break;
            case 4:
                System.out.println("           " + r);
                System.out.println("         " + r + r + r);
                System.out.println("       " + r + r + r + r + r);
                System.out.println("     " + r + r + r + r + r + r + r);
                System.out.println("   " + r + r + r + r + r + r + r + r + r);
                System.out.println(" " + r + r + r + r + r + r + r + r + r + r + r);
                System.out.println("   " + r + r + r + r + r + r + r + r + r);
                System.out.println("     " + r + r + r + r + r + r + r);
                System.out.println("       " + r + r + r + r + r);
                System.out.println("         " + r + r + r);
                System.out.println("           " + r);
                break;

            default:
                System.out.println(
                        "El caracter introducido no corresponde a ninguna opcion para la dirección de la pirámide");
                break;
        }
        sc.close();
    }
}
