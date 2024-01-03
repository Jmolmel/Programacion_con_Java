import java.util.Scanner;

public class HistorigramaUnicode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salidaBucle = false; // Salida de buble
        double notaFinal = 0; // la declaro para usarla varias veces en el programa.

        do {
            // Nombre
            System.out.print("Introduzca su nombre: ");
            String nombre = sc.nextLine();
            // Apellido1
            System.out.print("Introduzca su primer apellido: ");
            String apellido1 = sc.nextLine();
            // Apellido2
            System.out.print("Introduzca su segundo apellido: ");
            String apellido2 = sc.nextLine();

            // Calculo longitud nombre
            int numeroLetras = nombre.length() + apellido1.length() + apellido2.length()
                    + 4; // + 4 = espacios + coma

            // Notas
            System.out.println(
                    "Introduzca las notas del primer, segundo y tercer trimestre en ese orden.");
            int nota1 = sc.nextInt();
            int nota2 = sc.nextInt();
            int nota3 = sc.nextInt();

            // Calculo Notas
            notaFinal = (nota1 + nota2 + nota3) / 3;

            // *PARTE SUPERIOR*

            // Pintamos - hasta numero
            System.out.print("\u2554");
            for (int i = 0; i <= numeroLetras; i++) {
                System.out.print("\u2550");
            }
            // Pinto huecos de las 3 notas
            for (int i = 0; i <= 3; i++) {
                System.out.print("\u2566\u2550\u2550\u2550\u2550");
            }
            // Pinto huecos notaFinal

            // Pinto esquina y salto linea
            System.out.println("\u2550\u2550\u2557");

            // PARTE NOMBRE Y NOTAS
            System.out
                    .print("\u2551 " + apellido1 + " " + apellido2 + ", " + nombre + " \u2551");
            System.out.printf(" %2d \u2551 %2d \u2551 %2d \u2551", nota1, nota2, nota3);
            System.out.printf(" %2.2f", notaFinal);
            if (notaFinal == 10) { // Parche para arreglar la salida formateada, si la media es 10 sale los unicode
                                   // cuadrados.
                System.out.println("\u2551");
            } else {
                System.out.println(" \u2551");
            }

            // PARTE BAJA

            System.out.print("\u255A");
            for (int i = 0; i <= numeroLetras; i++) {
                System.out.print("\u2550");
            }
            // Pinto huecos de las 3 notas
            for (int i = 0; i <= 3; i++) {
                System.out.print("\u2569\u2550\u2550\u2550\u2550");
            }
            // Pinto huecos notaFinal
            for (int i = 0; i < 2; i++) {
                System.out.print("\u2550");
            }
            // Pinto esquina y salto linea
            System.out.println("\u255D");

            System.out.println("¿Quiere probar con otra nota diferente?(Si/No)"); // ***NOTA*** Al llegar a este punto
                                                                                  // con un nextLine no recoge la
                                                                                  // informacion. Y con un Next...
            // funciona, pero se salta directamente el primer String del DoWhile, pasando
            // directamente a apellido 1.

            sc.nextLine(); // SOLUCION AL "BUG"

            String repetir = sc.nextLine();
            if (repetir.equalsIgnoreCase("Si")) {
                salidaBucle = false;
            } else {
                salidaBucle = true;
            }
        } while (!salidaBucle); // Mientras sea falso no sale del bucle

        // GRAFICA UNICODES
        System.out.println("¿Desea ver su nota gráficamente?(SI/NO)");
        String grafica = sc.nextLine();

        if (grafica.equalsIgnoreCase("SI")) {
            System.out.println("Elija el color para su gráfica(Rojo, Verde, amarillo)");
            String color = sc.nextLine().toUpperCase(); // Transformo a MAYUSCULAS
            switch (color) {
                case "ROJO":
                    System.out.print("\u2554");
                    for (int i = 0; i < Math.round(notaFinal); i++) {
                        System.out.println("");
                    }
                    break;
                case "VERDE":

                    break;
                case "AMARILLO":

                    break;

                default:
                    break;
            }
        } else {
            System.out.println("¡Hasta pronto!");
        }
        sc.close(); // Cierro Scanner "SC"
    }
}
