package interv_quest;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args){

        System.out.println("Please enter a 3 digit number: ");

        int number = new Scanner(System.in).nextInt();

        System.out.println(isArmstrong(number));

    }

    private static boolean isArmstrong(int number) {
        int result = 0;
        int org = number;

        while( org > 0 ){

            int rem = org % 10;
            result = result + rem*rem*rem;
            org = org/10;
        }
        if (result == number){
            return true;
        }else
            return false;
    }
}
