/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean datosCorrectos = true;
        String primerDia;
        String segundoDia;
        int primeraHora;
        int segundaHora;
        int numeroPrimerDia = 0;
        int numeroSegundoDia = 0;
        String nombrePrimerDia = "";
        String nombreSegundoDia = "";

        do {
            System.out.println("Introduzca la primera hora: ");
            primeraHora = sc.nextInt();
            System.out.print("Día:  ");
            sc.nextLine(); // Consume the newline character
            primerDia = sc.nextLine();

            switch (primerDia.toLowerCase()) {
                case "1", "lunes":
                    nombrePrimerDia = "lunes";
                    numeroPrimerDia = 1;
                    break;
                case "2", "martes":
                    nombrePrimerDia = "martes";
                    numeroPrimerDia = 2;
                    break;
                case "3", "miercoles":
                    nombrePrimerDia = "miercoles";
                    numeroPrimerDia = 3;
                    break;
                case "4", "jueves":
                    nombrePrimerDia = "jueves";
                    numeroPrimerDia = 4;
                    break;
                case "5", "viernes":
                    nombrePrimerDia = "viernes";
                    numeroPrimerDia = 5;
                    break;
                case "6", "sabado":
                    nombrePrimerDia = "sabado";
                    numeroPrimerDia = 6;
                    break;
                case "7", "domingo":
                    nombrePrimerDia = "domingo";
                    numeroPrimerDia = 7;
                    break;
                default:
                    numeroPrimerDia = 0;
                    break;
            }

            System.out.println("Introduzca la segunda hora: ");
            segundaHora = sc.nextInt();
            System.out.print("Día:  ");
            sc.nextLine(); // Consume the newline character
            segundoDia = sc.nextLine();

            switch (segundoDia.toLowerCase()) {
                case "1", "lunes":
                    nombreSegundoDia = "lunes";
                    numeroSegundoDia = 1;
                    break;
                case "2", "martes":
                    nombreSegundoDia = "martes";
                    numeroSegundoDia = 2;
                    break;
                case "3", "miercoles":
                    nombreSegundoDia = "miercoles";
                    numeroSegundoDia = 3;
                    break;
                case "4", "jueves":
                    nombreSegundoDia = "jueves";
                    numeroSegundoDia = 4;
                    break;
                case "5", "viernes":
                    nombreSegundoDia = "viernes";
                    numeroSegundoDia = 5;
                    break;
                case "6", "sabado":
                    nombreSegundoDia = "sabado";
                    numeroSegundoDia = 6;
                    break;
                case "7", "domingo":
                    nombreSegundoDia = "domingo";
                    numeroSegundoDia = 7;
                    break;
                default:
                    numeroSegundoDia = 0;
                    break;
            }

            datosCorrectos = true;

            if (numeroSegundoDia <= numeroPrimerDia) {
                System.out.println("El segundo día debe ser posterior al primero.");
                datosCorrectos = false;
            }
            if ((numeroPrimerDia == 0) || (numeroSegundoDia == 0)) {
                System.out.println("No se ha introducido un día válido.");
                datosCorrectos = false;
            }
            if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
                System.out.println("No es una hora correcta.");
                datosCorrectos = false;
            }

        } while (!datosCorrectos);

        System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
        System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
        System.out.println(" hay " + (((numeroSegundoDia * 24) + segundaHora) - ((numeroPrimerDia * 24) + primeraHora))
                + " horas.");

        sc.close();
    }
}