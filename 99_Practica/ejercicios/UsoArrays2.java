import javax.swing.JOptionPane;

public class UsoArrays2 {
    public static void main(String[] args) {

        /*
         * 
         * 
         * paises[0] = "España";
         * paises[1] = "México";
         * paises[2] = "Colombia";
         * paises[3] = "Perú";
         * paises[4] = "Chile";
         * paises[5] = "Argentina";
         * paises[6] = "Ecuador";
         * paises[7] = "Venezuela";
         * 
         * // for (int i = 0; i < paises.length; i++) {
         * 
         * // System.out.println("País " + (i + 1) + " " + paises[i]);
         * // }
         * 
         * for (String elemento : paises) {
         * 
         * System.out.println("País: " + elemento);
         * } /*
         * 
         * 
         * String[] paises = new String[8];
         * 
         * for (int i = 0; i < paises.length; i++) {
         * 
         * paises[i] = JOptionPane.showInputDialog("Introduce país " + (i + 1)); //
         * acumula lo escrito en la matríz
         * }
         * 
         * for (String elemento : paises) {
         * 
         * System.out.println("País: " + elemento);
         * }
         */

        int[] matriz_aleatorios = new int[150];

        for (int i = 0; i < matriz_aleatorios.length; i++) {

            matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);

        }
        for (int numeros : matriz_aleatorios) {
            System.out.print(numeros + " ");
        }
    }
}
