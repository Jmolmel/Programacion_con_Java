package Animales;

public class Gato extends Mamifero {

  //Atributos
  private String raza;

  //Constructores
  public Gato (Sexo s, String r) {
    super(s);
    raza = r;
    }

  public Gato(Sexo s){
    super(s);
    raza = "siamés";
  }

  public Gato(String r){
    super(Sexo.HEMBRA);
    raza = r;
  }

  public Gato(){
    super(Sexo.HEMBRA);
    raza = "siamés";
  }

  //Metodos
  public void maulla(){
    System.out.println("Miauuuuu");
  }

  public void ronronea(){
    System.out.println("Rrrrrrrrrr");
  }

  public void come(String comida){
    if (comida.equals("pescado")) {
      System.out.println("MMMMMMMmmmmmMMMMM");
    } else {
      System.out.println("Lo siento soy un gato y solo como pescado.");
    }
  }

  public void peleaCon(Gato contrincante) {
    if (this.getSexo() == Sexo.HEMBRA){
      System.out.println("No me gusta pelear");
    } else {
      if (contrincante.getSexo() == Sexo.HEMBRA) {
        System.out.println("No peleo con gatitas");
      } else {
        System.out.println("Ven aquí que te vas a enterar");
      }
    }
  }


  public String toString(){
    return super.toString() + "Raza: " + this.raza + "\n*************************\n";
  }
}
