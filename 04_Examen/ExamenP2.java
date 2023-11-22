import java.util.Scanner;

public class ExamenP2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pisoDestino = 0;
    int pisoActual = 0;
    int numeroDePersonas = 0;
    int peso = 0;
    int pisoMaximo = 10;
    int pisoSiguiente = 1;


    System.out.print("¿A qué piso desea viajar?: ");
    pisoDestino = sc.nextInt();
    System.out.print("Introduzca el número de personas: ");
    numeroDePersonas = sc.nextInt();
    System.out.print("Introduzca el peso de las personas: ");
    peso = sc.nextInt();
    
    if ((pisoDestino > 0 && pisoDestino <= 10) && (pisoActual - pisoDestino <= 2) && (peso <= 300) && (numeroDePersonas <= 4)) {
      while (pisoDestino != -1) {
        if (pisoDestino == +1) {
          pisoActual = pisoDestino + pisoSiguiente - pisoMaximo;
          pisoActual++;
          System.out.println("Subiendo...");
          System.out.printf("Ha llegado al piso %2d", pisoActual);
        }
        if (pisoDestino == -1) {
          pisoActual--;
          System.out.println("Bajando...");
          System.out.printf("Ha llegado al piso %2d", pisoActual);
        }
        }
    } else {
      System.out.println("No es posible subir tantos pisos.");
    }
  }
}