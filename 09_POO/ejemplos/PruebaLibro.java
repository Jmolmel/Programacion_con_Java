/**
 * Clase libro
 * 
 * @author José Molina Meléndez
 */
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Franck Thilliez";
    lib.numeroPaginas = 490;
    System.out.println("Título: " + lib.titulo);
    System.out.println("Autor: " + lib.autor);
    System.out.println("Número de páginas: " + lib.numeroPaginas);
    System.out.println("Edición: " + lib.edicion);
  }
}
