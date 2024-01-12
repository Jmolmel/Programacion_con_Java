public class T07Ejercicio04_bidim {
  public static void main(String[] args) throws InterruptedException {
    
    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    //Rellenar array

    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int) (Math.random()*900 + 100);
      }
    }
    
    //Mostramos el array
    for (fila = 0; fila < tabla.length; fila++) {
      int sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d",tabla[fila][columna]);
        sumaFila += tabla[fila][columna];
        Thread.sleep(200);
      }
      Thread.sleep(1000);
      System.out.printf("|%8d\n",sumaFila);
    }
    //Muestras las sumas parciales de las columnas
    for (int i = 0; i < tabla.length*12 + 1; i++) {
      System.out.print("-");
    }
    System.out.println();
    int sumaTotal = 0;
    for (columna = 0; columna < tabla[0].length; columna++) {
      int sumaColumna = 0;                       //Reseteo valor fila
      for (fila  = 0; fila < tabla.length; fila++) {
        sumaColumna += sumaColumna + tabla[fila][columna];
      }
      System.out.printf("%8d",sumaColumna);
      Thread.sleep(1000);
      sumaTotal += sumaColumna;
    }
    System.out.printf("|%8d",sumaTotal);
  }
}
