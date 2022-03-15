package my.array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] testArray = {2, 3, 4, 6, 7, 1, 5};
        System.out.println(Arrays.toString(testArray));
        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));

        String[] testStrArray = {"a","d","c","x","t"};
        System.out.println(Arrays.toString(testStrArray));
        Arrays.sort(testStrArray);
        System.out.println(Arrays.toString(testStrArray));

        for(String s : testStrArray) {
            System.out.print(s + ", ");
        }
    }
}
