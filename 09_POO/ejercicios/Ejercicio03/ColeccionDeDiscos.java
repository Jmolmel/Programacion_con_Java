package Ejercicio03;

//Página 206
public class ColeccionDeDiscos {
    public static void main(String[] args) {
        final int N = 100; // Creamos tamaño para array
        int opcion;
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducida;

        Disco[] discos = new Disco[N]; // Creamos array de discos

        for (int i = 0; i < N; i++) { // Inicializamos los discos en el array
            discos[i] = new Disco();
        }

        // Se definen 3 discos con un constructor.
        discos[0] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

        do {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("=========");

                    for (int i = 0; i < discos.length; i++) {
                        if (!discos[i].getCodigo().equals("LIBRE")) {
                            System.out.println(discos[i].toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("=========");

                    int primeraLibre = -1;
                    do {
                        primeraLibre++;
                    } while (!discos[primeraLibre].getCodigo().equals("LIBRE"));// Mientras la posicion NO sea libre.

                    System.out.println("Por favor, introduzca los datos del disco.");
                    System.out.print("Código: ");
                    codigoIntroducido = (System.console().readLine());
                    System.out.print("Autor: ");
                    autorIntroducido = (System.console().readLine());
                    System.out.print("Título: ");
                    tituloIntroducido = (System.console().readLine());
                    System.out.print("Género: ");
                    generoIntroducido = (System.console().readLine());
                    System.out.print("Duración: ");
                    duracionIntroducida = Integer.parseInt(System.console().readLine());

                    discos[primeraLibre] = new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido,
                            generoIntroducido, duracionIntroducida);
                    break;
                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("=========");

                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = (System.console().readLine());

                    int i = -1;
                    do {
                        i++;
                    } while (!discos[i].getCodigo().equals(codigoIntroducido));

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
                    // CODIGO
                    System.out.println("Codigo: " + discos[i].getCodigo());
                    System.out.print("Nuevo código: ");
                    codigoIntroducido = (System.console().readLine());
                    if (!codigoIntroducido.equals("")) {
                        discos[i].setCodigo(codigoIntroducido);
                    }
                    // AUTOR
                    System.out.println("Autor: " + discos[i].getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = (System.console().readLine());
                    if (!autorIntroducido.equals("")) {
                        discos[i].setAutor(autorIntroducido);
                    }
                    // TITULO
                    System.out.println("Título: " + discos[i].getTitulo());
                    System.out.print("Nuevo título: ");
                    tituloIntroducido = (System.console().readLine());
                    if (!tituloIntroducido.equals("")) {
                        discos[i].setTitulo(tituloIntroducido);
                    }
                    // GENERO
                    System.out.println("Género: " + discos[i].getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntroducido = (System.console().readLine());
                    if (!generoIntroducido.equals("")) {
                        discos[i].setGenero(generoIntroducido);
                    }
                    // DURACION
                    System.out.println("Duración: " + discos[i].getDuracion());
                    System.out.print("Duración: ");
                    final String duracionIntroducidaString = (System.console().readLine());
                    if (!duracionIntroducidaString.equals("")) {
                        discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
                    }
                    break;
                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");

                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigoIntroducido = (System.console().readLine());

                    int j = -1;
                    do {
                        j++;
                    } while (!discos[j].getCodigo().equals(codigoIntroducido));
                    discos[j].reset(codigoIntroducido); // Funcion que resetea y pone a código como LIBRE
                    System.out.println("Album borrado.");
                    break;
                default:
                    break;
            }

        } while (opcion != 5);
    }
}
