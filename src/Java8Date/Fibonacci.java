package Java8Date;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]){

        System.out.println("Enter number: ");

        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto: " +number);

        for(int i =1; i<=number; i++){
            System.out.print(fibonacci1(i) + " ");
        }


    }
    //recursion
    public static int fibonacci(int number){
        if(number ==1 || number ==2){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    //iteration
    public static int fibonacci1(int number){
        if(number == 1 || number ==2){
            return 1;
        }
        int fibo1=1,fibo2=1,fibonacci=1;
        for(int i =3;i<= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}
