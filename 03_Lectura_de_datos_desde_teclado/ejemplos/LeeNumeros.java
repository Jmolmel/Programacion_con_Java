/**
 * Explica tu codigo aqui
 * 
 * @author Jose Molina Melendez
 */
public class LeeNumeros {
  public static void main(String[] args) {
    String linea;
    // System.out.println("Introduce un numero entero: "); //pedimos primer numero
    // linea = System.console().readLine();

    // int num1;
    // num1 = Integer.parseInt(linea);  //convertimos de String a int 

    //  System.out.println("Introduce otro numero entero: "); //pedimos primer numero
    // linea = System.console().readLine();

    // int num2;
    // num2 = Integer.parseInt(linea); //convertimos de String a int

    // System.out.printf("El primer número es: %d\n", num1);
    // System.out.printf("El segundo número es: %d\n", num2);
    // System.out.println("El doble del número " + num1 + " es " + (num1*2));
    // System.out.println(num1 + num1);

    //parseamos float
    System.out.print("Introduce un número real: ");
    linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);   //nos devuelve un float
    System.out.printf("El número real introducido: %.2f\n", numReal);

  }
}
