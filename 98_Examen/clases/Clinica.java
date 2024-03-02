

public class Clinica {
  final int LISTADO = 100;
  private Mascota[] mascotas = new Mascota[LISTADO];
  Clinica clinica = new Clinica();


  public boolean esVacia(Mascota[] mascotas){
    for (int i = 0; i < mascotas.length; i++) {
      if (mascotas[i].getChip().equals(null)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean esLlena (Mascota[] mascotas){
    for (int i = 0; i < mascotas.length; i++) {
      if (mascotas[i].getChip() != null) {
        return true;
      }
    }
    return false;
  }

  public void totalPerros(){
    clinica.totalPerros();
  }

  public void totalGatos(){
    clinica.totalGatos();
  }

  public void totalMascotas(){
    clinica.totalMascotas();
  }

  public void buscarChip(String chip){
    System.out.println("Introduzca su chip: ");
    String buscarChip = System.console().readLine();
    for (int i = 0; i < mascotas.length; i++) {
      if (mascotas[i].getChip().equals(buscarChip)) {
        System.out.println(mascotas);
      } else {
        mascotas[i] = null;
      }
    }
  }
}
