package Animales;

public abstract class Animal {
  //Atributo tipo enum creado en otra clase aparte
  private Sexo sexo;

  //public enum Sexo {              //Mediante un tipo enumerado el atributo solo podra tener 3 valores posibles(o los que quieras)
  // MACHO , HEMBRA, HERMAFROTIDA  // Definidos siempre en MAYUS
  //}                               //Esta definido FUERA EN UN ENUM

  //Constructor
  public Animal(){
    this.sexo = Sexo.MACHO;
  }

  public Animal(Sexo s){
    this.sexo = s;
  }

  //Getter de sexo
  public Sexo getSexo() {
    return sexo;
  }

  //Métodos
  public void duerme(){
    System.out.println("Zzzzzzzz");
  }

  public void come(){
    System.out.println("Estoy comiendo, no me molestes");
  }

  public void camina(){
    System.out.println("Estoy caminando");
  }

  public void salta(){
    System.out.println("Boinggggggg");
  }

  public String toString(){
    return "Sexo del animal: " + this.sexo;
  }
}
