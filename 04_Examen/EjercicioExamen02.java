import java.util.Scanner;

public class EjercicioExamen02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double primerOperando;
    double segundoOperando;
    int codigoOperacion = 0;
    double total = 0;

    System.out.print("Escribe el primer operando:");
    primerOperando = sc.nextDouble();   
    System.out.print("Escribe el segundo operando: ");
    segundoOperando = sc.nextDouble();


    System.out.print("Introduzca código de operacion (1.+ 2.- 3.* 4./ 5.^ 6.%)");
    codigoOperacion = sc.nextInt();

    switch (codigoOperacion) {
      case 1:
        total = primerOperando + segundoOperando;
        break;
      case 2:
        total = primerOperando - segundoOperando;
        break;
      case 3:
        total = primerOperando * segundoOperando;
        break;
      case 4:
        total = primerOperando / segundoOperando;
        break;
      case 5:
        total = Math.pow(primerOperando, segundoOperando);
        break;
      case 6:
        total = primerOperando % segundoOperando;
        break;

      default:

        break;
    }

    System.out.printf(" %8.2f", total);

  }
  
}
