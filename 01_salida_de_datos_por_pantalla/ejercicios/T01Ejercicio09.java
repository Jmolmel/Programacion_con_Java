/**
 * Explica tu codigo aqui
 * Escribe un programa que pinte por pantalla alguna escena - el campo, la
 *  habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
 * un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
 * caracteres como *, +, <, #, @, etc. o incluso caracteres Unicode. ¡Échaleimaginación!
 * 
 * 
 * @author Jose Molina Melendez
 */
public class T01Ejercicio09 {
  public static void main(String[] args){
    System.out.printf("%-1s %1s\n", "▒▒▒", "╲");
    
    System.out.printf("%-15s \n", "▒▒▒🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋");
    System.out.printf("%-3s %10s \n", "▒🂋", "︱");
    System.out.printf("%3s %10s \n", "🂋", "︱");
    System.out.printf("%3s %10s \n", "🂋", "▧");
    System.out.printf("%3s %10s \n", "🂋", "︼");
    System.out.printf("%3s %6s \n", "🂋", "▧");
    System.out.printf("%3s %6s %1s %19s \n", "🂋", "▧", "▧", "⛵");
    System.out.printf("%3s\n", "🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡⁓⁓⁓⁓⁓⁓⁓⁓⁓");
  }
}
