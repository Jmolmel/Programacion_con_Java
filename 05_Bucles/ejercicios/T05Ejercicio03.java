/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio03 {
    public static void main(String[] args) {
        int i = 0;
        int multiplos = 0;
        do {
            multiplos = i % 5;
            if(multiplos == 0)
            System.out.println(i);
            i++;
        } while (i <= 100);
    }
}
