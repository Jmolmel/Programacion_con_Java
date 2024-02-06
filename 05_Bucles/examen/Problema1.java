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
        boolean finalizarProgramama = false;
        do {
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
        System.out.print("| " + apellido1 + " " + apellido2 + ", " + nombre + " | ");
        for (int i = 0; i < 3; i++) {
            int digito = numeroVolteado % 10;
            if (digito >= 5) {
                System.out.printf("\033[32m%d\033[0m | ", digito); //////////////////////////////////
            } else {
                System.out.printf("\033[31m%d\033[0m | ", digito);
            }
            numeroVolteado /= 10;
        }
        if (notaMedia >= 5) {
            System.out.printf("\033[32m%.2f\033[0m | ", notaMedia);
        } else {
            System.out.printf("\033[31m%.2f\033[0m | ", notaMedia);
        }
        
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

        System.out.println("¿Desea continuar introduciendo notas?(si / no)");
        String continuar = System.console().readLine();
        if (continuar.equalsIgnoreCase("si")) {
            System.out.println("Usted ha solicitado probar mas notas. Cargando programa...");
        } else if (continuar.equalsIgnoreCase("no")) {
            finalizarProgramama = true;
            System.out.println("Adios!");
        } else {
            System.out.println("Datos incorrectos! Cerrando programa");
            finalizarProgramama = true;
        }
        
        } while (!finalizarProgramama);
        
    }
}
