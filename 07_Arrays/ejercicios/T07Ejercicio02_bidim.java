/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author José Molina Meléndez
 */
public class T07Ejercicio02_bidim {
  public static void main(String[] args) {
    int[][] numeros = new int[4][5];
    int sumaTotal = 0;

    //Rellenar array con números aleatorios
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        numeros[i][j] = (int) (Math.random() * 301 + 200);
      }
    }

    //Sumamos Columnas
    for (int i = 0; i < numeros.length; i++) {
      int sumaFilas = 0;
      for (int j = 0; j < numeros[i].length; j++) {
        System.out.printf("%-10d", numeros[i][j]);
        sumaFilas += numeros[i][j];
      }
      sumaTotal += sumaFilas;
      System.out.printf("|Suma: %-10d\n", sumaFilas);
    }

    //SumaColumna
    System.out.println("--------------------------------------------------");
    for (int i = 0; i < 5; i++) {
      int sumaColumna = 0;
      for (int j = 0; j < 4; j++) {
        sumaColumna += numeros[j][i];
      }
      System.out.printf("%-9d ", sumaColumna);
    }
  }
}
