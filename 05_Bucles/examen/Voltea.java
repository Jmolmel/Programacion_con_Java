public class Voltea {
  public static void main(String[] args) {
    System.out.println("Introduzca numero para voltearlo");
    int numero = Integer.parseInt(System.console().readLine());
    int numeroVolteado = 0;

    while (numero > 0 ) {
      numeroVolteado = numeroVolteado * 10 + numero % 10;
      numero /= 10;
    }
    System.out.println(numeroVolteado);

    
  }
}
