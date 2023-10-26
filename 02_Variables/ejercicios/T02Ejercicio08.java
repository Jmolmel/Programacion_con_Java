/**
 * Escribe un programa que declare 5 variables de tipo char.
 *  A continuación, crea otra variable como cadena de caracteres 
 * y asígnale como valor la concatenación de las anteriores 5 variables.
 * Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? 
 * ¿cómo lo has solucionado?
 * @author Jose Molina Melendez
 */
public class T02Ejercicio08 {
  public static void main(String[] args){
  
  char letraV = 'v';
  char letraU = 'u';
  char letraE = 'e';
  char letraL = 'l';
  char letraO = 'o';

  String vueloUno = ("Estos son mis char --> " + letraV + letraU + letraE + letraL + letraO) ;

  System.out.println(vueloUno); 
  
  //Lo he solucionado poniendo un String entre comillas dobles y los char concatenados y funciona.
  
  }
  
}
