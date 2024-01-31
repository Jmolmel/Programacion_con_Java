public class Correccion01 {

  public static int generaAleatorias(int minimo, int maximo) {
    return (int) (Math.random() * (maximo - minimo + 1) + minimo);
  }

  public static void mostrarMenu() {
    System.out.println("Introduzca la opcion 1");
  }

  public static void main(String[] args) {
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    int rangoMinimoMaquina = 0;
    int rangoMaximoMaquina = 0;
    int intentos = 0;
    int numPensado;
    int respuesta;
    boolean acertado = false;
    int opcion = 0;

    do {
      System.out.println("-D-I-V-I-N-A-R-E-M-");
      System.out.println("Introducir rango minimo");
      minimo = Integer.parseInt(System.console().readLine());
      System.out.println("Introducir rango maximo");
      maximo = Integer.parseInt(System.console().readLine());
      System.out.println("El rango de números mínimo es " + minimo + " y puede llegar hasta el número " + (maximo + 1));
      System.out.println("-D-I-V-I-N-A-R-E-M- ELIGE SU PROPIO RANGO");

      if (minimo >= maximo) {
        System.out.println("ERROR: El valor mínimo debe ser menor que el máximo");
      }

    } while (minimo >= maximo);

    do {
      do {
        rangoMinimoMaquina = generaAleatorias(minimo, maximo);
        rangoMaximoMaquina = generaAleatorias(minimo, maximo);
      } while (rangoMinimoMaquina >= rangoMaximoMaquina);

      // Corrected the intentos calculation
      intentos = (int) (Math.log(rangoMaximoMaquina - rangoMinimoMaquina + 1) / Math.log(2) + 1);

      System.out.println("-D-I-V-I-N-A-R-E-M-");
      System.out.println("Estoy pensando un número entre " + rangoMinimoMaquina + " y " + rangoMaximoMaquina);
      System.out.println("Con un número de intentos: " + intentos);

      numPensado = generaAleatorias(rangoMinimoMaquina, rangoMaximoMaquina);

      do {
        System.out.println("Introduce el número para adivinarlo: ");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == numPensado) {
          acertado = true;
          System.out.println("ENHORABUENA HAS ACERTADO");
        } else if (respuesta < numPensado) {
          System.out.println("Te has quedado corto");
          intentos--;
        } else {
          System.out.println("Te has pasado");
          intentos--;
        }

        if (intentos == 0 && !acertado) {
          System.out.println("Has superado el número de intentos, el número que había que acertar era " + numPensado);
        }
        do {
          mostrarMenu();
          opcion = Integer.parseInt(System.console().readLine());
          if (opcion != 1 && opcion != 2) {
            System.out.println("ERROR: Elige las opciones 1 o 2");
          } else if (opcion == 2) {
            System.out.println("GRACIAS POR JUGAR");
          } else if (opcion == 1) {
            System.out.println("Cargando juego");
          }
        } while (opcion != 1 && opcion != 2);
        
      } while (opcion == 1);
    } while (!acertado && intentos != 0);
  }
}