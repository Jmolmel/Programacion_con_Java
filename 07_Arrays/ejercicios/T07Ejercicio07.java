/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 *
 * @author José Molina Meléndez
 */
public class T07Ejercicio07 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 21);
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("Introduzca en primer valor:");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca en segundo valor:");
        int num2 = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num1) {
                numeros[i] = num2;
                System.out.print("\"" + numeros[i] + "\"");
            } else {
                System.out.print(numeros[i] + "  ");
            }
        }
    }
}
