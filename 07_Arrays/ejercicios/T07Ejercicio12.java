public class T07Ejercicio12 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int auxInicial = 0;

        System.out.print("Introduzca 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        // Mostrar contenido del array junto al índice
        System.out.print("índice: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.print("Valor:  ");
        for (int j = 0; j < numeros.length; j++) {
            System.out.printf("%3d", numeros[j]);
        }

        // Pedir posiciones inicial y final
        System.out.println("\nIntroduzca posicion inicial: ");
        int posicionInicial = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca posicion final: ");
        int posicionFinal = Integer.parseInt(System.console().readLine());

        // Verificar condiciones y realizar la rotación
        if ((posicionInicial < posicionFinal) && (posicionInicial >= 0 && posicionFinal <= 9)) {
            auxInicial = numeros[posicionInicial]; // Guardar el valor de la posición inicial

            // Rotar el resto de los números
            for (int i = posicionInicial; i < posicionFinal; i++) {
                int temp = numeros[i + 1];
                numeros[i + 1] = auxInicial;
                auxInicial = temp;
            }

            // Imprimir el array resultante
            System.out.print("\níndice: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("%3d", i);
            }
            System.out.println();
            System.out.print("Valor:  ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("%3d", numeros[i]);
            }
            System.out.println();
        } else {
            System.out.println(
                    "ERROR! La posición inicial debe ser menor que la posición final y ambos deben estar entre 0 y 9.");
        }
    }
}