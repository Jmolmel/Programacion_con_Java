package matematicas;

public class FuncionesArrays {
    public static int[] minimosMaximos(int[] numeros) {
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return new int[] { maximo, minimo };
    }
}
