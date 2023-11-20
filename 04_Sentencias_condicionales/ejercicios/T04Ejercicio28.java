import java.util.Scanner;

/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una
 * opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------PIEDRA PAPEL TIJERA---------");
        System.out.println("Jugador 1, introduzca su jugada (piedra, papel o tijera)");
        String jugador1 = sc.next();
        System.out.println("Jugador 2, introduzca su jugada (piedra, papel o tijera)");
        String jugador2 = sc.next();

        if ((jugador1.equals("piedra") || jugador1.equals("papel") || jugador1.equals("tijera")) &&
                (jugador2.equals("piedra") || jugador2.equals("papel") || jugador2.equals("tijera")))
            ;
        {

            if (jugador1.equals("jugador2")) {
                System.out.println("Empate");

            } else if ((jugador1.equals("piedra") && jugador2.equals("tijera"))
                    || (jugador1.equals("papel") && jugador2.equals("piedra"))
                    || (jugador1.equals("tijera") && jugador2.equals("papel"))) {
                System.out.println("Jugador 1 gana");
            } else {
                System.out.println("Jugador 2 gana.");
            }

        }

    }
}
