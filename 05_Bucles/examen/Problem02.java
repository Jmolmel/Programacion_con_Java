public class Problem02 {
  public static void main(String[] args) {
    String jugador1;
    String jugador2;
    int longitud1;
    int longitud2;
    int longitudMayor = 0;
    String jugada1;
    String jugada2;
    boolean salidaJugadas = false;
    int puntuacionJugador1 = 0;
    int puntuacionJugador2 = 0;

    System.out.println("Introduzca el nombre del  jugador 1");
    jugador1 = System.console().readLine();
    System.out.println("Introduzca el nombre del jugador 2");
    jugador2 = System.console().readLine();
    longitud1 = jugador1.length(); // Longitud nombres
    longitud2 = jugador2.length(); // Longitud nombres

    if (longitud1 > longitud2) { // Comparamos y guardamos la longitud mayor
      longitudMayor = longitud1;
    } else {
      longitudMayor = longitud2;
    }

    do {
      do {
        System.out.println("Jugador 1. Introduzca su jugada(Piedra, papel, tijera)");
        jugada1 = System.console().readLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Jugador 2. Introduzca su jugada(Piedra, papel, tijera)");
        jugada2 = System.console().readLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if ((jugada1.equalsIgnoreCase("piedra") || jugada1.equalsIgnoreCase("papel")
            || jugada1.equalsIgnoreCase("tijera")) &&
            (jugada2.equalsIgnoreCase("piedra") || jugada2.equalsIgnoreCase("papel")
                || jugada2.equalsIgnoreCase("tijera"))) {
          salidaJugadas = true;
        } else {
          System.out.println("Su jugada es erronea, vuelva a introducirla.");
        }
      } while (!salidaJugadas);

      if (jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("tijera")
          || jugada1.equalsIgnoreCase("papel") && jugada1.equalsIgnoreCase("piedra")
          || jugada1.equalsIgnoreCase("tijera") && jugada2.equalsIgnoreCase("papel")) {
        System.out.println("Gana el jugador 1.");
        puntuacionJugador1++;
      } else {
        System.out.println("Gana el jugador 2.");
        puntuacionJugador2++;
      }
      // PINTAMOS CON FOR
      System.out.print(" ");
      for (int i = 0; i < longitudMayor + 3; i++) {
        System.out.print("-");
      }
      for (int i = 0; i < 2; i++) {
        System.out.print(" ---");
      }
      System.out.print(" ");
      for (int i = 0; i < longitudMayor + 3; i++) {
        System.out.print("-");
      }
      System.out.println();
      System.out.print("| ");
      for (int i = 0; i < longitudMayor - longitud1; i++) {
        System.out.print(" ");
      }
      System.out.print(jugador1 + "  | " + puntuacionJugador1 + " | " + puntuacionJugador2 + " | ");
      for (int i = 0; i < longitudMayor - longitud2; i++) {
        System.out.print(" ");
      }
      System.out.println(jugador2 + " |");

      System.out.print(" ");
      for (int i = 0; i < longitudMayor + 3; i++) {
        System.out.print("-");
      }
      for (int i = 0; i < 2; i++) {
        System.out.print(" ---");
      }
      System.out.print(" ");
      for (int i = 0; i < longitudMayor + 3; i++) {
        System.out.print("-");
      }
    } while (puntuacionJugador1 < 3 && puntuacionJugador2 < 3);

  }
}
