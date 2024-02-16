package EjercicioTrasnparencia;

public class AppAlumnado {
    public static void main(String[] args) {
        final int codigoAlumnoIntroducidoS = 100;

        String situacionMatricula;
        String nombreAlumno;
        int edadAlumno;
        int cursoAlumno;
        String moduloAlumno;
        String codigoAlumnoIntroducido;
        boolean salir = false;

        // ARRAY DE OBJETOS ALUMNO CON CONSTATE
        Alumno[] alumnos = new Alumno[codigoAlumnoIntroducidoS];

        // INICIALIZAMOS TODOS LOS ALUMNOS CON VALORES DE LA CLASE ALUMNO
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
        }

        // INICIALIZO 3 ALUMNOS COMO EJEMPLO CON CONSTRUCTOR CON VALORES A INTRODUCIR
        alumnos[0] = new Alumno("ALTA", "Pepe", 22, 1, "DAW", "D-182");
        alumnos[1] = new Alumno("ALTA", "Francisco", 30, 2, "DAM", "D-99");
        alumnos[2] = new Alumno("ALTA", "Eugenia", 18, 1, "ASIR", "D-200");

        do {
            // CREAMOS SWITCH PARA USAR EL METODO "CRUD"
            System.out.println("==================");
            System.out.println("BIENVENIDO AL INSTITUTO ALAN TURING");
            System.out.println("REALICE SU ELECCIÓN");
            System.out.println("0. LISTADO");
            System.out.println("1. DAR DE ALTA ALUMNO");
            System.out.println("2. DAR DE BAJA ALUMNO");
            System.out.println("3. EDITAR ALUMNO");
            System.out.println("4. BORRAR ALUMNO");
            System.out.println("5. SALIR");
            int eleccion = Integer.parseInt(System.console().readLine());

            switch (eleccion) {
                // LISTAR ALUMNOS
                case 0:
                    System.out.println("\nLISTADO");
                    System.out.println("=========");

                    for (int i = 0; i < alumnos.length; i++) {
                        if (!alumnos[i].getMatricula().equals("LIBRE")) {
                            System.out.println(alumnos[i].toString());
                        }
                    }
                    break;

                // DAR ALTA
                case 1:
                    System.out.println("Introduzca el número o código del nuevo alumno: ");
                    codigoAlumnoIntroducido = (System.console().readLine());
                    System.out.println("Introduzca el nombre: ");
                    nombreAlumno = (System.console().readLine());
                    System.out.println("Introduzca la edad: ");
                    edadAlumno = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduzca año de curso que comienza: ");
                    cursoAlumno = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduzca el módulo: ");
                    moduloAlumno = (System.console().readLine());

                    // El doWhile comienza en 0 y empieza a buscar posiciones mientras que NO sean
                    // libres.
                    int i = -1;
                    do {
                        i++;
                    } while (!alumnos[i].getMatricula().equals("LIBRE"));
                    alumnos[i].setMatricula("ALTA");
                    // Se guarda la posición i y se añade los valores introducidos.
                    alumnos[i] = new Alumno(alumnos[i].getMatricula(), nombreAlumno, edadAlumno, cursoAlumno,
                            moduloAlumno,
                            codigoAlumnoIntroducido);
                    break;
                // DAR DE BAJA
                case 2:
                    System.out.println(
                            "Introduzca el código del alumno para darlo de BAJA, recuerde que se seguirán guardando sus datos.");
                    codigoAlumnoIntroducido = (System.console().readLine());

                    int j = -1;
                    do {
                        j++;
                    } while (!alumnos[j].getnumeroAlumno().equals(codigoAlumnoIntroducido));
                    alumnos[j].setMatricula("BAJA");
                    System.out.println("Se ha dado de baja al código " + alumnos[j].getnumeroAlumno());
                    break;
                // MODIFICAR
                case 3:
                    System.out.println(
                            "Introduzca el número del alumno para MODIFICAR el alumno.(El código no se puede cambiar)");
                    codigoAlumnoIntroducido = (System.console().readLine());

                    System.out.println("Introduzca el nombre: ");
                    nombreAlumno = (System.console().readLine());
                    System.out.println("Introduzca la edad: ");
                    edadAlumno = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduzca el curso que comienza: ");
                    cursoAlumno = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduzca el módulo: ");
                    moduloAlumno = (System.console().readLine());

                    int k = -1;
                    do {
                        k++;
                    } while (!alumnos[k].getnumeroAlumno().equals(codigoAlumnoIntroducido));

                    alumnos[k] = new Alumno(alumnos[k].getMatricula(), nombreAlumno, edadAlumno, cursoAlumno,
                            moduloAlumno,
                            alumnos[k].getnumeroAlumno());
                    break;
                // ELIMINAR
                case 4:
                    System.out.println(
                            "Introduzca el código del alumno para eliminarlo.");
                    codigoAlumnoIntroducido = (System.console().readLine());

                    int f = -1;
                    do {
                        f++;
                    } while (!alumnos[f].getnumeroAlumno().equals(codigoAlumnoIntroducido));
                    alumnos[f].reset();
                    System.out.println("Se ha eliminado al alumno número: " + alumnos[f].getnumeroAlumno());
                    break;

                case 5:
                    salir = true;
                    break;
                default:
                    break;
            }

        } while (!salir);

    }
}
