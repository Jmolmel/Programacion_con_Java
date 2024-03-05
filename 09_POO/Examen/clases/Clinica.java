package clases;

public class Clinica {
  //Atributos
  final int N = 100;
  private Mascota[] listado;
  //Constructor

  public Clinica(){
    listado = new Mascota[N];
  }


  //Metodo
  public boolean esVacia(){
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] != null) {
        return false;
      }
    }
    return true;
  }

  //esLlena
  public boolean esLlena(){
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] == null) {
        return false;
      }
    }
    return true;
  }
  

  //totalPerros
  public int totalPerros(){
    return Perro.getTotalPerros();
  }  
  //totalGatos
  public int totalGatos(){
    return Gato.getTotalGatos();
  }
  //totalMascotas
  public int totalMascotas(){
    return Mascota.getTotalMascotas();
  }

  //buscarChips
  public Mascota buscarChip(String chip){
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] != null && listado[i].getChip().equals(chip)) {
        return listado[i];
      }
    }
    return null;
  }

  //getListado
  public Mascota[] getListado() {
    return listado;
  }

  //setListado
  public void setListado(Mascota[] listado) {
    this.listado = listado;
  }
  //agregar
  public void agregar(Mascota mascota){
  int primeraLibre = -1;
  do {
    primeraLibre++;
  } while (listado[primeraLibre] != null);

  listado[primeraLibre] = mascota;
}
  //listar
  public void listar(){
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] != null) {
        System.out.println(listado[i].toString());
      }
    }
  }
}
