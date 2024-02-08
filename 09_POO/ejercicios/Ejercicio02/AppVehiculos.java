package Ejercicio02;

public class AppVehiculos {
  public static void main(String[] args) {
    Bicicleta bici = new Bicicleta();
    Coche cochecito = new Coche();
    boolean salida = false;

  do {
    System.out.println("VEHICULOS");
    System.out.println("=========");
    System.out.println("1. Anda con bicicleta");
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    int eleccion = Integer.parseInt(System.console().readLine());


    switch (eleccion) {
      case 1:
        System.out.println("Introduzca cuantos kilometros ha andado con su bicicleta: ");
        int kilometrosBici = Integer.parseInt(System.console().readLine());
        bici.recorre(kilometrosBici);
        break;
      case 2:
        bici.hacerCaballito();
        break;
      case 3:
      System.out.println("Introduzca cuantos kilometros ha andado con su coche: ");
        int kilometrosCoche = Integer.parseInt(System.console().readLine());
        cochecito.recorre(kilometrosCoche);
        break;
      case 4:
        cochecito.quemarRueda();
        break;
      case 5:
      System.out.println("Ha recorrido con su bici un total de: " + bici.getKilometrosRecorridos() + " kilometros.");
        
        break;
      case 6:
      System.out.println("Ha recorrido con su bici un total de: " + cochecito.getKilometrosRecorridos() + " kilometros.");
        break;
      default:
      case 7:
      System.out.println(Vehiculo.getKilometrosTotales() + " kilometros totales.");
        break;
      case 8: 
        salida = true;
        break;
    }
  } while (!salida);
  }
}
