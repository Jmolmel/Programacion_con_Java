import java.util.Scanner;

public class CompruebaMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arroba = 0;

        System.out.println("Introduce tu email");
        String mail = sc.nextLine();

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                arroba++;
            }

        }
        if (arroba == 1) {
            System.out.println("Su mail es correcto.");
        } else {
            System.out.println("Su mail no es correcto.");
        }
    }
}
