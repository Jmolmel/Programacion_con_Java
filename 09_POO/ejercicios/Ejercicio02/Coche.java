package Ejercicio02;

public class Coche extends Vehiculo{

  public Coche(){
    super();
  }
  @Override
  public int getKilometrosTotales() { //FALLA
    // TODO Auto-generated method stub
    return super.getKilometrosTotales();
  }

  @Override
  public void andaVehiculo(int kilometros){
    super.andaVehiculo(kilometros);
    System.out.println("Andando con mi cochecito unos " + kilometros + " kilometros.");
  }

  public void quemarRueda(){
    System.out.println("Quemando rueda con mi cochecito.");
  }


}
