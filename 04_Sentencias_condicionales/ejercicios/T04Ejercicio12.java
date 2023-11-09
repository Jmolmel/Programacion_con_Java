import java.util.Scanner;

/**
 * Explica tu codigo aqui
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el
 * minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String respuesta;
    int puntos = 0;

    System.out.println("TEST DE 10 PREGUNTAS PARA EVALUAR TU CONOCIMIENTO!");

    System.out.println("1. ¿Cuál de los siguientes tiene más precision?");
    System.out.println(" a) int \n b) Double \n c) float");
    System.out.println("Respuesta");
    respuesta = sc.nextLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcta");
    } else {
      System.out.println("Incorrecta");
    }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en bases de datos?");
    System.out.println(" a) XML \n b) SELECT \n c) SQL");
    System.out.println("Respuesta");
    respuesta = sc.nextLine();
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Correcta");
    } else {
      System.out.println("Incorrecta");
    }

    System.out.println("3.Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println(" a) href \n b) a\n c) link");
    System.out.println("Respuesta");
    respuesta = sc.nextLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcta");
    } else {
      System.out.println("Incorrecta");
    }

    System.out.println("4.¿Dónde se inserta un microprocesador?");
    System.out.println(" a) Socket \n b) Placa\n c) Fuente alimentacion");
    System.out.println("Respuesta");
    respuesta = sc.nextLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcta");
    } else {
      System.out.println("Incorrecta");
    }

    System.out.println("5.¿Para qué se usa Github");
    System.out.println(" a) Compartir repositorios \n b) Descargar aplicaciones\n c) Escuchar música");
    System.out.println("Respuesta");
    respuesta = sc.nextLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcta");
    } else {
      System.out.println("Incorrecta");
    }
    System.out.println("6.¿Cúal es un tipo de memoria interna?");
    System.out.println(" a) SSD \n b) HDD\n c) Caché");
    System.out.println("Respuesta");
    respuesta = sc.nextLine();
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Correcta");
    } else {
      System.out.println("Incorrecta");
    }
    System.out.println("7.¿Cuál es de tipo hadware?");
    System.out.println(" a) BIOS \n b) UEFI\n c) Motherboard");
    System.out.println("Respuesta");
    respuesta = sc.nextLine();
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Correcta");
    } else {
      System.out.println("Incorrecta");
    }
    System.out.println("El resultado de su test es de: " + puntos + " puntos.");
  }
}
