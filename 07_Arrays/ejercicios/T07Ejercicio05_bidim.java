/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 * 
 * @author José Molina Meléndez
 */
public class T07Ejercicio05_bidim {
  public static void main(String[] args) {
    int[][] numeros = new int[6][10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        numeros[i][j] = ((int) (Math.random() * 1001));
        System.out.print(numeros[i][j] + " ");
        if (numeros[i][j] > maximo) {
          maximo = numeros[i][j];
        }
        if (numeros[i][j] < minimo) {
          minimo = numeros[i][j];
        }
      }
      System.out.println();
    }

    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        if (numeros[i][j] == maximo) {
          System.out.println("El máximo está en la fila: " + i + ", columna: " + j);
        }
        if (numeros[i][j] == minimo) {
          System.out.println("El mínimo está en la fila: " + i + ", columna: " + j);
        }
        }
      }
    }
  }

