public class T05COP {
  public static void main(String[] args) {

    System.out.print("Introduzca un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    int sumaNumeros = 0;

    System.out.print("Los divisores propios de " + numero + " son: ");
    for (int i = numero; i <= numero; i++) {
      for (int j = 2; j < numero; j++) {
        if (i % j == 0) {
          System.out.print(j + " ");
          sumaNumeros += j;
        }
      }
      System.out.println();
    }
    System.out.println("Suma de los divisores propios: " + (sumaNumeros + 1));
    if ((sumaNumeros + 1) == numero) {
      System.out.println("El número es perfecto.");
    } else {
      System.out.println("No es un número perfecto.");
    }

  }
}
