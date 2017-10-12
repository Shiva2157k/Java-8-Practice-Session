package Java8Date;

import java.util.ArrayList;
import java.util.Scanner;
/*
Sample Input:
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output
74
52
37
ERROR!
ERROR!
 */
public class FindPositions {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int row = 0; row < n; row ++){
            int d = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int col = 0; col < d; col++){
                list.add(sc.nextInt());
                System.out.println(list);
            }
            lists.add(list);
            System.out.println(lists);
        }

        int q = sc.nextInt();
        for(int i = 0;i < q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            ArrayList<Integer> list = lists.get(x-1);
            if(y <= list.size()){
                System.out.println(list.get(y-1));
            }else{
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
