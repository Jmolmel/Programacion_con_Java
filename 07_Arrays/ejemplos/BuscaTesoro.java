/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class BuscaTesoro {
  public static void main(String[] args) {
    // Constantes que van a representar las diferentes casillas
    final int VACIA = 0;
    final int TESORO = 1;
    final int MINA = 2;
    final int JUGADA = 3;
    int fila;
    int columna;

    // Tablero 4 finlas y 5 columnas
    int[][] tablero = new int[4][5];

    // Inicializamos el tablero con casillas VACIA
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = VACIA; // Lo ponemos en valor 0 (aunque ya viene definido a 0)
      }
    }

    // Se coloca una casilla de TESORO de manera aleatoria en el tablero
    int tesoroFila = (int) (Math.random() * 4); // Numero aleatorio entero de 0 a 4
    int tesoroColumna = (int) (Math.random() * 5); // Numero aleatorio entero de 0 a 4
    tablero[tesoroFila][tesoroColumna] = TESORO;

    // Se coloca una casilla de MINA de manera aleatoria en el tablero
    // Pero no puede ser la misma casilla que la del tesoro
    int minaFila;
    int minaColumna;
    do {
      minaFila = (int) (Math.random() * 4); // Numero aleatorio entero de 0 a 4
      minaColumna = (int) (Math.random() * 5); // Numero aleatorio entero de 0 a 4
    } while ((tesoroFila == minaFila) && (tesoroColumna == minaColumna)); // No pueden coincidir ni tesoro ni mina en
                                                                          // las columnas
    tablero[minaFila][minaColumna] = MINA; // Coloca la mina

    // Iniciamos el juego
    System.out.println("JUEGO DEL TESORO");

    boolean salida = false;

    do {
      // Pintamos el tablero
      for (int i = tablero.length - 1; i >= 0; i--) {
        System.out.print(i + " |");
        for (int j = 0; j < tablero[i].length; j++) { // La longitud de tablero[i] es hasta la última columna
          if (tablero[i][j] == JUGADA) {
            System.out.printf("%2s", "X");
          } else {
            System.out.printf("%2s", " ");
          }
        }
        System.out.println(); // Salto de linea para pintar la fila siguiente
      }
      System.out.print("   ");
      for (int i = 0; i < (3 * tablero[0].length); i++) {
        System.out.print("-");
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d ", j);
      }
      System.out.println();
      // Pido las coordenadas
      System.out.print("Introduce fila: ");
      fila = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce columna: ");
      columna = Integer.parseInt(System.console().readLine());

      // Compruebo lo que hay en las coordenadas introducidas por el jugador

      switch (tablero[fila][columna]) {
        case VACIA:
          tablero[fila][columna] = JUGADA;
          break;
        case MINA:
          System.out.println("SU JUEGO HA TERMINADO...¡HAS ENCONTRADO UNA MINA! ");
          salida = true;
          break;
        case TESORO:
          System.out.println("ENHORABUENA...¡HAS ENCONTRADO EL TESORO! ");
          salida = true;
          break;
        default:
      }
    } while (!salida); // Si salimos del bucle do-while es porque toco mina o tesoro

    // Pintamos el tablero final, una vez terminada la partida
    String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "*";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADA:
            c = "X";
            break;
          default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3 * tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d ", j);
    }
  }
}
