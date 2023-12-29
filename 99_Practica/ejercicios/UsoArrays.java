public class UsoArrays {
    public static void main(String[] args) {

        int[] mi_matriz = new int[5]; // También -> int[] mi_matriz = new int[5, 38, -15, 92, 71]; EMPIEZAN POR 0 al
                                      // numerarse

        mi_matriz[0] = 5;
        mi_matriz[1] = 38;
        mi_matriz[2] = -15;
        mi_matriz[3] = 92;
        mi_matriz[4] = 71;

        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
        }
    }
}
