package Java8Date;

import java.util.Scanner;
/*
Username should be more than 8 and less than 30 characters
1ShivaKumar->Invalid
Shiva1Kumar->Invalid
ShivaKumar->Valid
Shiva_Kumar->Valid
*/

public class ValidUserName {

    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(ValidUserName.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}
