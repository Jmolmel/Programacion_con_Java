import java.util.Scanner;
import matematicas.FuncionesArrays;

public class PruebaFuncionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];

        System.out.print("Tus números son: ");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
        }

        int[] resultado = FuncionesArrays.minimosMaximos(numero);
        int maximo = resultado[0];
        int minimo = resultado[1];

        System.out.print("Haz introducido : ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
    }
}
