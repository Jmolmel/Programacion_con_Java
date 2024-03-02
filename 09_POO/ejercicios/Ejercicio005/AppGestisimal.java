/**
 * Main Almacen
 * 
 * @author José Molina Meléndez
 */
package Ejercicio005;

public class AppGestisimal {
  public static void main(String[] args) {
    final int N = 5;
    int eleccion;

    Almacen[] almacen = new Almacen[N];


    almacen[0] = new Almacen(100, "Cerveza victoria", 5.50, 8.50, 100);

    
    do {
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      eleccion = Integer.parseInt(System.console().readLine());

      switch (eleccion) {
        case 1:
          listado(almacen); //Llamar función de AppGestisimal
          break;
        case 2:
          alta(almacen); //Funcion Alta
          break;
        case 3:
          baja(almacen); //Funcion baja STATIC
          break;
        case 4:
          modificacion(almacen); //Funcion modificación
          break;
        case 5:
        System.out.println("Cuánta mercancia desea añadir: ");
        int mercancia = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el código de articulo para modificarlo: ");
        int codigo = Integer.parseInt(System.console().readLine());
          int k = -1;
          do {
            k++;
          } while (almacen[k].getCodigo() != codigo);
          almacen[k].entradaMercancia(mercancia);
          break;
        case 6:
        System.out.println("Cuánta mercancia desea retirar: ");
        int mercanciaSalida = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el código de articulo para modificarlo: ");
        int codigo1 = Integer.parseInt(System.console().readLine());
          int f = -1;
          do {
            f++;
          } while (almacen[f].getCodigo() != codigo1);
          almacen[f].salidaMercancia(mercanciaSalida);;
          break;
        default:
          break;
      }
    } while (eleccion != 7);

  }
  //Corregirr para que no imprima un codigo vacio.
  public static void listado(Almacen[] almacen) {
    for (int i = 0; i < almacen.length; i++) {
        if (almacen[i] != null) { //Si el valor no es nulo es decir esta el array ocupado lo pintará
            System.out.println(almacen[i].toString());
        } 
    }
}
public static void alta(Almacen[] almacen){
  int codigo = 0;
  int i = -1;

  do {
    i++;
  } while (almacen[i] != null); //Hace el bucle mientras NO sea nulo, al ser nulo se parará y introduciremos el valor
  System.out.println("Introduzca el código: ");
  codigo = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el nombre del producto: ");
  String descripcion = (System.console().readLine());
  System.out.println("Introduzca el precio de compra: ");
  double precioCompra = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca el precio de venta: ");
  double precioVenta = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca el stock de producto: ");
  int stock = Integer.parseInt(System.console().readLine());
  almacen[i] = new Almacen(codigo, descripcion, precioCompra, precioVenta, stock);
}

public static void baja(Almacen[] almacen){
  System.out.println("Introduzca el código que quiere dar de baja: ");
  int baja = Integer.parseInt(System.console().readLine());
  int i = -1;
  do {
    i++;
  } while (almacen[i].getCodigo() != baja); //Busca el codigo igual al introducido
  almacen[i].darBaja(baja); //Metodo de almacen darBaja restablece a null / 0 todo los valores.ui
}

public static void modificacion(Almacen[] almacen){

  System.out.println("Introduzca el código de articulo para modificarlo: ");
  int codigo = Integer.parseInt(System.console().readLine());
  int i = -1;
  do {
    i++;
  } while (almacen[i].getCodigo() != codigo);
  System.out.println("Introduzca la opción que desea configurar");
  System.out.println("1. Nuevo nombre del producto: ");
  System.out.println("2. Nuevo precio de compra: ");
  System.out.println("3. Nuevo precio de venta: ");
  System.out.println("4. Nuevo stock: ");
  int opcion = Integer.parseInt(System.console().readLine());


  switch (opcion) {
    case 1:
    System.out.println("Introduzca el nuevo nombre del producto: ");
    String descripcion = (System.console().readLine());
    almacen[i].setDescripcion(descripcion);
      break;
    case 2: 
    System.out.println("Introduzca el nuevo precio de compra ");
    double precioCompra = Double.parseDouble(System.console().readLine());
    almacen[i].setPrecioCompra(precioCompra);
      break;
    case 3: 
      System.out.println("Introduzca el nuevo precio de compra ");
      double precioVenta = Double.parseDouble(System.console().readLine());
      almacen[i].setPrecioVenta(precioVenta);
        break;
    case 4:
      System.out.println("Introduzca el nuevo stock ");
      int stock = Integer.parseInt(System.console().readLine());
      almacen[i].setStock(stock);
      break;
    default:
      break;
  }
}



}
