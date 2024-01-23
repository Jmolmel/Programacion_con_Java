public class T07Ejercicio12_bidim {
    public static void main(String[] args) {
        int[][] numeros = new int[9][9];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        long media = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 401 + 500);
                if (numeros[i][j] > maximo) {
                    maximo = numeros[i][j];
                }
                if (numeros[i][j] < minimo) {
                    minimo = numeros[i][j];
                }
            }
        }
        System.out.println("Matriz completa:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[8 - i][i];
            System.out.print(numero + " ");
            media += numero;

        }
        System.out.println();
        System.out.println("Numero maximo:" + maximo);
        System.out.println("Numero minimo:" + minimo);
        System.out.println("Media:" + (media / numeros.length));
    }
}
