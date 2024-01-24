import java.util.Scanner;

public class T07Ejercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TRES O MÁS");

        int puntosJugador1 = 0;
        int puntosJugador2 = 0;

        for (int ronda = 1; ronda <= 10; ronda++) {
            System.out.println("Ronda " + ronda);

            // Tiradas del jugador 1
            int[] tiradaJugador1 = new int[5];
            for (int i = 0; i < 5; i++) {
                tiradaJugador1[i] = (int) (Math.random() * 6) + 1;
            }
            int puntosTiradaJugador1 = 0;

            System.out.print("Tirada " + ronda + " del jugador 1: ");
            for (int i = 0; i < tiradaJugador1.length; i++) {
                System.out.print(tiradaJugador1[i]);
                if (i < tiradaJugador1.length - 1) {
                    System.out.print("-");
                }
            }

            // Calcular puntos del jugador 1
            int[] conteoDadosJugador1 = new int[6];
            for (int valor : tiradaJugador1) {
                conteoDadosJugador1[valor - 1]++;
            }

            for (int i = 0; i < 6; i++) {
                if (conteoDadosJugador1[i] >= 3) {
                    if (conteoDadosJugador1[i] == 3) {
                        puntosTiradaJugador1 = 3;
                    } else if (conteoDadosJugador1[i] == 4) {
                        puntosTiradaJugador1 = 6;
                    } else {
                        puntosTiradaJugador1 = 12;
                    }
                    break;
                }
            }

            puntosJugador1 += puntosTiradaJugador1;
            System.out.println("; " + puntosTiradaJugador1 + " puntos");

            // Tiradas del jugador 2
            int[] tiradaJugador2 = new int[5];
            for (int i = 0; i < 5; i++) {
                tiradaJugador2[i] = (int) (Math.random() * 6) + 1;
            }
            int puntosTiradaJugador2 = 0;

            System.out.print("Tirada " + ronda + " del jugador 2: ");
            for (int i = 0; i < tiradaJugador2.length; i++) {
                System.out.print(tiradaJugador2[i]);
                if (i < tiradaJugador2.length - 1) {
                    System.out.print("-");
                }
            }

            // Calcular puntos del jugador 2
            int[] conteoDadosJugador2 = new int[6];
            for (int valor : tiradaJugador2) {
                conteoDadosJugador2[valor - 1]++;
            }

            for (int i = 0; i < 6; i++) {
                if (conteoDadosJugador2[i] >= 3) {
                    if (conteoDadosJugador2[i] == 3) {
                        puntosTiradaJugador2 = 3;
                    } else if (conteoDadosJugador2[i] == 4) {
                        puntosTiradaJugador2 = 6;
                    } else {
                        puntosTiradaJugador2 = 12;
                    }
                    break;
                }
            }

            puntosJugador2 += puntosTiradaJugador2;
            System.out.println(
                    "; " + puntosTiradaJugador2 + " puntos ; " + (puntosTiradaJugador2 > 0 ? "Tirada extra" : ""));

            System.out.println("Fin de ronda " + ronda + " ; Jugador 1 - " + puntosJugador1 + " puntos ; Jugador 2 - "
                    + puntosJugador2 + " puntos");

            // Esperar entrada del usuario para pasar a la siguiente ronda
            System.out.println("Pulse INTRO para la siguiente ronda");
            scanner.nextLine();
        }

        System.out.println("Fin de la partida");
        if (puntosJugador1 > puntosJugador2) {
            System.out.println("¡Gana el jugador 1 con " + puntosJugador1 + " puntos!");
        } else if (puntosJugador2 > puntosJugador1) {
            System.out.println("¡Gana el jugador 2 con " + puntosJugador2 + " puntos!");
        } else {
            System.out.println("¡La partida ha terminado en empate!");
        }
    }
}