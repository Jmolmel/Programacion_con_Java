public class Ejercicio02 {

  //Función para generar una tabla con números aleatorios
  // public static int[][] generarTablaAleatoria(int filas, int columnas, int maxAleatorio) {

  //   return tabla;
  // }

  //  // Función para generar una tabla introduciendp números manualmente

  //     return tabla;
  //   }

  // // // Función para mostrar la tabla
  // public static void mostrarTabla(int[][] tabla) {
  //   if (tabla == null) {
  //   System.out.println("Primero debe generar la tabla.");
  //   return tabla;
  //   }
  // }

  // // Función para intercambiar dos filas en la tabla
  // public static void intercambiarFilas(int[][] tabla, int fila1, int fila2) {
  //   /* COMPLETAR */
  // }

  // // Función para intercambiar dos columnas en la tabla
  // public static void intercambiarColumnas(int[][] tabla, int col1, int col2) {
  //   /* COMPLETAR */
  // }

  // // Función para sumar los elementos de una fila
  // public static int sumarFila(int[][] tabla, int fila) {
  //   /* COMPLETAR */
  // }

  // // Función para sumar los elementos de una columna
  // public static int sumarColumna(int[][] tabla, int col) {
  //   /* COMPLETAR */
  // }


  public static void main(String[] args) {
    boolean continuar = true;
    int filas = 0;
    int columnas = 0;
    int fila1 = 0;
    int col1= 0;
    int fila2 = 0;
    int col2 = 0;
    int filaSuma = 0;
    int colSuma = 0;
    int maxAleatorio = 0;
    int numeroIntroducidoTablaManual = 0;
    int[][] tablaAleatoria = new int[filas][columnas];
    int[][] tablaManual = new int[filas][columnas];

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
        System.out.println("Introduzca filas");
        filas = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca columnas");
        columnas = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el máximo número aleatorio que desea llegar.");
        maxAleatorio = Integer.parseInt(System.console().readLine());
        tablaAleatoria = new int[filas][columnas];
        for (int i = 0; i < tablaAleatoria.length; i++) {
          for (int j = 0; j < tablaAleatoria[i].length; j++) {
              tablaAleatoria[i][j] = (int) (Math.random() * maxAleatorio);
          }
        }
          break;
        case 2:
        System.out.println("Introduzca filas");
        filas = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca columnas");
        columnas = Integer.parseInt(System.console().readLine());
        tablaManual = new int[filas][columnas];

        for (int i = 0; i < tablaManual.length; i++) {
          for (int j = 0; j < tablaManual[i].length; j++) {
            System.out.println("Introduzca sus números: ");
            numeroIntroducidoTablaManual = Integer.parseInt(System.console().readLine());
            numeroIntroducidoTablaManual = tablaManual[i][j];
          }
        }
          break;
        case 3:
        System.out.println("¿Qué tabla desea pintar?(1.TablaAleatoria)(2.TablaManual)");
        int eleccion = Integer.parseInt(System.console().readLine());
        switch (eleccion) {
          case 1:
          for (int i = 0; i < tablaAleatoria.length; i++) {
            for (int j = 0; j < tablaAleatoria[i].length; j++) {
            System.out.print(tablaAleatoria[i][j] + "  ");
            }
            System.out.println();
          }
            break;
          case 2:
            for (int i = 0; i < tablaAleatoria.length; i++) {
            for (int j = 0; j < tablaAleatoria[i].length; j++) {
              System.out.print(tablaManual[i][j] + " ");
            }
            System.out.println();
          }
            break;
        }

          break;
        case 4:
          /*
           * Completar
           */
          //intercambiarFilas(tabla, fila1, fila2);
          break;
        case 5:
          /*
           * Completar
           */
          //intercambiarColumnas(tabla, col1, col2);
          break;
        case 6:
        System.out.println("¿Qué tabla desea sumar?(1.TablaAleatoria)");
        int eleccion2 = Integer.parseInt(System.console().readLine());
        switch (eleccion2) {
          case 1:
          System.out.println("Introduzca fila: ");
          int filaElegida = Integer.parseInt(System.console().readLine());
          for (int i = 0; i < tablaAleatoria.length; i++) {
            filaSuma = 0;
            for (int j = 0; j < tablaAleatoria[i].length; j++) {
            filaSuma += tablaAleatoria[filaElegida][j];
            }
            System.out.println();
          }
          System.out.println("Suma de la fila " + filaElegida + " es: " + filaSuma);
            break;
          case 2:
            for (int i = 0; i < tablaManual.length; i++) {
            for (int j = 0; j < tablaManual[i].length; j++) {
              System.out.print(tablaManual[i][j]);
            }
            System.out.println();
          }
            break;
        }
          break;
        case 7:
        System.out.println("Introduzca columna: ");
        int columnaElegida = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < columnas; i++) {
          filaSuma = 0;
          for (int j = 0; j < filas; j++) {
          filaSuma += tablaAleatoria[j][i];
          }
          System.out.println();
        }
        System.out.println("Suma de la fila " + columnaElegida + " es: " + filaSuma);
          break;
        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
