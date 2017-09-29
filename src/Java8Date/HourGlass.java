package Java8Date;

public class HourGlass {

 //   int arr[][] = new int[6][6];

    public static void main(String [] args){

        int arr[][] = new int[][]{
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };
        System.out.println(maxHourGlass(arr));
    }

    public static int maxHourGlass(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
             int sum = findSum(arr,row,col);
             max = Math.max(max,sum);
            }
        }
        return max;
    }

    private static int findSum(int arr[][],int r,int c){
        int sum = arr[r+0][c+0]+arr[r+0][c+1]+arr[r+0][c+2]
                        +arr[r+1][c+1]
                    +arr[r+2][c+0]+arr[r+2][c+1]+arr[r+2][c+2];
        return sum;
    }


}
