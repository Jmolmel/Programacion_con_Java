import java.util.Scanner;

public class ProblemaPPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jugador1;
        String jugador2;
        String jugada1;
        String jugada2;
        int marcadorJ1 = 0;
        int marcadorJ2 = 0;
        System.out.print("Introduzca el nombre del jugador 1: ");
        jugador1 = sc.nextLine();
        System.out.print("Introduzca el nombre del jugador 2: ");
        jugador2 = sc.nextLine();

        int nombreJugador1 = jugador1.length();
        int nombreJugador2 = jugador2.length();

        do {
            do {
                System.out.println("JUGADOR 1. Introduzca su jugada(piedra, papel, tijera)");
                jugada1 = sc.nextLine();
            } while (!jugada1.equalsIgnoreCase("piedra") && !jugada1.equalsIgnoreCase("papel")
                    && !jugada1.equalsIgnoreCase("tijera"));

            System.out.print("\033[H\033[2J");
            System.out.flush();

            do {
                System.out.println("JUGADOR 2. Introduzca su jugada(piedra, papel, tijera)");
                jugada2 = sc.nextLine();
            } while (!jugada2.equalsIgnoreCase("piedra") && !jugada2.equalsIgnoreCase("papel")
                    && !jugada2.equalsIgnoreCase("tijera"));

            System.out.print("\033[H\033[2J");
            System.out.flush();

            if (jugada1.equalsIgnoreCase(jugada2)) {
                System.out.println("EMPATE");
            } else if ((jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("tijera"))
                    || (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("piedra")) ||
                    jugada1.equalsIgnoreCase("tijera") && jugada2.equalsIgnoreCase("papel")) {
                System.out.println("GANA JUGADOR 1.");
                marcadorJ1++;
            } else {
                System.out.println("GANA JUGADOR 2.");
                marcadorJ2++;
            }
            System.out.print(" ");
            for (int i = 0; i < nombreJugador1 + 1; i++) {
                System.out.print("-");
            }
            for (int i = 0; i < 2; i++) {
                System.out.print(" ---");
            }
            System.out.print(" ");
            for (int i = 0; i < nombreJugador2; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.println("|" + jugador1 + " | " + marcadorJ1 + " |" + " " + marcadorJ2 + " |"
                    + jugador2 + " |");

            System.out.print(" ");
            for (int i = 0; i < nombreJugador1 + 1; i++) {
                System.out.print("-");
            }
            for (int i = 0; i < 2; i++) {
                System.out.print(" ---");
            }
            System.out.print(" ");
            for (int i = 0; i < nombreJugador2; i++) {
                System.out.print("-");
            }
            System.out.println();
        } while (marcadorJ1 < 3 && marcadorJ2 < 3);

        if (marcadorJ1 == 3) {
            System.out.println("ENHORABUENA JUGADOR 1");
        } else {
            System.out.println("ENHORABUENA JUGADOR 2");
        }
        sc.close();
    }
}
