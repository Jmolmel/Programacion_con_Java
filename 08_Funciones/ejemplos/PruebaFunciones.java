import java.lang.foreign.FunctionDescriptor;
import java.util.Scanner;

import matematicas.Area;
import matematicas.FuncionExtra;
import matematicas.Varias;
import matematicas.Volumen;

public class PruebaFunciones {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int n;

    // // Probamos la función esPrimo(), alojada en la clase Varias dentro del
    // paquete
    // // matemáticas

    // System.out.println("Introduzca en número");
    // n = sc.nextInt();

    // if (Varias.esPrimo(n)) {
    // System.out.println("Su número es primo");
    // } else {
    // System.out.println("Su número no es primo");
    // }

    // System.out.println("Introduzca un dígito: ");
    // n = sc.nextInt();
    // System.out.println();
    // int numDigitos = Varias.digitos(n);
    // System.out.println(n + " tiene " + numDigitos + " digitos.");

    // double r;
    // double h;
    // System.out.print("Introduzca el radio: ");
    // r = sc.nextDouble();

    // System.out.print("Introduzca la altura: ");
    // h = sc.nextDouble();

    // System.out.println("El volumen del cilindro es " + Volumen.volumenCilindro(r,
    // h));

    // System.out.println("Introduzca base de su rombo: ");
    // double baseRombo = sc.nextDouble();

    // System.out.println("Introduzca altura de su rombo: ");
    // double alturaRombo = sc.nextDouble();

    // // Rombo
    // System.out.println("El área de su rombo es: " +
    // Area.calcularAreaRombo(baseRombo, alturaRombo));

    // DIGITON

    System.out.println("Introduzca un número: ");
    int n = sc.nextInt();

    System.out.println("Serie de Fibonacci hasta el término " + n + ": " + FuncionExtra.encuentraFibonacci(n));
    System.err.println(Double.MAX_VALUE);
  }
}
