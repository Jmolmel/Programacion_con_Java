import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 100);
        int numero = 0;
        int intentos = 0;

        do {
            intentos++;
            System.out.println("Introduzca un número, por favor.");
            numero = sc.nextInt();
            if (aleatorio < numero) {
                System.out.println("Más bajo");
            } else if (aleatorio > numero) {
                System.out.println("Más alto");
            }
        } while (numero != aleatorio);

        System.out.println("Correcto, lo has conseguido en " + intentos + " intentos.");
    }
}
