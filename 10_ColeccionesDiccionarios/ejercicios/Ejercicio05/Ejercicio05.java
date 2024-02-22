/**
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
 * una lista para almacenar la información sobre los discos en lugar de un array
 * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 * 
 * @author José Molina Meléndez
 */
package Ejercicio05;

import java.util.ArrayList;

public class Ejercicio05 {
  public static void main(String[] args) {
    int opcion;
    int opcionListado;
    String codigoIntroducido;
    int limiteSuperior;
    int limiteInferior;
    String generoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    int duracionIntroducida;

    ArrayList<Disco> album = new ArrayList<Disco>();

    // Discos definidos
    album.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
    album.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
    album.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));

    // Inicio programa
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());

      // Switch
      switch (opcion) {
        case 1:
          do {
            System.out.println("1. Completo");
            System.out.println("2. Por autor");
            System.out.println("3. Por género");
            System.out.println("4. En un rango de duración");
            System.out.println("5. Menú principal");
            System.out.print("Introduzca una opción: ");
            opcionListado = Integer.parseInt(System.console().readLine());

            switch (opcionListado) {
              case 1:
                System.out.println("LISTADO COMPLETO");
                for (Disco disco : album) {
                  System.out.println(disco);
                }
                break;
              case 2:
                System.out.println("Introduzca autor: ");
                autorIntroducido = System.console().readLine();
                for (Disco disco : album) {
                  if (disco.getAutor().equals(autorIntroducido)) {
                    System.out.println(disco);
                  }
                }
                break;
              case 3:
                System.out.println("Introduzca genero: ");
                generoIntroducido = System.console().readLine();
                for (Disco disco : album) {
                  if (disco.getGenero().equals(generoIntroducido)) {
                    System.out.println(disco);
                  }
                }
                break;
              case 4:
                System.out.println("Introduzca límite inferior de duración: ");
                limiteInferior = Integer.parseInt(System.console().readLine());
                System.out.println("Introduzca límite superior de duración: ");
                limiteSuperior = Integer.parseInt(System.console().readLine());

                for (Disco disco : album) {
                  if ((disco.getDuracion() <= limiteInferior) && (disco.getDuracion() > limiteSuperior)) {
                    System.out.println(disco);
                  }
                }
                break;
            }
          } while (opcionListado != 5);
          break;
        case 2:
          System.out.println("INTRODUZCA LOS VALORES DE SU NUEVO DISCO");
          System.out.print("Introduzca código: ");
          codigoIntroducido = System.console().readLine();
          System.out.print("Introduzca autor: ");
          autorIntroducido = System.console().readLine();
          System.out.print("Introduzca  título: ");
          tituloIntroducido = System.console().readLine();
          System.out.print("Introduzca género: ");
          generoIntroducido = System.console().readLine();
          System.out.print("Introduzca la duración: ");
          duracionIntroducida = Integer.parseInt(System.console().readLine());
          album.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido,
              duracionIntroducida));
          break;
        case 3:
          System.out.println("Introduzca el código del disco a modificar: ");
          codigoIntroducido = System.console().readLine();
          while (!album.contains(new Disco(codigoIntroducido, "", "", "", 0))) {
            System.out.println("El codigo no existe, introduzca uno válido.");
            codigoIntroducido = System.console().readLine();
          }
          int i = album.indexOf(new Disco(codigoIntroducido, "", "", "", 0)); //indexOF del codigoIntroducido se guarda en i
          System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

          System.out.println("Código: " + album.get(i).getCodigo());
          System.out.println("Introduzca nuevo código: ");
          codigoIntroducido = System.console().readLine();
          if (!codigoIntroducido.equals("")) {
            album.get(i).setCodigo(codigoIntroducido);
          }

          System.out.println("Autor: " + album.get(i).getAutor());
          System.out.println("Nuevo autor: ");
          autorIntroducido = System.console().readLine();
          if (!autorIntroducido.equals("")) {
            album.get(i).setAutor(autorIntroducido);
          }

          System.out.println("Título: " + album.get(i).getTitulo());
          System.out.println("Nuevo título: ");
          tituloIntroducido = System.console().readLine();
          if (!tituloIntroducido.equals("")) {
            album.get(i).setTitulo(tituloIntroducido);
          }

          System.out.println("Género: " + album.get(i).getGenero());
          System.out.println("Nuevo género: ");
          generoIntroducido = System.console().readLine();
          if (!generoIntroducido.equals("")) {
            album.get(i).setGenero(generoIntroducido);
          }

          System.out.println("Duración: " + album.get(i).getDuracion());
          System.out.println("Nueva duración: ");
          duracionIntroducida = Integer.parseInt(System.console().readLine());
          if (duracionIntroducida != 0) {
            album.get(i).setDuracion(duracionIntroducida);
          }
          break;


        case 4:
          System.out.println("BORRAR");
          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = System.console().readLine();
          if (!album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
            System.out.println("Lo siento, el código introducido no existe.");
            } else {
              album.remove(album.indexOf(new Disco(codigoIntroducido, "", "", "", 0)));
              System.out.println("Album borrado");
            }
          break;
        default:
          break;
      }
    } while (opcion != 5);
  }
}
