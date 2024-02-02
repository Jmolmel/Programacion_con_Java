package Animales;

public class Ave extends Animal {

  //Atributos
  public Ave(Sexo s){
    super(s);
  }

  public Ave(){
    super();
  }

  public void aseate(){
    System.out.println("Me estoy limpiando las plumas");
  }

  public void vuela(){
    System.out.println("Estoy volando");
  }
}
