package Animales;

public class Pinguino extends Ave{

  //Atributos
  private String aletas;
  public Pinguino(Sexo s, String r, String aletas) {
    super(s, r);
    this.aletas = aletas;
  }

  public Pinguino(String r) {
    super(r);
  }

  public String getAletas() {
    return aletas;
  }


  @Override   //Se pone porque en la clase madre de Pinguino ya existe el metodo volar y estoy sobrecargandolo.
  public void vuela(){
    System.out.println("No puedo volar");
  }

  @Override
  public String toString() {
    return super.toString() + " soy un pinguino";
  }
}
