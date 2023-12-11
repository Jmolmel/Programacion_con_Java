import java.util.Scanner;

/**
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y
 * el 8
 * (todos los que encuentre). Realiza un programa que muestre un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo: ");
        int numero = sc.nextInt();

        int copiaNumero = numero;
        int volteado = 0;
        boolean comido = false;
        int contador = 0;

        while (copiaNumero > 0) {
            if (copiaNumero % 10 != 0 && copiaNumero % 10 != 8) {
                volteado = volteado * 10 + copiaNumero % 10;

            } else {
                comido = true;
            }
            copiaNumero /= 10;
        }

        int copia = volteado;

        volteado = 0;
        while (copia > 0) {
            volteado = volteado * 10 + copia % 10;
            copia /= 10;
        }
        if (comido) {
            System.out.println(volteado);
        } else {
            System.out.println("No se ha comido ningún número.");
        }

    }
}
