import java.util.Scanner;

/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int empleado;
    Double dietas;
    int estadoCivil;
    final double precioDia = 30;
    Double sueldo = 0.0;
    Double sueldoBruto;
    Double sueldoNeto;
    Double dineroDietas;
    int irpf = 0;
    Double retencionIrpf;

    System.out.print("Introduzca el cargo que tiene como empleado en programación.(1.Junior 2.Senio 3.Jefe Proyecto)");
    empleado = sc.nextInt();
    System.out.print("Introduzca cuantos días ha estado visitando clientes: ");
    dietas = sc.nextDouble();
    System.out.print("Introduzca su estado civil (1.Soltero 2.Casado)");
    estadoCivil = sc.nextInt();

    switch (empleado) {
      case 1:
        sueldo = 900.00;
        break;
      case 2:
        sueldo = 1200.00;
        break;
      case 3:
        sueldo = 1600.00;
        break;

      default:
        System.out.println("ERROR.Introduzca un puesto correcto.");
        break;
    }
    switch (estadoCivil) {
      case 1:
        irpf = 25;
        break;
      case 2:
        irpf = 20;
        break;

      default:
        System.out.println("Introduzca un estado civil válido.");
        break;
    }
    dineroDietas = (precioDia * dietas);
    sueldoBruto = (sueldo + dineroDietas);
    retencionIrpf = ((sueldoBruto * irpf) / 100);
    sueldoNeto = (sueldoBruto - retencionIrpf);

    System.out.println("|--------------------------------------|");
    System.out.printf("|%-20s         %9.2f| \n", "Sueldo base", sueldo);
    System.out.printf("|%-20s         %9.2f|\n", "Dietas (5 viajes)", dineroDietas);
    System.out.println("|--------------------------------------|");
    System.out.printf("|%-20s          %8.2f| \n", "Sueldo bruto", sueldoBruto);
    System.out.printf("|%-20s(%1d %%) %11.2f| \n", "Retencion IRPF", irpf, retencionIrpf);
    System.out.println("|--------------------------------------|");
    System.out.printf("|%-20s         %9.2f| \n", "Sueldo neto", sueldoNeto);
    System.out.println("|--------------------------------------|");

    sc.close();
  }

}
