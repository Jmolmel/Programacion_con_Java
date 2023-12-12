import java.util.Scanner;

/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class T05Historigramabis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cifraIntroducida = 0;      //Almaceno cifra introducida
    long numeroCompleto = 0;       // numero formado al introducir las cifras
    long numeroVolteado = 0;       // volteamos el numerco completo
    int digito = 0;
    int digitoMayor = 0;
    int numeroDigitos = 0;

    System.out.println("Introduzca números entre el 0 y 9.");
    do {
      cifraIntroducida = sc.nextInt();
      if (cifraIntroducida >= 0 && cifraIntroducida <= 9) {
        numeroCompleto = (numeroCompleto * 10) + cifraIntroducida;
      }
      
      
    } while (cifraIntroducida >= 0 && cifraIntroducida <= 9);

    
    while (numeroCompleto > 0) {
      digito = (int) (numeroCompleto % 10);
      
      if (digito > digitoMayor) {
        digitoMayor = digito;
      }
      numeroVolteado = numeroVolteado * 10 + numeroCompleto % 10;
      numeroCompleto /= 10;
      numeroDigitos++;
    }


    //Empezamos a mostrarlo por tabla, teniendo en cuenta que hay que pintar digitoMayor + 1 columnas y numeroDigitos filas.

    int numeroColumnas = digitoMayor + 1;
    int numeroFilas = numeroDigitos;

    //Pintamos los primeros 3 guiones

    for (int i = 1; i <= numeroColumnas ; i++) {
      System.out.print(" ---");
    }


    for (int i = 1; i <= numeroFilas; i++) {
      System.out.println();
      digito = (int) (numeroVolteado % 10);
      numeroVolteado /= 10;  
      System.out.print("| " + digito + " |");
      //pintamos asteriscos
      for (int j = 1; j <= digito; j++) {
        System.out.print(" * |");
      }
      //Pintamos el resto de columnas
      for (int j = 1; j < numeroColumnas - digito; j++) {
        System.out.print("   |");
      }
      System.out.println();

      for (int j = 1; j <= numeroColumnas; j++) {
        System.out.print(" ---");
      }
    }
    sc.close();
  }
}
