public class T07Ejercicio13_bidim {
    public static void main(String[] args) {
        String[] pais = { "España", "Rusia", "Japon", "Australia" };
        int[][] estatura = new int[4][10];
        int media = 0;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < estatura.length; i++) {
            for (int j = 0; j < estatura[i].length; j++) {
                estatura[i][j] = (int) (Math.random() * 70 + 140);
            }
        }
        System.out.printf("%78s \n", "MED  MIN  MAX");
        for (int i = 0; i < estatura.length; i++) {
            System.out.printf("%-12s", pais[i]);
            for (int j = 0; j < estatura[i].length; j++) {
                System.out.printf("%5d", estatura[i][j]);
                if (estatura[i][j] < minimo) {
                    minimo = estatura[i][j];
                }
                if (estatura[i][j] > maximo) {
                    maximo = estatura[i][j];
                }
                media += estatura[i][j];
            }
            media = media / 10;
            System.out.printf("|");
            System.out.printf("%5d", media);
            System.out.printf("%5d", minimo);
            System.out.printf("%5d", maximo);
            System.out.println();
            minimo = Integer.MAX_VALUE;
            maximo = Integer.MIN_VALUE;
        }
    }
}
