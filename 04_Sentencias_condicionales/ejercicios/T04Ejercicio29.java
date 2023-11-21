import java.util.Scanner;

/**
 * Realiza un programa que calcule el precioComida de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comida = "";
        double precioComida = 0;
        String pitufo = "";
        String bebida = "";
        double precioComidaBebida = 0;

        System.out.print("¿Qué ha tomado para desayunar? ( palmera, donut o pitufo): ");
        comida = sc.nextLine();

        if (comida.equalsIgnoreCase("palmera")) {
            precioComida = 1.40;
        } else if (comida.equalsIgnoreCase("donut")) {
            precioComida = 1;
        }
        if (comida.equalsIgnoreCase("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? ( aceite o tortilla): ");
            pitufo = sc.nextLine();
        }
        if (pitufo.equalsIgnoreCase("aceite")) {
            precioComida = 1.20;
        }
        if (pitufo.equalsIgnoreCase("tortilla")) {
            precioComida = 1.60;
        }
        System.out.print("¿Qué ha tomado de beber? (zumo o cafe): ");
        bebida = sc.nextLine();
        if (bebida.equalsIgnoreCase("zumo")) {
            precioComidaBebida = 1.50;
        } else if (bebida.equalsIgnoreCase("cafe")) {
            precioComidaBebida = 1.20;
        }
        double total = (precioComida + precioComidaBebida);
        System.out.println(total);
    }
}
