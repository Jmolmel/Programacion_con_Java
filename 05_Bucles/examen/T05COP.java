import java.util.Scanner;

public class T05COP {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    boolean reanudar = false;
    int notaCompleta = 0;
    int numeroVolteado = 0;


      
    System.out.print("Introduzca su primer apellido: ");
    String apellido1 = sc.nextLine();

    System.out.print("Introduzca su segundo apellido: ");
    String apellido2 = sc.nextLine();

    System.out.print("Introduzca su nombre: ");
    String nombre = sc.nextLine();

    int numeroLetras = nombre.length() + apellido1.length() + apellido2.length();
    

    if (nota1 < 0 && nota1 > 10 || nota2 < 0 && nota2 > 10 || nota3 < 0 && nota3 > 10) {
      System.out.println("ERROR");
    } else {
      System.out.println("Introduzca las notas del primer trimestre: ");
      nota1 = sc.nextInt();
      
      System.out.println("Introduzca las notas del segundo trimestre: ");
      nota2 = sc.nextInt();
      
      System.out.println("Introduzca las notas del tercer trimestre: ");
      nota3 = sc.nextInt();
    }

    notaCompleta = notaCompleta * 10 + nota1;
    notaCompleta = notaCompleta * 10 + nota2;
    notaCompleta = notaCompleta * 10 + nota3;

    while (notaCompleta > 0) {
      numeroVolteado = numeroVolteado * 10 + notaCompleta % 10;
      notaCompleta /= 10;
    }

    double notaMedia = (double) (nota1 + nota2 + nota3) / 3;
    
    
    
    int largoTabla = numeroLetras;
    for (int i = 1; i <= numeroLetras + 3; i++) {
      System.out.print(" -");
    }
    System.out.println();
    System.out.print("| " + apellido1 + " "+ apellido2 + "," + nombre + " |");
    for (int i = 1; i <= 3; i++) {
      int digito = numeroVolteado % 10;
      numeroVolteado /= 10;
      if (digito >= 5) {
        System.out.printf("\033[32m%d |",digito);
      }
      
      if (digito < 5) {
        System.out.printf(" \033[31m %d |",digito);
      }
    }
    if (notaMedia >= 5) {
      System.out.printf(" \033[32m %.2f |", notaMedia);
    }
    if (notaMedia < 5) {
      System.out.printf(" \033[31m %.2f |", notaMedia);
    }
    

    System.out.println();
    for (int i = 1; i <= numeroLetras + 3; i++) {
      System.out.print(" -");
    }

    System.out.println();

    System.out.println("¿Desea continuar introduciendo notas de nuevos alumnos? INTRODUZCA (S o N)");
    String reanudarsn = sc.nextLine();



  }

  }

}
