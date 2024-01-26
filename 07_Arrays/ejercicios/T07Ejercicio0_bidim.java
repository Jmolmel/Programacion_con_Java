public class T07Ejercicio0_bidim {
  public static void main(String[] args) {
    int[][] numeros = new int[5][7];
    int sumaFilas = 0;
    int sumaColumnas = 0;
    int mediaFila = 0;
    boolean salida = false;
    


    //ASIGNO NUMEROS ALEATORIOS AL ARRAY DEL 200 AL 700
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Fila " + i);
      for (int j = 0; j < numeros[i].length; j++) {
        numeros[i][j] = (int) (Math.random() * 501 + 200);
        System.out.printf("%8d", numeros[i][j]);
      }
      System.out.println();
    }

    do {
      salida = false;
      System.out.println("Introduzca lo que desea calcular(1.Filas 2.Columnas)");
    int FilaColumna = Integer.parseInt(System.console().readLine());

    switch (FilaColumna) {
      case 1:
        System.out.println("¿Qué cálculo desea hacer en sus filas?(1.Suma 2.Media)");
        int eleccionFilas = Integer.parseInt(System.console().readLine());
        switch (eleccionFilas) {
          case 1: //SUMA
            System.out.println("¿Qué fila desea calcular?(0 a 5):");
            int eleccionSuma1 = Integer.parseInt(System.console().readLine());
            for (int i = 0; i < numeros.length; i++) {
              sumaFilas = 0;
              for (int j = 0; j < numeros[i].length; j++) {
                sumaFilas += numeros[eleccionSuma1][j];
              }
            }
            System.out.println("El resultado de sumar su fila" + eleccionSuma1 + " es de : " + sumaFilas);
            salida = true;
            break;
          case 2: //MEDIA
          for (int i = 0; i < numeros.length; i++) {
            sumaFilas = 0;
            for (int j = 0; j < numeros[i].length; j++) {
              sumaFilas += numeros[((int)(Math.random() * numeros.length))][j];  //SUMAMOS UNA FILA ALEATORIA
              
            }
          }
            mediaFila = sumaFilas / 5;
            System.out.println("Su media con filas aleatorias es de : " + mediaFila);
            salida = true;
            break;
        
          default:
          System.out.println("Número introducido no es correcto");
          salida = false;
            break;
        }
        break;
    
      case 2:
      System.out.println("¿Qué cálculo desea hacer en sus columnas?(1.Suma 2.Media)");
      int eleccionColumnas = Integer.parseInt(System.console().readLine());
      switch (eleccionColumnas) {
        case 1:
            System.out.println("¿Qué fila desea columnas?(0 a 6):");
            int eleccionSuma2 = Integer.parseInt(System.console().readLine());
          for (int i = 0; i < 7; i++) {
            sumaColumnas = 0;
            for (int j = 0; j < 5; j++) {
              sumaColumnas += numeros[j][eleccionSuma2];
            }
          }
          System.out.println("El resultado de sumar su fila" + eleccionSuma2 + " es de : " + sumaColumnas);
          salida = true;
          break;
        case 2:
        salida = true;
          ///////////////////////////////
          break;
        default:
        salida = false;
          break;
      }
        break;
      default:
      System.out.println("Número introducido no es correcto");
        break;
    }

    System.out.println("¿Desea repetir la operacion?(SI / NO)");
    String salirBucle = System.console().readLine();
    if (salirBucle.equalsIgnoreCase("si")) {
      salida = false;
    } else {
      salida = true;
    }
    } while (!salida);
    System.out.println("Vuelva pronto");
  }
}
