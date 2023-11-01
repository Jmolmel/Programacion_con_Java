import java.util.Scanner;

/**
 * Escribe un programa que muestre por pantalla un menú que permita seleccionar 3 opciones: calcular el área de un
 * cuadrado, de un rectángulo y de un triángulo. Se solicitará al usuario la opción y, en función de lo elegido, se solicitará los
 * datos necesarios y se mostrará en pantalla el resultado de calcular el área del cuadrado, rectángulo o triángulo.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicioc03Clase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int area;
    Double base;
    Double altura;
    Double cuadrado;
    Double rectangulo;
    Double triangulo;
    Double lado;

    System.out.println("Introduzca numericamente el área que desea calcular: 1-Cuadrado. 2-Rectángulo. 3-Triángulo.");
    area = sc.nextInt();

    switch (area) {
      case 1:
        System.out.println("Introduzca el lado de su figura: ");
        lado = sc.nextDouble();
        cuadrado = lado*lado;                             // duda. No puedo definir esta funcion mas arriba? no funciona si no esta dentro del switch?
        System.out.println("El área de su cuadrado es: " + cuadrado + "cm2.");
        
        break;
      case 2:
        System.out.println("Introduzca la base de su figura: ");
        base = sc.nextDouble();
        System.out.println("Introduzca la altura de su figura: ");
        altura = sc.nextDouble();
        rectangulo = (base*altura);
        System.out.println("El área de su Rectángulo es de : " + rectangulo + " cm2.");

        break;
      case 3:
        System.out.println("Introduzca la base de su figura: ");
        base = sc.nextDouble();
        System.out.println("Introduzca la altura de su figura: ");
        altura = sc.nextDouble();
        triangulo = ((base*altura)/2);
        System.out.println("El área de su triángulo es : " + triangulo + " cm2.");
        break;
      default:
      System.out.println("El número introducido no es valido.");
        break;
    };
  }
  
}
