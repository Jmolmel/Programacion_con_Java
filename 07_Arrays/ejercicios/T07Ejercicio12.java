public class T07Ejercicio12 {
    public static void main(String[] args) {
        int[] original = new int[10];
        int[] copia = new int[10];
        int nInicial = 0;
        int nFinal = 0;

        System.out.print("Introduzca 10 números: ");
        for (int i = 0; i < original.length; i++) {
            original[i] = Integer.parseInt(System.console().readLine());
        }

        // Mostrar contenido del array original
        System.out.println("Array original");
        System.out.print("índice: ");
        for (int i = 0; i < original.length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.print("Valor:  ");
        for (int j = 0; j < original.length; j++) {
            System.out.printf("%3d", original[j]);
        }
        boolean continuar;
        do {
            
            System.out.println("\nIntroduzca posicion inicial: ");
            nInicial = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca posicion final: ");
            nFinal = Integer.parseInt(System.console().readLine());
            continuar = true;
            if (nFinal <= nInicial) {
                System.out.println("Incorrecto. El numero inicial debe ser inferior o igual");
                continuar = false;
            }
        
            if ((nFinal < 0) || (nFinal > 9) || (nInicial < 0) || (nInicial > 9)) {
                System.out.println("ERROR. Debes introducir un numero (0-9)");
                continuar = false;
            }
        } while (!continuar);

        for (int i = 0; i < copia.length; i++) {
            copia[i] = original[i]; //copio el array
        }

        copia[nFinal] = original[nInicial];

            for (int i = nFinal + 1; i < original.length; i++) {
                copia[i] = original[i - 1];
            }

            copia[0] = original[original.length - 1];

            //Copiamos valores desde la primera posicion(original 1º -> copia 2º) del original hasta nInicial
            for (int i = 0; i < nInicial; i++) {
                copia[i + 1] = original[i];
            }

            // Imprimir el array resultante
            System.out.print("\níndice: ");
            for (int i = 0; i < copia.length; i++) {
                System.out.printf("%3d", original[i]);
            }
            System.out.println();
            System.out.print("Valor:  ");
            for (int i = 0; i < copia.length; i++) {
                System.out.printf("%3d", copia[i]);
            }
            System.out.println();
        
    }
}