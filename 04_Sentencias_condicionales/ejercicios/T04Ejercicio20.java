/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio20 {
  public static void main(String[] args) {
    int n;
    boolean capicua = false;

    // 1 cifra : (n/1000)
    // 2 cifras: (n / 100) % 10
    // 3 cifras: (n / 10) % 10
    // 4 cifras: (n / 1) % 10 <---> (n % 10)
    System.out.print("Introduce un número de 5 cifras como máximo para comprobar si es capicúo: ");
    n = Integer.parseInt(System.console().readLine());

    //numeros de 1 cifra
    if (n < 10) {
      capicua = true;
    }
    //numero de 2 cifras
    if ((n >= 10 ) && (n < 100)) {
    }
      if ((n/10) == ( n % 10)) {
        capicua = true;
    }
      //numero de 3 cifras
    if ((n > 100 ) && (n < 1000)) {
      if ((n/100) == ( n % 10)) {
        capicua = true;
    }
      //numero de 4 cifras
    if ((n >= 1000 ) && (n < 10000)) {
      if (((n/1000) == ( n % 10))  && ((n / 100) % 10) == ((n / 100) / 10)) {
        capicua = true;
    }
    if ((n >= 10000 ) && (n < 100000)) {
      if (((n/10000) == ( n % 10))  && ((n / 1000) % 10) == ((n / 1000) / 10)) {
        capicua = true;
    }

  }
  if (capicua) {
    System.out.println("El número " + n + " es capicúa");
  } else {
    System.out.println("El número " + n + " no es capicúo");
  }
  
}
}
  }
}

