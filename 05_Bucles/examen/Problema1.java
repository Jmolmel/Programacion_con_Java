public class Problema1 {
    public static void main(String[] args) {
        String apellido1;
        String apellido2;
        String nombre;
        int nota1;
        int nota2;
        int nota3;
        double notaMedia;
        int notaTotal = 0;
        int numeroVolteado = 0;

        System.out.println("Introduzca su primer apellido: ");
        apellido1 = System.console().readLine();

        System.out.println("Introduzca su segundo apellido: ");
        apellido2 = System.console().readLine();

        System.out.println("Introduzca su nombre: ");
        nombre = System.console().readLine();

        int numeroLetras = apellido1.length() + apellido2.length() + nombre.length();

        boolean salidaNotas = false;
        do {
            System.out.println("Introduzca su primera nota: ");
            nota1 = Integer.parseInt(System.console().readLine());

            System.out.println("Introduzca su segunda nota: ");
            nota2 = Integer.parseInt(System.console().readLine());

            System.out.println("Introduzca su tercera nota: ");
            nota3 = Integer.parseInt(System.console().readLine());
            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
                System.out.println("ERROR. Una de sus notas no es válida. Repítalas de nuevo.");
                salidaNotas = false;
            } else {
                salidaNotas = true;
            }
        } while (!salidaNotas);

        notaMedia = (double) (nota1 + nota2 + nota3) / 3; // NOTA MEDIA
        System.out.println(notaMedia);

        notaTotal = notaTotal * 10 + nota1;
        notaTotal = notaTotal * 10 + nota2;
        notaTotal = notaTotal * 10 + nota3;

        while (notaTotal > 0) {
            numeroVolteado = numeroVolteado * 10 + notaTotal % 10;
            notaTotal /= 10;
        }

        // MOSTRAR POR PANTALLA

        System.out.print(" ");
        for (int i = 0; i < numeroLetras + 5; i++) { // + Espacios y coma
            System.out.print("-");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ---");
        }
        for (int i = 0; i < 1; i++) {
            System.out.print(" ------");
        }
        System.out.println();

        // PARTE CENTRAL
        System.out.print("| " + apellido1 + " " + apellido2 + ", " + nombre);
        if (salidaNotas) {

        }
        for (int i = 0; i < 3; i++) {
            int digito = numeroVolteado % 10;
            if (digito >= 5) {
                System.out.printf("\033[32m%d |", digito); //////////////////////////////////
            }
        }
        System.out.print(" | " + nota1 + " | " + nota2 + " | " + nota3 + " | ");
        System.out.printf("%.2f |", notaMedia);
        System.out.println();

        System.out.print(" ");
        for (int i = 0; i < numeroLetras + 5; i++) { // + Espacios y coma
            System.out.print("-");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ---");
        }
        for (int i = 0; i < 1; i++) {
            System.out.print(" ------");
        }
        System.out.println();
    }
}
