import java.util.Scanner;

public class CompruebaMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arroba = 0;
        boolean punto = false;

        System.out.println("Introduce tu email");
        String mail = sc.nextLine();

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                arroba++;
            }
            if (mail.charAt(i) == '.') {
                punto = true;
            }

        }
        if (arroba == 1 && punto == true) {
            System.out.println("Su mail es correcto.");
        } else {
            System.out.println("Su mail no es correcto.");
        }
    }
}
