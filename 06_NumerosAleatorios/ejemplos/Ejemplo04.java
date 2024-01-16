public class Ejemplo04 {
  public static void main(String[] args) {
        int numero;
        for (int i = 0; i < 10; i++) {
          numero = (int) (Math.random() * 10) + 1;  // Numeros entre [1,11]
          System.out.println(numero);
        }
  }
}
