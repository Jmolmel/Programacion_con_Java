public class T07Ejercicio05 {
  public static void main(String[] args) {
    int[] numeros = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    System.out.println("Introduzca 10 números");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
      if (numeros[i] > maximo) {
        maximo = numeros[i];
      }
      if (numeros[i] < minimo) {
        minimo = numeros[i];
      }
    }
    System.out.println("Tus números son: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
      if (numeros[i] == maximo) {
        System.out.print("maximo");
      }
      if (numeros[i] == minimo) {
        System.out.print("minimo");
      }
      System.out.println();
    }
  }
}
