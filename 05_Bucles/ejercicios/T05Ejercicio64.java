import java.util.Scanner;

/**
 * Escribe un programa que pinte por pantalla un rectángulo hueco de 6
 * caracteres de ancho por 3 de alto y, a continuación, un menú que permita
 * agrandarlo,
 * achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
 * se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
 * se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
 * orientación, los valores de anchura y altura se intercambian. El valor mínimo
 * de la altura o la anchura es 2.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 3;
        int anchura = 6;
        int espaciosPorDentro = anchura - 2;
        int opcion = 0;

        do {
            System.out.println("Aquí tiene su rectangulo! ¿Qué desea hacer con él?");

            for (int i = 1; i <= anchura; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 1; i <= altura - 2; i++) {
                System.out.print("*");
                for (int j = 1; j <= anchura - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 1; i <= anchura; i++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            System.out.print("Indique qué quiere hacer con el rectángulo: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    altura++;
                    anchura++;
                    espaciosPorDentro++;
                    break;
                case 2:
                    if ((anchura > 2) && (altura > 2)) {
                        altura--;
                        anchura--;
                        espaciosPorDentro--;
                    } else {
                        System.out.println("El rectángulo no se puede achicar más.");
                    }
                    break;
                case 3:
                    int aux = anchura;
                    anchura = altura;
                    altura = aux;

                    break;
                default:
                    System.out.println("SALIR");
                    break;
            }
        } while (opcion != 4);

        System.out.println();

    }
}
