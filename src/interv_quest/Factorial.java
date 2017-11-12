package interv_quest;

import java.util.Scanner;

public class Factorial {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("recursion way: " + factorial(number));

        System.out.println("iteration way: "+ fact(number));
    }

    //recursion way
    public static int factorial(int number) {

        if(number == 0) {
            return 1;
        }
        return number*factorial(number -1);
    }

    //iterative way
    public static int fact (int number) {
        int result = 1;
        while (number != 0) {
            result = result * number;
            number -- ;
        }
        return result;
    }
}
