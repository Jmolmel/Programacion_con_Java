public class ExamenEJ01 {
  public static void main(String[] args) {
    int[] numeros = new int[50];
    int minimo = 0;
    int maximo = 0;
    int rangoMinimoMaquina = 0;
    int rangoMaximoMaquina = 0;


    System.out.println("-D-I-V-I-N-A-R-E-M-");
    System.out.println("Introducir rango minimo");
    minimo = Integer.parseInt(System.console().readLine());
    System.out.println("Introducir rango maximo");
    maximo = Integer.parseInt(System.console().readLine());
    System.out.println("El rango de números minimo es "+ minimo + " y puede llegar hasta el número " + (maximo + 1));
    System.out.println("-D-I-V-I-N-A-R-E-M- ELIGE SU PROPIO RANGO");

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) ((Math.random() * maximo + 1) + minimo);  // Maximo + 1 para incluir el número
    }

    do {
      rangoMinimoMaquina = (int) (Math.random() * maximo + minimo);
      rangoMaximoMaquina = (int) (Math.random() * maximo + minimo);
    } while (rangoMaximoMaquina > maximo && minimo < rangoMaximoMaquina);
    
    System.out.println(" -D-I-V-I-N-A-R-E-M- está pensando un número entre " + rangoMinimoMaquina + " y " + rangoMaximoMaquina);  // MAQUINA ELIGE RANGO DENTRO DE MI INTERVALO

    

  }
}
