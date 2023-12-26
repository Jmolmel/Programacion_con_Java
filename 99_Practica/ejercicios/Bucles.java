import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String clave = "Juan";
        String pass = "";

        while (clave.equals(pass) == false) {
            pass = JOptionPane.showInputDialog("Introduce la contraseña"); // Añade una ventana externa para introducir
                                                                           // datos.

            if (clave.equals(pass) == false) {
                System.out.println("Contraseña incorrecta.");
            }
        }
        System.out.println("Contraseña correcta.");
    }
}
