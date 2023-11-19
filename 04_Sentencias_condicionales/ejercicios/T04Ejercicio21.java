import java.util.Scanner;

/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 * de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 * la nota media anterior.
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double nota1;
        Double nota2;
        Double media;

        System.out.print("Introduzca la nota del primer control: ");
        nota1 = sc.nextDouble();
        System.out.print("Introduzca la nota del segundo control: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Usted esta aprobado, su media es de " + media);
        }
        if (media < 5) {
            System.out.println("Usted está suspenso.");
            System.out.println("¿Cuál ha sido el resultado de su recuperación?( apto / no apto)");
            String resultado = sc.next();
            if (resultado.equals("apto")) {
                System.out.println("Su nota es un 5");
            } else {
                System.out.println("Esta suspenso, esta es su media: " + media);
            }

        }
        sc.close();
    }
}
