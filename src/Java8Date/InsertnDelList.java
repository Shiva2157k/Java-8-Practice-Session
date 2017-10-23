package Java8Date;

import java.util.Scanner;
import java.util.LinkedList;

/*
*
5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
*
*
 */
public class InsertnDelList {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < n; i++){

            int val = sc.nextInt();
            list.add(val);
        }

        int Q = sc.nextInt();

        for(int i = 0; i < Q; i ++){
            String query = sc.next();
            if(query.equals("Insert")){

                int index = sc.nextInt();
                int val = sc.nextInt();
                list.add(index,val);
            }
            else{
                int index = sc.nextInt();
                list.remove(index);
            }

        }

        list.stream().forEach((l)->System.out.print(l + " "));


    }
}
