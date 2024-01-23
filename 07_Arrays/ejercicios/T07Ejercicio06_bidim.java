public class T07Ejercicio06_bidim {
    public static void main(String[] args) {
        int[][] numero = new int[6][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        
        int[] numerosGenerados = new int[61];

        
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                int numAleatorio;
                boolean esRepetido;


                do {
                    numAleatorio = (int) (Math.random() * 61);
                    esRepetido = numerosGenerados[numAleatorio] == 1;
                } while (esRepetido);

                numero[i][j] = numAleatorio;
                numerosGenerados[numAleatorio] = 1; 



                
                if (numero[i][j] > maximo) {
                    maximo = numero[i][j];
                }

                if (numero[i][j] < minimo) {
                    minimo = numero[i][j];
                }

                System.out.printf("%8d", numero[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                if (numero[i][j] == maximo) {
                    System.out.println("El número MAXIMO es: " + maximo + " en la fila " + (i + 1) + " columna " + (j + 1));
                } else if (numero[i][j] == minimo) {
                    System.out.println("El número MINIMO es: " + minimo + " en la fila " + (i + 1) + " columna " + (j + 1));
                }
            }
        }
    }
}