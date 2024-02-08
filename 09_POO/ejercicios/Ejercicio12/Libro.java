package Ejercicio12;

public class Libro extends Publicacion implements Prestable{

  //Atributos
  private boolean prestado = false;

    //Constructor
    public Libro(String isbn, String titulo, int year) {
      super(isbn, titulo, year);
    }
  //Getter prestado
  public boolean isPrestado() {
    return prestado;
  }

  @Override
  public void presta(){
    if (this.prestado) {
      System.out.println("Lo siento, ese libro ya está prestado.");
    } else {
      this.prestado = true;
    }
  }

  @Override 
  public void devuelve(){
    this.prestado = false;
  }

  @Override
  public boolean estaPrestado(){
    return this.prestado;
  }
  @Override
  public String toString() {
    return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
  }

  
  
  
}
