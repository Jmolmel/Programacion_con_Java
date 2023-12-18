package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author José Molina Meléndez
 */
public class Varias {


  public static boolean esPrimo(int x) {
    if (x <= 1) {
      return false;
    }
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }


  public static int digitos(int x) {
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }


  
  /** 
   * Voltea un número introducido por teclado
   * @param x  un número de tipo long
   * @return long  long el número volteado
   */
  public static long voltea(long x) {
    if (x < 0) {
      return voltea(-x);
    }
    long xVolteado = 0;
    while (x > 0) {
      xVolteado = (xVolteado * 10) + (x % 10);
      x /= 10;
    }
    return xVolteado;
  }

  public static void prueba(){

  }


  public static int voltea(int x){
    return (int) voltea((long) x);
  }

  //comprobar capicuo en 2 lineas ------->
  public static boolean esCapicua(long x){
    return x == voltea(x);
    // x = 7531
    // voltea(x) --> 1357
    // x == voltea(x)
    // 7531 == 1357 --> false
    // return false
  }
  public static boolean esCapicua(int x){
    return x == voltea((long) x);
  }

  public static int siguientePrimo(int x){
    while (!esPrimo(++x)) {              //++ antes de la x se llama "preincremento"
    }
    return x;
    //otra opcion 
    //
    // do {
    //   x++;
    // } while (!esPrimo(x));
    // return x;
  }
  public static int potencia(int x, int y){
    return (int)Math.pow(x, y);
  }

  public static int cuentaNumeros(int x) {
    int contador = 0;
    while (x > 0) {
      x /= 10;
      contador++;
    }
    return contador;
  }

  public static int digitoN(int x, int y) {
    int contador = 0;
    
    while (x > 0) {
        if (contador == y) {
            return x % 10; // Devuelve el dígito en la posición deseada
        }
        x /= 10; // Elimina el último dígito
        contador++;
    }
    
    // Si la posición está fuera del rango, devuelve -1 o maneja según tu lógica
    return -1;
}

}