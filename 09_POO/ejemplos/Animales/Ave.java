package Animales;

public class Ave extends Animal {

  //Atributos
  private String raza;

  public Ave(Sexo s, String r){
    super(s);
    this.raza = r;
  }

  public Ave(String r){
    super();
    this.raza = r;
  }

  public void aseate(){
    System.out.println("Me estoy limpiando las plumas");
  }

  public void vuela(){
    System.out.println("Estoy volando");
  }

  public void canta(String r){
    this.raza = r;
    if (r.equals("canario")) {
      System.out.println("Canto estupendamente");
    } else {
      System.out.println("No sé cantar");
    }
  }

  @Override
  public String toString() {
    return super.toString() + " mi raza de ave es: " + this.raza;
  }
}
