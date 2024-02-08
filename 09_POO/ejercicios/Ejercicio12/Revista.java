package Ejercicio12;

public class Revista extends Publicacion{

  //Atributos
  private int numero;

  //Constructor 
  public Revista(String isbn, String titulo, int year, int numero){
    super(isbn, titulo, year);
    this.numero = numero;
  }
}
