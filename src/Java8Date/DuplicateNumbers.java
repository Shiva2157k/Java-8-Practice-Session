package Java8Date;

import java.util.HashSet;

public class DuplicateNumbers {

    public static void main(String[] args){

        int a[] = {2,1,3,4,4,5,1,4};
        HashSet<Integer> nodup = new HashSet<>();

        for(int d : a){

            if(nodup.add(d)==false){
                System.out.println(d);
            }

        }
    }


}
