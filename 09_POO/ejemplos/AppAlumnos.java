public class AppAlumnos {
  public static void main(String[] args) {
    
    Alumno[] alumnos = new Alumno[5];

    //Crear un nuevo alumno en la primero posición del array
  
    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno();
      System.out.print("Introduzca el nombre del alumno: ");
      String nombre = (System.console().readLine());
      alumnos[i].setNombre(nombre);
      alumnos[i].setNotaMedia((double) (Math.random() * 11));
      System.out.println(alumnos[i].toString());
      System.out.println();
    }

  }
}
