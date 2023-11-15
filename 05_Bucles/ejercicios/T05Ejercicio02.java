/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio02 {
    public static void main(String[] args) {
        int i = 0;
        int multiplos = 0;
        while (i <= 100) {
            i++;
            multiplos = i % 5;
            if (multiplos == 0){
                System.out.println(i);
            }
        }
    }
}
