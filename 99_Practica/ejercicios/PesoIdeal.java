import java.util.Scanner;

import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String genero = "";
        do {
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
        } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));

        System.out.print("Introduzca su altura en cm: ");
        int altura = sc.nextInt();

        int pesoIdeal = 0;

        if (genero.equalsIgnoreCase("H")) {
            pesoIdeal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = altura - 120;
        }
        System.out.println("Tu peso ideal es " + pesoIdeal + " kg");
    }
}
