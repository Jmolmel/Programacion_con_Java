import java.util.ArrayList;

public class EjemploArrayList01 {
  public static void main(String[] args) {

    ArrayList<String> lista = new ArrayList<String>();

    System.out.println("Nº de elementos: " + lista.size()); // "size" ver el tamaño de la lista

    // Se añade 3 elementos
    lista.add("Rojo");
    lista.add("Verde");
    lista.add("Azul");

    System.out.println("Nº de elementos: " + lista.size()); // "size" ver el tamaño de la lista

    lista.add("Naranja");
    lista.add("Amarillo");

    System.out.println("Nº de elementos: " + lista.size()); // "size" ver el tamaño de la lista

    System.out.println("El elemento que hay en la posición 0 es: " + lista.get(0));
    System.out.println("El elemento que hay en la posición 3 es: " + lista.get(3));

  }
}
