import java.util.Scanner;

public class Practica02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jugada1;
        String jugada2;
        int marcador1 = 0;
        int marcador2 = 0;

        System.out.println("Jugador 1, Introduzca su nombre ");
        String nombre1 = sc.nextLine();
        System.out.println("Jugador 2, Introduzca su nombre ");
        String nombre2 = sc.nextLine();

        do {

            do {
                System.out.println("Jugador 1, introduzca su jugada(piedra, papel, tijera)");
                jugada1 = sc.nextLine();

            } while (!jugada1.equalsIgnoreCase(
                    "piedra") && !jugada1.equalsIgnoreCase("papel") && !jugada1.equalsIgnoreCase("tijera"));

            System.out.print("\033[H\033[2J");

            System.out.flush();

            // Jugador 2
            do {
                System.out.println("Jugador 2, introduzca su jugada(piedra, papel, tijera)");
                jugada2 = sc.nextLine();

            } while (!jugada2.equalsIgnoreCase(
                    "piedra") && !jugada2.equalsIgnoreCase("papel") && !jugada2.equalsIgnoreCase("tijera"));

            System.out.print("\033[H\033[2J");

            System.out.flush();

            if ((jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("tijera"))
                    || (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("piedra"))
                    || (jugada1.equalsIgnoreCase("tijera") && jugada2.equalsIgnoreCase("papel"))) {
                marcador1++;
                System.out.println("Gana JUGADOR 1");
            } else {
                marcador2++;
                System.out.println("Gana JUGADOR2");
            }

            // MARCADOR
            System.out.print(" ");
            for (int i = 0; i < nombre1.length() + 2; i++) {
                System.out.print("-");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" --- ");
            }
            for (int i = 0; i < nombre2.length() + 1; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.println("| " + nombre1 + " | " + marcador1 + " | " + marcador2 + " | " + nombre2 + " |");

            System.out.print(" ");
            for (int i = 0; i < nombre1.length() + 2; i++) {
                System.out.print("-");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(" --- ");
            }
            for (int i = 0; i < nombre2.length() + 1; i++) {
                System.out.print("-");
            }
        } while (marcador1 < 3 && marcador2 < 3);

        sc.close();
    }
}
