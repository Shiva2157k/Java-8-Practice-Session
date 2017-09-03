package Java8Date;
import java.io.*;
import java.util.*;

public class Anagrams {
    static boolean isAnagram(String a, String b) {

        if(a==null||b==null||a == " " || b == " ")
            throw new IllegalArgumentException();

        boolean ret = false;
        if(a !=null && b!=null || a.length() == b.length()){
            char[] arrayA =a.toLowerCase().toCharArray();
            char[] arrayB =b.toLowerCase().toCharArray();
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            ret =Arrays.equals(arrayA,arrayB);
        }
        return ret;
}
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
