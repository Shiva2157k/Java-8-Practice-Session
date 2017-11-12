package interv_quest;

import java.util.Scanner;

public class IntegerPalindrome {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int palindrome = sc.nextInt();
        System.out.println(isPalindrome(palindrome));


    }



    public static boolean isPalindrome(int number){
        int reverse = 0;
        int pal = number;

        while(pal > 0){

            int rem = pal % 10;
            reverse = reverse * 10 + rem;
            pal = pal / 10;
        }

        if(number == reverse){
            return true;
        }else {
            return false;
        }

    }
}
