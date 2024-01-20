public class PruebaGato {
  public static void main(String[] args) {

    // Gato garfield = new Gato("Garfield");
    // System.out.println(garfield.nombre);
    // Gato botas = new Gato("Botas", "Negro", "Egipcio", "Macho", 5, 4.2);
    // botas.edad = 120;
    // System.out.println(botas.edad);

    // Gato colega = new Gato("Colega");
    // System.out.println(colega.nombre + " " + colega.raza);
    // Gato colega = new Gato();
    // colega.sexo = "Macho";
    // Gato missy = new Gato();
    // missy.sexo = "Hembra";

    // garfield.come("Pescador"); //Se añade el string de la clase Gato
    // garfield.maulla();
    // garfield.ronronea();
    // garfield.peleaCon(colega);
    // colega.peleaCon(missy);

    System.out.print("¿Cuántos gatos quieres crear?: ");
    int num = Integer.parseInt(System.console().readLine());

    String[] nombres = { "Garfield", "Botas", "Willy", "Pancho", "Misifú" };
    String[] color = { "Marrón", "Negro", "Pardo" };
    Gato[] gaticos = new Gato[num];

    for (int i = 0; i < num; i++) {

      int nombreAleatorio = (int) (Math.random() * 5);
      int colorAleatorio = (int) (Math.random() * 3);
      System.out.print("¿Qúe raza quiere elegir?: ");
      String razaGato = (System.console().readLine());
      gaticos[i] = new Gato(nombres[nombreAleatorio], color[colorAleatorio], razaGato, "MACHOS", 0, 0.0);
    }

    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].color);
    }
  }
}