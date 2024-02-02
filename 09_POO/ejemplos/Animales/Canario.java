package Animales;

public class Canario extends Ave{

  //Atributos
  String color;

  public Canario(Sexo s, String color) {
    super(s);
    this.color = color;
  }

  public Canario(String color) {
    super(Sexo.HEMBRA);
    this.color = color;
  }

  
}
