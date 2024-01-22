public class T07Ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int indicePrimos = 0;
        int indiceNoPrimos = 0;

        System.out.println("Introduzca 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Indice:  0   1   2   3   4   5   6   7   8   9");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < numeros.length; j++) {
                if (numeros[i] % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[indicePrimos] = numeros[i];
                indicePrimos++;
            } else {
                noPrimos[indiceNoPrimos] = numeros[i];
                indiceNoPrimos++;
            }
        }

        for (int i = 0; i < indicePrimos; i++) {
            System.out.print(primos[i] + " ");
        }
        for (int i = 0; i < indiceNoPrimos; i++) {
            System.out.print(noPrimos[i] + " ");
        }
    }
}
