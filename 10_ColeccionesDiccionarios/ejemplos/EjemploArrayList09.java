import java.util.ArrayList;

public class EjemploArrayList09 {
  public static void main(String[] args) {
  
  ArrayList<Gato> camada = new ArrayList<Gato>();

  camada.add(new Gato("Paco", "Negro", "Romano"));
  camada.add(new Gato("Ripi", "Blanco", "Siames"));

  for (Gato gato : camada) {
    System.out.println(camada);
  }
  }
}
