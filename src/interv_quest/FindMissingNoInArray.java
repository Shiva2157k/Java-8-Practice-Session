package interv_quest;

import java.util.BitSet;

public class FindMissingNoInArray {

    public static void main(String [] args) {

      //  printMissingNumber(new int[]{1,3,4,5,7},7);
      //  System.out.println(getMissingNumber(new int[]{1,2,3,4,5,7},7));
    }

    // for more than one missing element
    private static void printMissingNumber(int [] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        int lastMissingIndex = 0;

        for(int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }

    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1)/2);
        int actualSum = 0;
        for (int i :numbers) {
            actualSum+=i;
        }
        return expectedSum - actualSum;
    }
}
