package Animales;

public abstract class Animal {
  private Sexo sexo;

  public enum Sexo {              //Mediante un tipo enumerado el atributo solo podra tener 3 valores posibles(o los que quieras)
    MACHO , HEMBRA, HERMAFROTIDA  // Definidos siempre en MAYUS
  }

  public Animal(){
    this.sexo = Sexo.MACHO;
  }

  public Animal(Sexo s){
    this.sexo = s;
  }

  public Sexo getSexo() {
    return sexo;
  }

  public String toString(){
    return "Sexo: " + this.sexo + "\n";
  }

  public void duerme(){
    System.out.println("Zzzzzzzz");
  }
}
