public class Alumno {

  //Atributos
  private String nombre;
  private double notaMedia = 0.0;

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  
  public String getNombre() {
    return nombre;
  }


  public void setNotaMedia(double notaMedia) {
    this.notaMedia = notaMedia;
  }


  public double getNotaMedia(){
    return notaMedia;
  }


  @Override
  public String toString() {
    return String.format("Alumno %s, con nota media %.2f", nombre, notaMedia);
  }

  
}
