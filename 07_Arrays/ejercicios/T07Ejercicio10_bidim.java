public class T07Ejercicio10_bidim {
    public static void main(String[] args) {
        int[][] juego = new int[3][3];
        final int VACIA = 0;
        final int JUGADA1 = 1;
        final int JUGADA2 = 2;
        int filaJugador1, columnaJugador1, filaJugador2, columnaJugador2;
        boolean salida1 = false;
        boolean salida2 = false;

        // INICIALIZO EL JUEGO A 0
        for (int i = 0; i < juego.length; i++) {
            for (int j = 0; j < juego[i].length; j++) {
                juego[i][j] = VACIA;
            }
        }

        System.out.println("BIENVENIDO AL 3 EN RAYA");

        do {
            System.out.println("Jugador 1: Introduzca su jugada de la FILA (0 a 2) ");
            filaJugador1 = Integer.parseInt(System.console().readLine());
            System.out.println("Jugador 1 elija la COLUMNA (0 a 2) ");
            columnaJugador1 = Integer.parseInt(System.console().readLine());

            if (juego[filaJugador1][columnaJugador1] == VACIA) {
                juego[filaJugador1][columnaJugador1] = JUGADA1;
            } else {
                System.out.println("La casilla ya está ocupada. Intente de nuevo.");
                continue;
            }

            System.out.println("Jugador 2: Introduzca su jugada de la FILA (0 a 2) ");
            filaJugador2 = Integer.parseInt(System.console().readLine());
            System.out.println("Jugador 2 elija la COLUMNA (0 a 2) ");
            columnaJugador2 = Integer.parseInt(System.console().readLine());

            if (juego[filaJugador2][columnaJugador2] == VACIA) {
                juego[filaJugador2][columnaJugador2] = JUGADA2;
            } else {
                System.out.println("La casilla ya está ocupada. Intente de nuevo.");
                continue;
            }

            // COMPROBAR EL 3 EN RAYA PARA SALIR DEL BUCLE

            for (int k = 0; k < juego.length; k++) {
                if ((juego[k][0] == JUGADA1 && juego[k][1] == JUGADA1 && juego[k][2] == JUGADA1) ||
                        (juego[0][k] == JUGADA1 && juego[1][k] == JUGADA1 && juego[2][k] == JUGADA1)) {
                    salida1 = true;
                }

                if ((juego[k][0] == JUGADA2 && juego[k][1] == JUGADA2 && juego[k][2] == JUGADA2) ||
                        (juego[0][k] == JUGADA2 && juego[1][k] == JUGADA2 && juego[2][k] == JUGADA2)) {
                    salida2 = true;
                }
            }

            if ((juego[0][0] == JUGADA1 && juego[1][1] == JUGADA1 && juego[2][2] == JUGADA1) ||
                    (juego[0][2] == JUGADA1 && juego[1][1] == JUGADA1 && juego[2][0] == JUGADA1)) {
                salida1 = true;
            }

            if ((juego[0][0] == JUGADA2 && juego[1][1] == JUGADA2 && juego[2][2] == JUGADA2) ||
                    (juego[0][2] == JUGADA2 && juego[1][1] == JUGADA2 && juego[2][0] == JUGADA2)) {
                salida2 = true;
            }

            // PINTAR EL TABLERO DESPUÉS DE CADA JUGADA
            for (int i = 0; i < juego.length; i++) {
                System.out.print("|");
                for (int j = 0; j < juego[i].length; j++) {
                    if (juego[i][j] == VACIA) {
                        System.out.print(" " + "|");
                    } else if (juego[i][j] == JUGADA1) {
                        System.out.print("O" + "|");
                    } else if (juego[i][j] == JUGADA2) {
                        System.out.print("X" + "|");
                    }
                }
                System.out.println();
            }

        } while (!salida1 && !salida2);

        if (salida1) {
            System.out.println("GANA JUGADOR 1");
        } else {
            System.out.println("GANA JUGADOR 2");
        }
        System.out.println("Fin del juego");
    }
}