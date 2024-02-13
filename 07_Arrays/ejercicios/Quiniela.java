public class Quiniela {
  public static void main(String[] args) {
      int[][] numeros = new int[14][3];
      int[][] maquina = new int[14][3];
      int contadorApuesta1 = 0;
      int contadorApuesta2 = 0;
      int contadorApuesta3 = 0;
      int plenoAlQuinceLocal = (int)(Math.random() * 4);
      int plenoAlQuinceLocalJugador = (int)(Math.random() * 4);
      int plenoAlQuinceVisitanteJugador = (int)(Math.random() * 4);

      int plenoAlQuinceVisitante = (int)(Math.random() * 4);
      String resultadoLocal = "";
      String resultadoVisitante = "";

      for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%2d. ", i + 1);
          for (int j = 0; j < numeros[i].length; j++) {
              numeros[i][j] = (int) (Math.random() * 3); //Mis números aleatorios
              maquina[i][j] = (int) (Math.random() * 3); //Jugada real a comparar

              //IF PARA PINTAR 1 X 2
              System.out.print("|");
              if (numeros[i][j] == 1) {
                  System.out.print("1  ");
              } else if (numeros[i][j] == 0) {
                  System.out.print(" X ");
              } else if (numeros[i][j] == 2) {
                  System.out.print("  2");
              }
          }
          System.out.println();
      }
      for (int i = 0; i < 14; i++) {
          //IF PARA COMPARAR JUGADA CORRECTA
          if (numeros[i][0] == maquina[i][0]) {
              contadorApuesta1++;
          }
          if (numeros[i][1] == maquina[i][1]) {
              contadorApuesta2++;
          }
          if (numeros[i][2] == maquina[i][2]) {
              contadorApuesta3++;
          }
      }


      switch (plenoAlQuinceLocal) {
          case 0:
              resultadoLocal = "0";
              break;
          case 1:
              resultadoLocal = "1";
              break;
          case 2:
              resultadoLocal = "2";
              break;
          case 3:
              resultadoLocal = "M";
              break;

          default:
              break;
      }
      switch (plenoAlQuinceVisitante) {
          case 0:
              resultadoVisitante = "0";
              break;
          case 1:
              resultadoVisitante = "1";
              break;
          case 2:
              resultadoVisitante = "2";
              break;
          case 3:
              resultadoVisitante = "M";
              break;

          default:
              break;
      }
      System.out.println("-------------------");
      System.out.printf("15. | Local %s - Visitante %s \n\n", resultadoLocal, resultadoVisitante);

      //Pinto resultado de columnas
      System.out.println("La columna 1 tiene " + contadorApuesta1 + " aciertos.");
      System.out.println("La columna 2 tiene " + contadorApuesta2 + " aciertos.");
      System.out.println("La columna 3 tiene " + contadorApuesta3 + " aciertos.");

      //Comprobar pleno al 15
      if (contadorApuesta1 == 14 || contadorApuesta2 == 14 || contadorApuesta3 == 14) {
          contadorApuesta1++;
          contadorApuesta2++;
          contadorApuesta3++;
      } else if (plenoAlQuinceLocalJugador == plenoAlQuinceLocal && plenoAlQuinceVisitanteJugador == plenoAlQuinceVisitante) {
              System.out.println("HAS ACERTADO EL PLENO AL 15. ENHORABUENA");
          }

      if (contadorApuesta1 >= 10) {
          System.out.println("Enhorabuena tiene más de 10 aciertos en su primera apuesta!.");
      }
      if (contadorApuesta2 >= 10) {
          System.out.println("Enhorabuena tiene más de 10 aciertos en su segunda apuesta!.");
      }
      if (contadorApuesta3 >= 10) {
          System.out.println("Enhorabuena tiene más de 10 aciertos en su tercera apuesta!.");
      } else {
          System.out.println("No tiene los suficientes aciertos.");
      }
      System.out.println();
  }
}