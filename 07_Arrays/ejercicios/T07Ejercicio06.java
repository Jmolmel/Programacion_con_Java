public class T07Ejercicio06 {
  public static void main(String[] args) {
    int[] numeros = new int[15];
    System.out.println("Introduzca los números enteros:");

    // Escritura del array
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    // Salida por pantalla del array con un foreach original
    for (int i : numeros) {
      System.out.printf("%3d", i);
    }
    System.out.println();
    // Rotamos
    int aux = numeros[14]; // RESTAMOS una porque va de 0 a 14

    for (int i = numeros.length - 1; i > 0; i--) { // Restamos 1 porque el ultimo número lo guardamos en aux
      numeros[i] = numeros[i - 1];
    }
    numeros[0] = aux;
    // Salida por pantalla del array rotado
    System.out.println();
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%3d", numeros[i]);
    }
  }
}