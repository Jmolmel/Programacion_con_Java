public class Problema3 {
  public static void main(String[] args) {
    int numero;
    int sumaNumeros = 0 ;
    System.out.println("Introduzca un número entero positivo");
    numero = Integer.parseInt(System.console().readLine());

    System.out.print("Los divisores de " + numero + " son: ");

    for (int i = numero; i <= numero; i++) {
      for (int j = 2; j < numero; j++) {
        if (i % j == 0) {
          System.out.print(j + ", ");
          sumaNumeros += j;
        }
      }
    }

    sumaNumeros++;
    System.out.println();
    System.out.println("Suma de los divisores propios y el 1: " + sumaNumeros);
    if (sumaNumeros == numero) {
      System.out.println("Es un número perfecto");
    } else {
      System.out.println("No es un número perfecto");
    }
  }
}
