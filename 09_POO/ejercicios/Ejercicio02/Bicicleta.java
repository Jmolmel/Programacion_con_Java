package Ejercicio02;

public class Bicicleta extends Vehiculo{


  public Bicicleta() {
    super();
  }

  @Override
  public void andaVehiculo(int kilometros){
    super.andaVehiculo(kilometros);
    System.out.println("Andando con mi bici unos " + kilometros + " kilometros.");
  }
  public void hacerCaballito(){
    System.out.println("Haciendo el caballito.");
  }

  
  
}
