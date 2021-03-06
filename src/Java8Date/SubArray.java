package Java8Date;

import java.util.Scanner;
/*
i  j   subarray
-  -   --------
0  0       [1]
0  1     [1,2]
0  2   [1,2,3]
1  1       [2]
1  2     [2,3]
2  2       [3]
* */

public class SubArray {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i =0; i< n; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println(negativeSums(arr));
    }
    private static int negativeSums(int arr[]){
        int count = 0;
        int sum = 0;
        for(int i =0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sum += arr[j];

                if(sum < 0){
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }
}
