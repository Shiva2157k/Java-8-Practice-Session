package Java8Date;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Deque
{
    public static void main(String[] args) {

        java.util.Deque<Integer> deque = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;
        HashSet hs = new HashSet();

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            deque.add(num);
            hs.add(num);

            if(deque.size() == m+1){

                int out = (int) deque.remove();

                if(!deque.contains(out)){
                    hs.remove(out);
                }

            }
            max = Math.max(hs.size(),max);


        }

        scan.close();

        System.out.println(max);
    }

}

