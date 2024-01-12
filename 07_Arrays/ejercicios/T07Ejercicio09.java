public class T07Ejercicio09 {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca los 8 números: ");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " par");
            } else {
                System.out.println(numeros[i] + " impar");
            }
        }
    }
}
