import java.util.Scanner;

/**
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos
 * está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará
 * con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
 * puntos. Las preguntas contestadas con falso no suman puntos. A continuación
 * se listan las preguntas del test.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Responda las siguientes preguntas con V o F (En mayusculas).");
        int puntuacion = 0;

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivoaparente.");
        String p1 = sc.nextLine();
        if (p1 == "V") {
            puntuacion += 3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        String p2 = sc.nextLine();
        if (p2 == "V") {
            puntuacion += 3;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente a tí.");
        String p3 = sc.nextLine();
        if (p3 == "V") {
            puntuacion += 3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia.");
        String p4 = sc.nextLine();
        if (p4 == "V") {
            puntuacion += 3;
        }
        System.out.println("5. No te deja que mires la agenda de su movil.");
        String p5 = sc.nextLine();
        if (p5 == "V") {
            puntuacion += 3;
        }
        if ((puntuacion >= 0) && (puntuacion <= 10)) {
            System.out.println("Enhorabuena tu pareja parece ser totalmente fiel.");
        }
        if ((puntuacion > 11) && (puntuacion <= 22)) {
            System.out.println("Enhorabuena tu pareja parece ser totalmente fiel.");
        }
        if ((puntuacion > 22) && (puntuacion <= 30)) {
            System.out.println("Enhorabuena tu pareja parece ser totalmente fiel.");
        }
    }
}
