public class T07Ejercicio08 {
  public static void main(String[] args) {
    String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
    "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    int[] temperatura = new int[12];

    //Acumulamos en el array de temperatura sus valores.
    for (int i = 0; i < temperatura.length; i++) {
      System.out.print("Introduzca la temperatura media del mes de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }

    //Mostramoss por pantalla en forma de histograma.
    for (int i = 0; i < mes.length; i++) {
      System.out.printf("%-12s |",mes[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
