public class T07Ejercicio06_bidim {
    public static void main(String[] args) {
        int[][] numero = new int[6][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        boolean esRepetido = true;
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {

                do {
                    numero[i][j] = (int) (Math.random() * 1001);
                    for (int j2 = 0; j2 < numero.length; j2++) {
                        for (int k = 0; k < numero[j2].length; k++) {
                            if (numero[i][j] == numero[j2][k]) {
                                esRepetido = true;
                            }
                        }
                    }
                    esRepetido = false;
                } while (!esRepetido(numero, i, j));

                if (numero[i][j] > maximo) {
                    maximo = numero[i][j];
                } else if (numero[i][j] < minimo) {
                    minimo = numero[i][j];
                }
                System.out.printf("%8d", numero[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                if (numero[i][j] == maximo) {
                    System.out.println(
                            "El número MAXIMO es: " + numero[i][j] + " en la fila " + (i + 1) + " columna " + (j + 1));
                } else if (numero[i][j] == minimo) {
                    System.out.println(
                            "El número MINIMO es: " + numero[i][j] + " en la fila " + (i + 1) + " columna " + (j + 1));
                }
            }
        }
    }

    public static boolean esRepetido(int[][] numero, int fila, int columna) {
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                if (numero[fila][columna] == numero[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}