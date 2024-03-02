package EjercicioCrud;

public class AppGestisimal {


  //FUNCION LISTAR
  public static void listado(Almacen[] almacen){
    for (int i = 0; i < almacen.length; i++) {
      if (almacen[i] != null) {
        System.out.println(almacen[i].toString());
      }
    }
  }
  //FUNCION ALTA
  public static void alta(Almacen[] almacen){
    int aux = 0;
    for (int i = 0; i < almacen.length; i++) {
      if (almacen[i] == null) {
        aux= i;
        break;
      }
    }
    System.out.println("Introduzca el código: ");
    String codigo = (System.console().readLine());
    System.out.println("Introduzca el nombre del producto: ");
    String descripcion = (System.console().readLine());
    System.out.println("Introduzca el precio de compra: ");
    double precioCompra = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el precio de venta: ");
    double precioVenta = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el stock de producto: ");
    int stock = Integer.parseInt(System.console().readLine());
    almacen[aux] = new Almacen(codigo, descripcion, precioCompra, precioVenta, stock);
  }

  //FUNCION BAJA
  public static void baja(Almacen[] almacen){
    System.out.println("Introduzca su codigo para darlo de baja");
    String codigo = (System.console().readLine());
    
    for (int i = 0; i < almacen.length; i++) {
      if (almacen[i].getCodigo().equals(codigo)) {
        almacen[i] = null;
        break;
      } else {
        System.out.println("No se ha encontrado un código parecido.");
      }
    }
  }

  //FUNCION MODIFICACION
  public static void modificacion(Almacen[] almacen){
    System.out.println("Introduzca el código de articulo para modificarlo: ");
    String codigoIntroducido = (System.console().readLine());
      int i = -1;
      do {
        i++;
      } while (almacen[i].getCodigo() != codigoIntroducido);
      
      System.out.println("Introduzca la opción que desea configurar");
      System.out.println("1. Nuevo nombre del producto: ");
      int opcion = Integer.parseInt(System.console().readLine());
      switch (opcion) {
        case 1:
        System.out.println("Introduzca el nuevo nombre del producto: ");
        String descripcion = (System.console().readLine());
        almacen[i].setDescripcion(descripcion);
          break;
      
        default:
          break;
      }
  }

    public static void masMercancia(Almacen[] almacen){
      System.out.println("Introduzca el código del objeto que desea añadir mercancía:");
      String codigo = System.console().readLine();
      System.out.println("¿Qué cantidad desea añadir?");
      int mercancia = Integer.parseInt(System.console().readLine());
      for (int i = 0; i < almacen.length; i++) {
        if (almacen[i].getCodigo().equals(codigo)) {
          almacen[i].entradaMercancia(mercancia);
        }
      } 
    }

    public static void menosMercancia(Almacen[] almacen){
      System.out.println("Introduzca el código del objeto que desea quitar mercancía:");
      String codigo = System.console().readLine();
      System.out.println("¿Qué cantidad desea quitar?");
      int mercancia = Integer.parseInt(System.console().readLine());
      for (int i = 0; i < almacen.length; i++) {
        if (almacen[i].getCodigo().equals(codigo)) {
          almacen[i].salidaMercancia(mercancia);;
        }
      } 
    }

    public static void main(String[] args) {
      Almacen[] almacen = new Almacen[10];
      AppGestisimal app = new AppGestisimal(); // Crear una instancia de la clase


      boolean salir = false;
    
    do {

      // Menú de opciones
    System.out.println("Bienvenido a la aplicación Gestisimal");
    System.out.println("1. Listar productos");
    System.out.println("2. Dar de alta un producto");
    System.out.println("3. Dar de baja un producto");
    System.out.println("4. Modificar un producto");
    System.out.println("5. Añadir mercancía a un producto");
    System.out.println("6. Quitar mercancía a un producto");
    System.out.println("7. Salir");
    System.out.println("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());
      switch (opcion) {
        case 1:
          listado(almacen);
          break;
        case 2:
          alta(almacen);
          break;
        case 3:
          baja(almacen);
          break;
        case 4:
          modificacion(almacen);
          break;
        case 5:
          masMercancia(almacen);
          break;
        case 6:
          menosMercancia(almacen);
          break;
        case 7:
          salir = true;
          break;
        default:
          System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
      }
    } while (!salir);
    }
}
