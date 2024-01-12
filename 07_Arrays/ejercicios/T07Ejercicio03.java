public class T07Ejercicio03 {
    public static void main(String[] args) {
        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduzca 10 numeros: ");
            numero[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.print(numero[i] + " ");
        }
    }
}
