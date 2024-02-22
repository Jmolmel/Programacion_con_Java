/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author José Molina Meléndez
 */
package Ejercicio03;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03 {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduzca un número: ");
      numeros.add(Integer.parseInt(System.console().readLine()));
    }

    Collections.sort(numeros); //Ordena los números
    for (int n : numeros) {
      System.out.println(n);
    }
  }
}
