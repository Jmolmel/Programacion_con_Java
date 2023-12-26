import java.util.Scanner;

public class CompruebaMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean arroba = false;
        String mail = "";

        System.out.println("Introduce tu email");
        mail = sc.nextLine();

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                arroba = true;
            }

        }
        if (arroba == true) {
            System.out.println("Su mail es correcto.");
        } else {
            System.out.println("Su mail no es correcto.");
        }
    }
}
