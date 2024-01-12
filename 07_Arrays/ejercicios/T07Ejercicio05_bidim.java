public class T07Ejercicio05_bidim {
  public static void main(String[] args) {
    int[][] numero = new int[6][10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    for (int i = 0; i < numero.length; i++) {
      for (int j = 0; j < numero[i].length; j++) {
        numero[i][j] = (int) (Math.random() * 1001);
        if (numero[i][j] > maximo) {
          maximo = numero[i][j];
        } else if (numero[i][j] < minimo) {
          minimo = numero[i][j];
        }
        System.out.printf("%8d",numero[i][j]);
      }
    System.out.println();
    }

    for (int i = 0; i < numero.length; i++) {
      for (int j = 0; j < numero[i].length; j++) {
        if (numero[i][j] == maximo) {
          System.out.println("El número MAXIMO es: " + numero[i][j] + " en la fila " + i + " columna " + j);
        } else if (numero[i][j] == minimo) {
          System.out.println("El número MINIMO es: " + numero[i][j] + " en la fila " + i + " columna " + j);
        };
      }
    }
  }
}
