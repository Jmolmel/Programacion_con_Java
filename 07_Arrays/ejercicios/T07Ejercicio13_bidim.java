public class T07Ejercicio13_bidim {
    public static void main(String[] args) {
        String[] pais = { "España", "Rusia", "Japon", "Australia" };
        int[][] estatura = new int[4][10];
        // Genero numeros
        for (int i = 0; i < estatura.length; i++) {
            for (int j = 0; j < estatura[i].length; j++) {
                estatura[i][j] = ((int) (Math.random() * 71 + 140));
            }
        }
        System.out.printf("%67s \n", "MED  MIN  MAX");
        // Comprobar min y max
        for (int i = 0; i < estatura.length; i++) {
            int minimo = Integer.MAX_VALUE;
            int maximo = Integer.MIN_VALUE;
            int media = 0;
            System.out.printf("%-12s", pais[i]);
            for (int j = 0; j < estatura[i].length; j++) {
                System.out.printf("%3d ", estatura[i][j]); // Pintar tabla
                media += estatura[i][j];
                if (estatura[i][j] > maximo) {
                    maximo = estatura[i][j];
                }
                if (estatura[i][j] < minimo) {
                    minimo = estatura[i][j];
                }
            }
            System.out.printf("| %3d ", media / estatura[i].length);
            System.out.printf("%3d ", minimo);
            System.out.printf("%3d ", maximo);
            System.out.println();
        }
    }
}
