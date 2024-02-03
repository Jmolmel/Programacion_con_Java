package Animales;

public class Mamifero extends Animal{

  //Constructor
  public Mamifero(Sexo s){
    super(s);
  }
  
  //To string(PRUEBA)
  @Override
  public String toString() {
    return super.toString() + " mamífero.";
  }
}
