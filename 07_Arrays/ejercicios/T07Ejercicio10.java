public class T07Ejercicio10 {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ((int) (Math.random() * 101));
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par[contadorPar] = numeros[i];
                contadorPar++;
            } else {
                impar[contadorImpar] = numeros[i];
                contadorImpar++;
            }
        }

        for (int i = 0; i < contadorPar; i++) {
            System.out.print(par[i] + " ");
        }

        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(impar[i] + " ");
        }
    }
}