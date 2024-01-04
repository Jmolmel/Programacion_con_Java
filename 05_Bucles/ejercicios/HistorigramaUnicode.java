import java.util.Scanner;

public class HistorigramaUnicode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salidaBucle = false; // Salida de buble
        double notaFinal = 0; // la declaro para usarla varias veces en el programa.
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;

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
            nota1 = sc.nextInt();
            nota2 = sc.nextInt();
            nota3 = sc.nextInt();

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

        // Guardamos nota mayor
        int notaMayor = 0;
        if (nota1 > nota2 && nota1 > nota3) {
            notaMayor = nota1;
        } else if (nota2 > nota1 && nota2 > nota3) {
            notaMayor = nota2;
        } else {
            notaMayor = nota3;
        }
        // Variables
        int numeroColumnas1 = notaMayor - nota1;
        int numeroColumnas2 = notaMayor - nota2;
        int numeroColumnas3 = notaMayor - nota3;
        int numeroColumnas4 = notaMayor - (int) Math.round(notaFinal);

        // switch para colores y grafica
        if (grafica.equalsIgnoreCase("SI")) {
            System.out.println("Elija el color para su gráfica(Azul, Morado, Amarillo)");
            String color = sc.nextLine().toUpperCase(); // Transformo a MAYUSCULAS

            switch (color) {
                case "AZUL":
                    // NOTA1
                    // PARTE SUPERIOR
                    System.out.print("\u2554");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u2566");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2557\n");
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota1);
                    for (int i = 0; i < nota1; i++) {
                        System.out.print("\033[46m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas1; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");
                    // NOTA2

                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota2);
                    for (int i = 0; i < nota2; i++) {
                        System.out.print("\033[46m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas2; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");

                    // NOTA 3
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota3);
                    for (int i = 0; i < nota3; i++) {
                        System.out.print("\033[46m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas3; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");

                    // NOTAMEDIA
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d~\u2551", Math.round(notaFinal));
                    for (int i = 0; i < Math.round(notaFinal); i++) {
                        if (Math.round(notaFinal) >= 5) {
                            System.out.print("\033[42m    \033[0m\u2551");
                        } else {
                            System.out.print("\033[41m    \033[0m\u2551");
                        }

                    }
                    for (int i = 0; i < numeroColumnas4; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u255A");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u2569");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u255D\n");
                    break;
                case "MORADO":
                    // NOTA1
                    // PARTE SUPERIOR
                    System.out.print("\u2554");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u2566");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2557\n");
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota1);
                    for (int i = 0; i < nota1; i++) {
                        System.out.print("\033[45m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas1; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");
                    // NOTA2

                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota2);
                    for (int i = 0; i < nota2; i++) {
                        System.out.print("\033[45m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas2; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");

                    // NOTA 3
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota3);
                    for (int i = 0; i < nota3; i++) {
                        System.out.print("\033[45m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas3; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");

                    // NOTAMEDIA
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d~\u2551", Math.round(notaFinal));
                    for (int i = 0; i < Math.round(notaFinal); i++) {
                        if (Math.round(notaFinal) >= 5) {
                            System.out.print("\033[42m    \033[0m\u2551");
                        } else {
                            System.out.print("\033[41m    \033[0m\u2551");
                        }

                    }
                    for (int i = 0; i < numeroColumnas4; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u255A");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u2569");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u255D\n");
                    break;
                case "AMARILLO":
                    // NOTA1
                    // PARTE SUPERIOR
                    System.out.print("\u2554");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u2566");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2557\n");
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota1);
                    for (int i = 0; i < nota1; i++) {
                        System.out.print("\033[43m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas1; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");
                    // NOTA2

                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota2);
                    for (int i = 0; i < nota2; i++) {
                        System.out.print("\033[43m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas2; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");

                    // NOTA 3
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d \u2551", nota3);
                    for (int i = 0; i < nota3; i++) {
                        System.out.print("\033[43m    \033[0m\u2551");
                    }
                    for (int i = 0; i < numeroColumnas3; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u2560");
                    for (int i = 0; i < notaMayor; i++) {
                        System.out.print("\u2550\u2550\u2550\u2550\u256C");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u2563\n");

                    // NOTAMEDIA
                    // PARTE INTERIOR
                    System.out.printf("\u2551 %2d~\u2551", Math.round(notaFinal));
                    for (int i = 0; i < Math.round(notaFinal); i++) {
                        if (Math.round(notaFinal) >= 5) {
                            System.out.print("\033[42m    \033[0m\u2551");
                        } else {
                            System.out.print("\033[41m    \033[0m\u2551");
                        }

                    }
                    for (int i = 0; i < numeroColumnas4; i++) {
                        System.out.print("    \u2551");
                    }
                    System.out.println();
                    // PARTE ABAJO
                    System.out.print("\u255A");
                    for (int i = 0; i < notaMayor; i++) { //
                        System.out.print("\u2550\u2550\u2550\u2550\u2569");
                    }
                    System.out.print("\u2550\u2550\u2550\u2550\u255D\n");
                    break;

                default:
                    System.out.println("NO EXISTE SU COLOR");
                    break;
            }
        } else {
            System.out.println("¡Hasta pronto!");
        }
        sc.close(); // Cierro Scanner "SC"
    }
}
