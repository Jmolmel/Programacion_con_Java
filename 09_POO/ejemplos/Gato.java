public class Gato {

  // ATRIBUTOS
  String nombre;
  String color;
  String raza;
  String sexo;
  int edad;
  double peso;

  // CONSTRUCTORES
  Gato(String nombre) {
    this.nombre = nombre; // Puedes definirlo desde aqui
    this.color = "Azul";
    this.raza = "Romano";
  }

  Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
    this.edad = edad;
    this.peso = peso;
  }

  // METODOS

  void maulla() {
    System.out.println("MIAUUUUUUUUUUUUUU!");
  }

  void ronronea() {
    System.out.println("RRRRRRRRRRRRRRRRRRRRRR");
  }

  void come(String comida) {
    if (comida.equalsIgnoreCase("Pescado")) {
      System.out.println("ÑAM ÑAM!");
    } else {
      System.out.println("SOY UN GATO Y SOLO COMO PESCADO");
    }
  }

  void peleaCon(Gato contrincante) {
    if (this.sexo.equals(contrincante.sexo) && (this.sexo.equals("Macho"))) {
      System.out.println("Pelea");
    } else {
      System.out.println("No me gusta pelear");
    }
  }

}