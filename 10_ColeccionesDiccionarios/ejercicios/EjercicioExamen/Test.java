package EjercicioExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Test {
  public static void main(String[] args) {
    HashMap<String, String> paises = new HashMap<String, String>();
    ArrayList<String> incorrecta = new ArrayList<String>();
    int incorrectaAleatoria;
    int respuesta;
    int paisPregunta;

    //Almacenado de HashMap
    paises.put("Albania", "Tirana"); //1
    paises.put("Alemania", "Berlin");
    paises.put("Austria", "Viena");
    paises.put("Belgica", "Bruselas");
    paises.put("Bulgaria", "Sofia");

    paises.put("España", "Madrid");
    paises.put("Finlandia", "Helsinki");
    paises.put("Francia", "Paris");
    paises.put("Grecia", "Atenas");
    paises.put("Hungria", "Budapest"); //10

    //Almacenado de ArrayList respuestas incorrectas
    incorrecta.add("Copenhague");
    incorrecta.add("Lisboa");
    incorrecta.add("Varsovia");//5
    incorrecta.add("Ámsterdam");
    incorrecta.add("Oslo");

    incorrecta.add("Podgorica");
    incorrecta.add("Mónaco");
    incorrecta.add("Chisinau");//10
    incorrecta.add("Mónaco");
    incorrecta.add("La Valeta");

    incorrecta.add("Luxemburgo");
    incorrecta.add("Vilna");
    incorrecta.add("Riga");//15
    incorrecta.add("Vaduz");
    incorrecta.add("Nursultán");

    incorrecta.add("Roma");
    incorrecta.add("Reikiavik");
    incorrecta.add("Dublín");//20
    incorrecta.add("Budapest");
    incorrecta.add("La Atenas");
    //Fin respuestas incorrectas

    Collections.shuffle(incorrecta); 
    //paises.containsKey(respuesta);



    for (String pais : paises.keySet()) {
      int indice =  (int)(Math.random() * 10);
      Collections.shuffle(incorrecta);
      int i = (int)(Math.random() * 20);
      System.out.println("Cuál es la capital de " + paises.get(pais));
      System.out.println("1. " + incorrecta.get(i));
      i = (int)(Math.random() * 20);
      System.out.println("2. " + incorrecta.get(i));
      System.out.println("3. " + paises.get(pais));

    }



    









  }
}
