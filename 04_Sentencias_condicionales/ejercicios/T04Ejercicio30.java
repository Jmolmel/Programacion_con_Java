import java.util.Scanner;

/**
 * 
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        int comprobarYear = 0;

        System.out.print("Introduzca el año actual: ");
        year = sc.nextInt();
        System.out.print("Introduzca otro año para comprobar si es bisiesto o no: ");
        comprobarYear = sc.nextInt();

        if (comprobarYear > 0) {
            if (year > comprobarYear) {
                if ((comprobarYear % 400 == 0) || (comprobarYear % 4 == 0)) {
                    System.out.println("Su año fué bisiesto.");
                } else {
                    System.out.println("NO fué bisiesto.");
                }
            }
            if (year < comprobarYear) {
                if ((comprobarYear % 400 == 0) || (comprobarYear % 4 == 0)) {
                    System.out.println("Su año será bisiesto.");
                } else {
                    System.out.println("NO será bisiesto.");
                }
            }
            if (year == comprobarYear) {
                if ((comprobarYear % 400 == 0) || (comprobarYear % 4 == 0)) {
                    System.out.println("Su año es bisiesto.");
                } else {
                    System.out.println("NO es bisiesto.");
                }
            }
        }
    }
}
