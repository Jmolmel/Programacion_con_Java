import javax.swing.JOptionPane;

public class FactorialNumero {
    public static void main(String[] args) {

        int resultado = 1;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

        for (int i = numero; i > 0; i--) {

            resultado = resultado * i;
            System.out.println(resultado);
        }
    }
}
