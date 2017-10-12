package Java8Date;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        //2nd way
        boolean isPalindrome = A.equals(new StringBuilder(A).reverse().toString());
        System.out.println(isPalindrome? "Yes" : "No");

        //1 way of writing
        /*StringBuilder str = new StringBuilder(A);

        if(str.reverse().toString().matches(A))
            System.out.println("Yes");
        else
            System.out.println("No");*/

    }
}
