/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla.
 * 
 * @author José Molina Meléndez
 */
package Ejercicio08;

public class Terminal {

  //Atributos
  private String numero;
  private int tiempoConversacion;  //en segundos

  //Constructores
  public Terminal(String numero){
    this.numero = numero;
  }

  //Getters
  public String getNumero() {
    return numero;
  }
  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  //Setters
  public void setNumero(String numero) {
    this.numero = numero;
  }
  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  public void llama(Terminal t, int tiempoConversacion){
    this.tiempoConversacion += tiempoConversacion;
    t.tiempoConversacion += tiempoConversacion;
  }
  //ToString
  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversacion + "s de conversación.";
  }
}
