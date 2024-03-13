import java.util.ArrayList;

public class EjemploArrayListClaseGato {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();

        g.add(new Gato("Garfield", "Naranaja", "Mestizo"));
        g.add(new Gato("Pepe", "Gris", "Angora"));
        g.add(new Gato("Mauri", "Blanco", "Manx"));
        g.add(new Gato("Ulises", "Marrón", "Persa"));

        System.out.println("Datos de los gatos\n");

        for (Gato gatoAux : g) {
            System.out.println(gatoAux + " \n");
        }

    }
}
