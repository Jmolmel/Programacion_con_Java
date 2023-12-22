public class Manipular_Cadenas {
    public static void main(String[] args) {

        String nombre = "Jose Mol Malaga";
        System.out.println(nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras."); // .length() cuenta número de letras de
                                                                               // tu String

        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0)); // charAt averigua la letra
                                                                                    // comenzando siempre en 0

        int ultimaLetra = nombre.length(); // Estamos almacenando el total de letras (4).

        System.out.println("Y la última letra es la " + nombre.charAt(ultimaLetra - 1)); // Usamos variable anterior
                                                                                         // restandole 1

        String frase = "Hoy es un estupendo día para aprender a programar en Java";
        String frase_resumen = frase.substring(0, 28) + " irnos a la playa y olvidarnos de todo..." + " y "
                + frase.substring(29, 57);
        System.out.println(frase_resumen); // .substring(x , y) desde x hasta y.

        String alumno1 = "David";
        String alumno2 = "david";

        System.out.println(alumno1.equalsIgnoreCase(alumno2)); // equals o usar equalsIgnoreCase para comparar sin
                                                               // mayus.

    }
}
