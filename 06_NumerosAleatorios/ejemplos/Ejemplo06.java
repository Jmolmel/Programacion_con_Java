public class Ejemplo06 {
  public static void main(String[] args) {
    int numero;
    for (int i = 0; i < 10; i++) {
      numero = (int) (Math.random() * 21) - 5;      //Desde [-5,16]
      System.out.println(numero);
    }
  }
}