import java.util.Scanner;

/**
 * Escribe un programa que pida un número por teclado y que luego lo “disloque”
 * de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar. Usa long en lugar de int donde sea necesario para admitir números
 * largos.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroVolteado = 0;
        int digito = 0;
        int contador = 0;

        System.out.println("Introduzca un número para que sea dislocado: ");
        int numero = sc.nextInt();

        while (numero > 0) {
            numeroVolteado = (numeroVolteado * 10) + (numero % 10);
            numero /= 10;
            contador++;
        }

        for (int i = 1; i <= contador; i++) {
            digito = numeroVolteado % 10;
            numeroVolteado /= 10;
            if (digito % 2 == 0) {
                System.out.print(digito + 1);
            } else {
                System.out.print(digito - 1);
            }
        }
    }
}
