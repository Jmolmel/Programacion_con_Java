package Ejercicio12;
public class Publicacion {

  //Atributos
  private int year;
  private String titulo;
  private String isbn;

  //Constructor
  public Publicacion(String isbn, String titulo, int year){
    this.isbn = isbn;
    this.year = year;
    this.titulo = titulo;
  }
  //Getters
  public String getIsbn() {
    return isbn;
  }
  public String getTitulo() {
    return titulo;
  }
  public int getYear() {
    return year;
  }

  //Tostring
  @Override
  public String toString() {
    return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + year;
  }
}
