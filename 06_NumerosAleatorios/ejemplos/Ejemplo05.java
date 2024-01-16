public class Ejemplo05 {
  public static void main(String[] args) {
        int numero;
        for (int i = 0; i < 10; i++) {
          numero = (int)(Math.random() * 21) + 50;   // Genera números entre [50,71]   Hay que multiplicar la diferencia de números entre
                                                     // uno y otros. y sumar desde el mínimo.
          System.out.println(numero);
        }
        
  }
}
