public class T07Ejercicio13 {
    public static void main(String[] args) {

        int[] numeros = new int[100];

        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        int opcion = 0;

        //Generar numeros aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 501);
        }
        //Mostrar array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        


        //Comprobar max y min del array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }


        System.out.println("\n\nQue opcion desea. 1-maximo | 2-minimo\n");
        opcion = Integer.parseInt(System.console().readLine());

        //Mostrar array completo marcando maximo o minimo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if (opcion == 1 && numeros[i] == maximo) {
                System.out.print("*** "+ maximo + " ***");
            }
            if (opcion == 2 && numeros[i] == minimo) {
                System.out.print("*** "+ minimo + " ***");
            }
        }
    }
}
