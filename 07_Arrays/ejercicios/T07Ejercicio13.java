public class T07Ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int remarcar;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 401 + 100);
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("¿Quiére remarcar el máximo(1) o minimo(2)");
        remarcar = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if ((remarcar == 1) && (numeros[i] == maximo)) {
                System.out.print("**" + numeros[i] + "**");
            }
            if ((remarcar == 2) && (numeros[i] == minimo)) {
                System.out.print("**" + numeros[i] + "**");
            }
        }
    }
}
