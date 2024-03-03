public class T07Ejercicio09 {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca número: ");
            int numeroIntroducido = Integer.parseInt(System.console().readLine());
            numeros[i] = numeroIntroducido;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " par");
            }
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i] + " impar");
            }
        }

    }
}
