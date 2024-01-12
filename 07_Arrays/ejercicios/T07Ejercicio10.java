public class T07Ejercicio10 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int j;

        // Inicializar y mostrar el array original
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 11);
            System.out.print(numero[i] + "  ");
        }

        // Crear un array auxiliar para almacenar los números ordenados
        int[] array2 = new int[10];

        // Ordenar el array original
        for (int i = 0; i < numero.length; i++) {
            j = i;
            while ((numero[j] % 2 != 0) && (j < 9)) {
                j++;
            }

            // Mover números pares a las primeras posiciones
            for (int k = j; k > i; k--) {
                int aux = numero[k];
                numero[k] = numero[k - 1];
                numero[k - 1] = aux;
            }
        }

        System.out.println();

        // Mostrar el array modificado
        for (int i = 0; i < array2.length; i++) {
            System.out.print(numero[i] + "  ");
        }
    }
}