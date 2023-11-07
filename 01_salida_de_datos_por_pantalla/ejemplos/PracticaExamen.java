/**
 * Ejercicios de práctica para examen.
 * 
 * @author José Molina Meléndez
 */
public class PracticaExamen {
  public static void main(String[] args) {
    
    System.out.printf("El numero %d no tiene decimales\n", 7);
    System.out.printf("El numero %f tiene decimales sin limitar\n", 25.000);
    System.out.printf("El numero %.2f tiene los decimales limitados a 2\n", 25.000);
    System.out.printf("Muestra el numero asci con %c \n", 80);


    System.out.printf("%8d\n", 100); // Coge 8 espacios a la derecha y los reserva
    System.out.printf("%-8d\n", 100); // Lo alinea a la izquierda 
    System.out.printf("%+d\n", 100); // muestra el símbolo
    System.out.printf("%08d\n", 100); //rellena con 0 hasta el 8

    System.out.println("Articulo---------Precio-------- Cajas");
    System.out.printf("%-10s     %8.2f      %10d\n", "Manzanas", 5.2, 10);
    System.out.printf("%-10s     %8.2f      %10d\n", "Peras", 2.5, 10);
    System.out.printf("%-10s     \033[0;33m%8.2f\033[0m      %10d\n", "Naranajas", 9.0, 3);

    System.out.printf("%6s\n", "*");
    System.out.printf("%7s\n", "***");
    System.out.printf("%8s\n", "*****");
    System.out.printf("%9s\n", "*******");
    System.out.printf("%-10s\n", "***********");
    
    int numero;
    numero = 50;
    System.out.println(numero);

    Double num1;
    num1 = 2.57;

    System.out.printf("%.2f\n", num1);

    int division;
    division = (int) (numero/num1);
    System.out.println("Vale "+division);
  }
  
}
