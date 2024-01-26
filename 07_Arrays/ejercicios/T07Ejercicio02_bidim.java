public class T07Ejercicio02_bidim {
  public static void main(String[] args) {
    int[][] numeros = new int[4][5];
    int sumaFilas;
    int sumaColumnas;
    int sumaTotal = 0;
    //Relleno Array
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        numeros[i][j] = (int) (Math.random() * 151 + 250);          //Num aleatorios del 250 al 400
      }
    }
    //Sumamos Columnas que pedimos por teclado.

    //Pinto la tabla y sumo las filas
    for (int i = 0; i < numeros.length; i++) {
      sumaFilas = 0;
      for (int j = 0; j < numeros[i].length; j++) {
        System.out.printf("% -10d", numeros[i][j]);
        sumaFilas += numeros[i][j];
      }
      sumaTotal += sumaFilas;
      System.out.printf(" |SUMA: %3d", sumaFilas);
      System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    //Pinto la suma de las Columnas

    for (int i = 0; i < 5 ; i++) {  //El bucle llega hasta el valor de columna
      sumaColumnas = 0; 
      for (int j = 0; j < 4; j++) { //El bucle llega hasta el valor de fila
        sumaColumnas +=  numeros[j][i]; //Suma j i
      }
      System.out.printf("%-10d", sumaColumnas);
    }
    System.out.printf(" | Total%5d", sumaTotal);
  }
}
