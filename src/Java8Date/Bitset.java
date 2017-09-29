package Java8Date;

import java.util.BitSet;
import java.util.Scanner;

public class Bitset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

     //   Bitset b3 = new Bitset();

        while(m-- > 0){
            String op = sc.next();
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            switch(op){
                case "AND":
                    if(i1 == 1){
                        b1.and(b2);
                    }else{
                        b2.and(b1);
                    }break;

                case "OR":
                    if(i1 == 1){
                        b1.or(b2);
                    }else{
                        b2.or(b1);
                    }break;

                case "XOR":
                    if(i1 == 1){
                        b1.xor(b2);
                    }else{
                        b2.xor(b1);
                    }break;
                case "SET":
                    if(i1 == 1){
                        b1.set(i2);
                    }else{
                        b2.set(i2);
                    }break;
                case "FLIP":
                    if(i1 == 1){
                        b1.flip(i2);
                    }else{
                        b2.flip(i2);
                    }break;
                default:
                    break;

            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

    }
}
