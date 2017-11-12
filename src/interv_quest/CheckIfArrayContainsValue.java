package interv_quest;

import java.util.Arrays;

public class CheckIfArrayContainsValue {

    public static void main(String args[]) {
        Integer[] input = new Integer[]{1,2,3,4,5};
    }

    public static <T> boolean isExists(final T[] array, final T object) {
        return Arrays.asList(array).contains(object);
    }
}
