public class Problema4 {
  public static void main(String[] args) {
    int eleccion;
    int numeroA = 0;
    int numeroB = 0;
    int contador = 0;
    int aux = 0;
    int numeroVolteado = 0;
    int sumaNumeros = 0;


    
    do {
      System.out.println("-----------------MENU----------");
      System.out.println("Opcion 0 - SALIR");
      System.out.println("Opcion 1 - Division de enteros");
      System.out.println("Opcion 2 - Longitud");
      System.out.println("Opcion 3 - Invertir");
      System.out.println("Opcion 4 - Suma de los divisores");
      System.out.println("Opcion 5 - Numeros amigos");
      System.out.println("Opcion 6 - Digitos");
      eleccion = Integer.parseInt(System.console().readLine());
      switch (eleccion) {
        case 0:
          System.out.println("ADIOS!");
          break;

        case 1:
          System.out.println("Introduzca el dividendo: ");
          numeroA = Integer.parseInt(System.console().readLine());
          System.out.println("Introduzca el divisor: ");
          numeroB = Integer.parseInt(System.console().readLine());
          int cociente;
          int resto;
          cociente = numeroA / numeroB;
          resto = numeroA % numeroB;
          System.out.println("El divisor " + numeroA + " entre el dividendo " + numeroB + " es igual a un cociente "
              + cociente + " y un resto de: " + resto);
          break;

        case 2:
          System.out.println("Introduzca un valor para saber el número de dígitos que lo componen: ");
          numeroA = Integer.parseInt(System.console().readLine());
          aux = numeroA;
          while (numeroA > 0) {
            numeroA /= 10;
            contador++;
          }
          System.out.println("Su número " + aux + " tiene " + contador + " dígitos.");
          break;

        case 3:
          System.out.println("Introduzca el número a invertir: ");
          numeroA = Integer.parseInt(System.console().readLine());
          aux = numeroA;

          while (numeroA > 0) {
            numeroVolteado = numeroVolteado * 10 + numeroA % 10;
            numeroA /= 10;
          }
          System.out.println("Su número " + aux + " invertido es " + numeroVolteado);
          break;
        case 4:
          System.out.println("Introduce un tipo de valor numero entero: ");
          numeroA = Integer.parseInt(System.console().readLine());
          for (int i = numeroA; i <= numeroA; i++) {
            for (int j = 2; j < numeroA; j++) {
              if (i % j == 0) {
                sumaNumeros += j;
              }
            }
          }
          System.out.println("La suma de sus divisores es: " + sumaNumeros);
          break;
        case 5:
          System.out.println("Introduzca el valor primero: ");
          numeroA = Integer.parseInt(System.console().readLine());
          System.out.println("Introduzca el valor segundo: ");
          numeroB = Integer.parseInt(System.console().readLine());
          System.out.println(numerosAmigos(numeroA,numeroB));
          
          break;
        default:
          break;
      }

    } while (eleccion != 0);

  }


  private static boolean numerosAmigos(int a, int b){
    boolean amigo = false;
    int sumaA = 0;
    int sumaB = 0;
    for (int i = 1; i <= a - 1; i++) {
      if (a % i == 0) {
        sumaA += i;
      }
      
    }
    for (int i = 1; i < b - 1; i++) {
      if (b % i == 0) {
        sumaB += b;
      }
    }
    if (sumaA == sumaB) {
      amigo = true;
    }
    return amigo;
  }

}
