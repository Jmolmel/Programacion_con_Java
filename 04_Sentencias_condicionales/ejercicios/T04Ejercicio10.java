import java.util.Scanner;

/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dia;
    int mes;

    System.out.println("HOROSCOPO");
    System.out.println("Introduzca su dia de nacimiento: ");
    dia = sc.nextInt();
    System.out.println("Introduzca su mes de nacimiento: ");
    mes = sc.nextInt();

    if ((dia >=1) && (dia <=31)) {
      switch (mes) {
          case 1:
            if (dia <=19) {
            System.out.println("Su Horoscopo es Capricornio.");
          } else{
            System.out.println("Su horoscopo es Acuario");
            
          }
          break;
          case 2:
            if (dia <=18) {
            System.out.println("Su Horoscopo es Acuario.");
          } else{
            System.out.println("Su horoscopo es Piscis");
          }
          break;
          case 3:
            if (dia <=20) {
            System.out.println("Su Horoscopo es Piscis.");
          } else{
            System.out.println("Su horoscopo es Aries");
          }
          break;
          case 4:
            if (dia <=19) {
            System.out.println("Su Horoscopo es Aries.");
          } else{
            System.out.println("Su horoscopo es Tauro");
          }
          break;
          case 5:
            if (dia <=20) {
            System.out.println("Su Horoscopo es Tauro.");
          } else{
            System.out.println("Su horoscopo es Géminis");
          }
          break;
          case 6:
            if (dia <=20) {
            System.out.println("Su Horoscopo es Géminis.");
          } else{
            System.out.println("Su horoscopo es Cancer");
          }
          break;
          case 7:
            if (dia <=22) {
            System.out.println("Su Horoscopo es Cancer.");
          } else{
            System.out.println("Su horoscopo es Leo");
          }
          break;
          case 8:
            if (dia <=22) {
            System.out.println("Su Horoscopo es Leo.");
          } else{
            System.out.println("Su horoscopo es Virgo");
          }
          break;
          case 9:
            if (dia <=22) {
            System.out.println("Su Horoscopo es Virgo.");
          } else{
            System.out.println("Su horoscopo es Libra");
          }
          break;
          case 10:
            if (dia <=22) {
            System.out.println("Su Horoscopo es Libra.");
          } else{
            System.out.println("Su horoscopo es Escorpio");
          }
          break;
          case 11:
            if (dia <=21) {
            System.out.println("Su Horoscopo es Escorpio.");
          } else{
            System.out.println("Su horoscopo es Sagitario");
          }
          break;
          case 12:
            if (dia <=21) {
            System.out.println("Su Horoscopo es Sagitario.");
          } else{
            System.out.println("Su horoscopo es Capricornio");
          }
          break;
          default:
          System.out.println("Introduzca un número valido.");
            break;
        }
      }
      


  }
  
}
