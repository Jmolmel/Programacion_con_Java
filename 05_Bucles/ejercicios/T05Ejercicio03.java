/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio03 {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            int cuenta = i % 5 == 0;
        } while (i <= 100);
    }

}
