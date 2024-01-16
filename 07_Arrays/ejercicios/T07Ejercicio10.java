public class T07Ejercicio10 {
    public static void main(String[] args) {

        int[] numero = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101);
        }

        int[] par = new int[20];
        int[] impar = new int[20];
        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                par[indicePar] = numero[i];
                indicePar++;
            } else {
                impar[indiceImpar] = numero[i];
                indiceImpar++;
            }
        }

        for (int i = 0; i < indicePar; i++) {
            System.out.print(par[i] + " ");
        }
        for (int i = 0; i < indiceImpar; i++) {
            System.out.print(impar[i] + " ");
        }
    }

}