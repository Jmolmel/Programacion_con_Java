/**
 * Mejora el ejercicio anterior añadiéndole colores
 * 
 * @author Jose Molina Melendez
 */
import Colorines.ConsoleColores;
public class T01Ejercicio10 {
  public static void main(String[] args){
    System.out.printf("\033[0;33m%-1s \033[0;31m%1s\n", "▒▒▒", "╲");
    
    System.out.printf("\033[0;33m%-15s \n", "▒▒▒🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋");
    System.out.printf("\033[0;33m%-3s \033[0;31m%10s \n", "▒🂋", "︱");
    System.out.printf("\033[0;33m%3s \033[0;31m%10s \n", "🂋", "︱");
    System.out.printf("\033[0;33m%3s \033[1;32m%10s \n", "🂋", "▧");
    System.out.printf("\033[0;33m%3s \033[0;31m%10s \n", "🂋", "︼");
    System.out.printf("\033[0;33m%3s \033[1;32m%6s \n", "🂋", "▧");
    System.out.printf("\033[0;33m%3s \033[1;32m \033[1;32m%6s %1s %19s \n", "🂋", "▧", "▧", "⛵");
    System.out.printf("\033[33m%-27s \033[0;34m%s \n", "🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡", "﹍﹍﹍﹍﹍﹍﹍");
    // El "MAR" no funciona por el caracter del "suelo" ocupa menos esteticamente que su respectivo espaciado, por eso no pueden juntarse ambos
  }

}

  
