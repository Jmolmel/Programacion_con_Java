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
   * 
   * @param x un número de tipo long
   * @return long long el número volteado
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

  public static void prueba() {

  }

  public static int voltea(int x) {
    return (int) voltea((long) x);
  }

  // comprobar capicuo en 2 lineas ------->
  public static boolean esCapicua(long x) {
    return x == voltea(x);
    // x = 7531
    // voltea(x) --> 1357
    // x == voltea(x)
    // 7531 == 1357 --> false
    // return false
  }

  public static boolean esCapicua(int x) {
    return x == voltea((long) x);
  }

  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) { // ++ antes de la x se llama "preincremento"
    }
    return x;
    // otra opcion
    //
    // do {
    // x++;
    // } while (!esPrimo(x));
    // return x;
  }

  public static int potencia(int x, int y) {
    return (int) Math.pow(x, y);
  }

  public static long cuentaDigitos(long x) {
    int contador = 0;
    while (x > 0) {
      x /= 10;
      contador++;
    }
    return contador;
  }

  public static int digitoN(long x, int y) {

    long numVolteado = 0;
    int ultimoDigito = 0;
    long numRestaurado = 0;

    while (x > 0) {
      ultimoDigito = (int) x % 10;
      numVolteado = numVolteado * 10 + ultimoDigito;
      x /= 10;
    }

    for (int i = 0; i < y; i++) {
      ultimoDigito = (int) numVolteado % 10;
      numRestaurado = numRestaurado * 10 + ultimoDigito;
      numVolteado /= 10;
    }
    return ultimoDigito;
  }

  public static int posicionDeDigito(long numEntero, int digito) {
    long numeroDigitos = cuentaDigitos(numEntero);
    long numVolteado = voltea(numEntero);
    int ultimoDigito = 0;

    for (int i = 1; i <= numeroDigitos; i++) {
      ultimoDigito = (int) numVolteado % 10;

      if (ultimoDigito == digito) {
        return i;
      }
      numVolteado /= 10;
    }
    return -1;
  }

  public static long quitaPorDetras(long numeroEntero, int quitaDigitos) {

    for (int i = 0; i < quitaDigitos; i++) {
      numeroEntero /= 10;
    }
    return numeroEntero;
  }

  public static long quitaPorDelante(long x, int y) {

    long numeroVolteado = voltea(x);
    long numeroRecortado = quitaPorDetras(numeroVolteado, y);
    return numeroRecortado;
  }

  public static long pegaPorDetras(long num1, long num2) { // no funcionan
    return juntaNumerosDer(num1, num2);
  }

  public static long pegaPorDelante(long num1, long num2) {
    return juntaNumerosIzq(num1, num2);
  }

  public static long trozoDeNumero(long num, int x, int y) {
    long numRecortado = quitaPorDelante(num, x);
    long trozo = quitaPorDetras(numRecortado, y);
    return trozo;
  }

  public static long juntaNumerosDer(long num1, long num2) {

    return pegaPorDetras(num1, num2);
  }

  public static long juntaNumerosIzq(long num1, long num2) {

    return pegaPorDelante(num1, num2);
  }
}