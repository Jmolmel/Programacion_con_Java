package Animales;


public class PruebaAnimal {
  public static void main(String[] args) {

    Canario pepe = new Canario(Sexo.HEMBRA, "Canario", "Amarillo");
    
    System.out.println(pepe.toString());

    pepe.canta("pinguino");

    Pinguino ola = new Pinguino(Sexo.HEMBRA, "corbata", "2");

    System.out.println(ola.toString());

  }

}
