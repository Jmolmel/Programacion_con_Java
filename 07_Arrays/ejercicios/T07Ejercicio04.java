public class T07Ejercicio04 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < cubo.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
            cuadrado[i] = (int) (Math.random() * 101);
            cubo[i] = (int) (Math.random() * 101);
        }

        System.out.println("Números   Cuadrados  Cubos");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%7d ", numeros[i]);
            System.out.printf("%7d", cuadrado[i]);
            System.out.printf("%7d", cubo[i]);
            System.out.println();
        }
    }
}
