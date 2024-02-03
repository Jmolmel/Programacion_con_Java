package Animales;

public class Canario extends Ave{

  //Atributos
  String color;

  //Constructores
  public Canario(Sexo s, String r, String color) {
    super(s, r);
    this.color = color;
  }

  public Canario(String r, String color) {
    super(r);
    this.color = color;
  }

  public String getColor() {
    return color;
  }
  
  //Metodos
  @Override
  public String toString() {
    return super.toString() + " mi color es : " + this.color;
  }


  
}
