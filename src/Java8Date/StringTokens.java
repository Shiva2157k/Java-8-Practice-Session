package Java8Date;

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();

        if(s.equals(""))
        {
            System.out.println("0");
            return;
        }else
        if(s.length() >= 1 && s.length() <400000){

            String delim = "[^A-Za-z-]+";
            String [] out = s.trim().split(delim);

            System.out.println(out.length);

            for(int i = 0; i< out.length;i++){

                System.out.println(out[i]);

            }
        }
        
        scan.close();
    }
}
