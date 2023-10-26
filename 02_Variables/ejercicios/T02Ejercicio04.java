public class T02Ejercicio04 {
  public static void main(String[] args){
    double euros = 6.00;
    int pesetas;
    pesetas = (int) (euros * 166.386);
    


    System.out.println(pesetas);
    System.out.printf("%.2f --> %d pta\n", euros, pesetas);
  } 
}
