package interv_quest;

public class LargestAndSmallestNumber {

    public static void largestAndSmallest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int num : numbers) {
            if(num > largest) {
                largest = num;
            }else if(num < smallest){
                smallest = num;
            }
        }
    }

    public static void main(String[] args) {
        largestAndSmallest(new int[] {-20,34,21,-87,92});
    }
}
