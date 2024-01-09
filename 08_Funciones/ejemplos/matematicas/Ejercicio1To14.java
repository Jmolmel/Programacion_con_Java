package matematicas;

public class Ejercicio1To14 {
    // ********************EJ1.CAPICUA********************
    public static boolean capicua(long x) {
        long numeroVolteado = 0;
        long originalX = x;
        while (x > 0) {
            numeroVolteado = (numeroVolteado * 10) + (x % 10);
            x /= 10;
        }

        return numeroVolteado == originalX;
    }

    // ********************EJ2.ESPRIMO********************

    public static boolean primo(long x) {
        boolean esPrimo = true;
        for (int i = 2; i < x; i++) {

            if (x % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    // ********************EJ3.SIGUIENTEPRIMO********************
    public static int nextPrimo(int x) {

        do {
            x++;
        } while (!Ejercicio1To14.primo(x));
        return x;
    }

    // ********************EJ4.POTENCIA********************
    public static double potencia(double x, double y) {
        return Math.pow(x, y);
    }

    // ********************EJ5.DIGITOS********************
    public static int digitos(long x) {
        int contador = 0;
        while (x > 0) {
            Ejercicio1To14.voltea(x);
            contador++;
            x /= 10;
        }
        return contador;
    }

    // ********************EJ.6VOLTEA********************
    public static long voltea(long x) {
        long numeroVolteado = 0;
        while (x > 0) {
            numeroVolteado = (numeroVolteado * 10) + (x % 10);
            x /= 10;
        }
        return numeroVolteado;
    }

    // ********************EJ7.DIGITOS********************
    public static int digitoN(long x, int y) {
        int digito = 0;
        long numeroVolteado = Ejercicio1To14.voltea(x); // Ahorramos voltear el número con la funcion

        for (int i = 0; i < y; i++) { // i valiendo 0 hasta el valor de y
            digito = (int) numeroVolteado % 10;
            numeroVolteado /= 10;
        }
        return digito;
    }

    // ********************EJ8.posicionDeDigito********************
    public static int posicionDeDigito(long x, int y) {
        int digito = digitoN(x, y);
        if (digito == y) {
            return y;
        } else {
            return -1;
        }
    }

    // ********************EJ9.quitaPorDetras********************
    public static long quitaPorDetras(long x, int y) {

        for (int i = 0; i < y; i++) {
            x /= 10;
        }
        return x;
    }

    // ********************EJ10.quitaPorDelante********************
    public static long quitaPorDelante(long x, int y) {
        long copiaNumero = Ejercicio1To14.voltea(x);
        for (int i = 0; i < y; i++) {
            copiaNumero /= 10;
        }
        return Ejercicio1To14.voltea(copiaNumero);
    }

    // ********************EJ11.pegaPorDetras********************
    public static long pegaPorDelante(long x, int y) {
        return (x * 10) + y;
    }

    // ********************EJ12.pegaPorDelante********************
    public static long pegaPorDetras(long x, int y) {

        long copiaNumero = Ejercicio1To14.pegaPorDelante(Ejercicio1To14.voltea(x), y);
        return Ejercicio1To14.voltea(copiaNumero);
    }

    // ********************EJ13.trozoDeNumero********************

    public static long trozoDeNumero(long x, int y, int z) {
        long numeroCompleto = x;
        numeroCompleto = quitaPorDelante(numeroCompleto, y);
        numeroCompleto = quitaPorDetras(numeroCompleto, z);
        return numeroCompleto;
    }

    // ********************EJ14.juntaNumeros********************
    public static long juntaNumeros(long x, long y) {
        long digitos = y;
        while (digitos > 0) {
            x *= 10;
            digitos /= 10;
        }
        return x + y;
    }
}