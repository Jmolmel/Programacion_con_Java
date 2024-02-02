package Animales;

public class Pinguino extends Ave{

  public Pinguino(){
    super();
  }

  public Pinguino(Sexo s){
    super(s);
  }

  @Override   //Se pone porque en la clase madre de Pinguino ya existe el metodo volar y estoy sobrecargandolo.
  public void vuela(){
    System.out.println("No puedo volar");
  }
}
