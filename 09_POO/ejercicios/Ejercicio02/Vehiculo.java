package Ejercicio02;

public abstract class Vehiculo {

  //Atributos de clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  //Atributos de instancia
  private int kilometrosRecorridos; 


  //Constructor
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    this.vehiculosCreados++;
  }

  //Getters 
  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public void recorre(int kilometros){
    this.kilometrosRecorridos += kilometros;
    Vehiculo.kilometrosTotales += kilometros;
  }
  
}
