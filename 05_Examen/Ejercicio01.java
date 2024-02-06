public class Ejercicio01 {
  public static void main(String[] args) {
    int menu;
    final String ROJO = "\033[0;31m";
    final String VERDE = "\033[0;32m";
    final String REINICIAR = "\033[0;0m"; //REINICIA COLOR BLANCO
    double euros = 0;
    double formulaEuros = 0;
    int numero = 0;
    int numero2 = 0;
    int contadorPar = 0;
    int contadorImpar = 0;
    boolean salir = false;

    do {
      System.out.println();
      System.out.println("---MENU---");
      System.out.println("Elija su opción");
      System.out.println("Opcion 1 - Nota media");
      System.out.println("Opcion 2 - Euros a pesetas");
      System.out.println("Opcion 3 - Pesetas a euros");
      System.out.println("Opcion 4 - Longitud de un número");
      System.out.println("Opcion 5 - Digitos pares e impares");
      System.out.println("Opcion 6 - Divisores propios");
      System.out.println("Opcion 7 - Numeros amigos");
      System.out.println("Opcion 8 - Primo");
      System.out.println("Opcion 9 - Nº primeros primos");
      System.out.println("Opcion 10 - Factorial");
      System.out.println("Opcion 11 - SALIR");
      menu = Integer.parseInt(System.console().readLine());

      switch (menu) {
        case 1: //NOTA MEDIA ALUMNO
          System.out.println("Introduzca la primera nota: ");
          int nota1 = Integer.parseInt(System.console().readLine());
          System.out.println("Introduzca la segunda nota: ");
          int nota2 = Integer.parseInt(System.console().readLine());
          System.out.println("Introduzca la tercera nota: ");
          int nota3 = Integer.parseInt(System.console().readLine());
          int notaMedia = (nota1 + nota2 + nota3) / 3;
          if (notaMedia >= 5) {
            System.out.println("Su nota media es " + VERDE + notaMedia + REINICIAR);
          } else {
            System.out.println("Su nota media es " + ROJO + notaMedia + REINICIAR);
          }
          break;

        case 2:  //CONVERSOR EUROS A PESETAS
          System.out.println("Introduzca una cantidad en euros a convertir: ");
          euros = Float.parseFloat(System.console().readLine());
          formulaEuros = (int) 166.386 * euros;
          System.out.printf("%.2f euros son %.0f pesetas.", euros, formulaEuros);
          break;

        case 3:  //CONVERSOR PESETAS A EUROS
          System.out.println("Introduzca una cantidad en pesetas a convertir: ");
          euros = Integer.parseInt(System.console().readLine());
          formulaEuros = euros / 166.386;
          System.out.printf("%.0f pesetas son %.2f euros.", euros, formulaEuros);
          break;

        case 4: //LONGITUD NUMERO
          int longitud = 0;
          int aux = 0;
          System.out.println("Introduzca un número para calcular su longitud: ");
          numero = Integer.parseInt(System.console().readLine());
          aux = numero; // Copio número para mostrarlo antes de que entre en el while.
          while (numero > 0) {
            longitud++;
            numero /= 10;
          }
          System.out.println("Su número " + aux + " tiene una longitud de: " + longitud);
          break;

        case 5: //DIGITOS PARES E IMPARES
          System.out.println("Introduzca un número para comprobar cuantos pares e impares contiene: ");
          numero = Integer.parseInt(System.console().readLine());
          aux = numero;
          while (numero > 0) {
            int digito = numero % 10;
            if (digito == 0) {
              numero /= 10;
            }
            if (digito % 2 == 0) {
              contadorPar++;
            } else if (digito % 2 != 0) {
              contadorImpar++;
            }
            numero /= 10;
          }
          System.out.println(
              "Su número " + aux + " contiene " + contadorPar + " dígitos pares y " + contadorImpar + " impares.");

          break;

        case 6: //DIVISORES PROPIOS
          System.out.println("Introduzca un número entero para ver sus divisores propios: ");
          numero = Integer.parseInt(System.console().readLine());
          int sumaDivisores = 0;
          for (int i = numero; i <= numero; i++) {
            for (int j = 2; j < numero; j++) {
              if (i % j == 0) {
                System.out.print(j + " ");
                sumaDivisores += j;
              }
            }
          }
          System.out.println();
          System.out.println("La suma de los divisores del número: " + numero + " es: " + sumaDivisores);

          break;

        case 7: //NUMEROS AMIGOS
          System.out.println("Introduzca el primer número entero para ver si tiene número amigo: ");
          numero = Integer.parseInt(System.console().readLine());
          System.out.println("Introduzca el segundo número entero para ver si tiene número amigo: ");
          numero2 = Integer.parseInt(System.console().readLine());
          int divisores1 = 0;
          int divisores2 = 0;
          boolean numerosAmigos = false;

          for (int i = numero; i <= numero; i++) {
            for (int j = 2; j < numero; j++) {
              if (i % j == 0) {
                divisores1 += j;
              }
            }
          }
          for (int i = numero2; i <= numero2; i++) {
            for (int j = 2; j < numero2; j++) {
              if (i % j == 0) {
                divisores2 += j;
              }
            }
          }
          divisores1 += 1; // Sumo 1
          divisores2 += 1; // Sumo 1
          if (divisores1 == divisores2) {
            numerosAmigos = true;
            System.out.println("¿Los números " + numero + " y " + numero2 + " son números amigos?");
            System.out.println(numerosAmigos);
          } else {
            numerosAmigos = false; // No hace falta porque la inicializo a false
            System.out.println("¿Los números " + numero + " y " + numero2 + " son números amigos?");
            System.out.println(numerosAmigos);
          }

          break;

        case 8: // PRIMO

          System.out.println("Introduzca un valor númerico entero positivo: ");
          numero = Integer.parseInt(System.console().readLine());
          boolean esPrimo = false;

          for (int i = numero; i <= numero; i++) {
            for (int j = 2; j < numero; j++) {
              if (i % j != 0) {
                esPrimo = false;
              } else
                esPrimo = true;
            }
          }
          System.out.println(esPrimo);
          break;

        case 9: //N PRIMEROS PRIMOS
          ///////////////////////////////
          break;
        
          case 10: //FACTORIAL
          System.out.println("Introduzca un número positivo para calcular su factorial: ");
          numero = Integer.parseInt(System.console().readLine());
          int calculoFactorial = 1;
          System.out.println();
          for (int i = 1; i <= numero; i++) {
            calculoFactorial *= i;
            // System.out.println(i + " ! " + calculoFactorial);   //Prueba de que funciona
          }
          System.out.println("CALCULO FACTORIAL");
          System.out.println(numero + "!  = " + calculoFactorial);

          break;

        case 11: //SALIR
          salir = true;
          System.out.println("CERRANDO PROGRAMA.");
          break;

        default:
          System.out.println("Número incorrecto, intentelo de nuevo.");
          break;
      }
    } while (!salir);
    System.out.println("ADIOS Y GRACIAS");
    
  }
}
