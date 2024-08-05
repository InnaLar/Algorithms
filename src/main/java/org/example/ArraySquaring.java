package org.example;

import java.util.Arrays;

//[-7; -4; -2; -1; 0; 3; 5; 15] -> [0; 1; 4; 9; 16; 25; 49; 225]
@SuppressWarnings({"UncommentedMain", "ExecutableStatementCount"})
public class ArraySquaring {

    public static int[] squaring(final int[] intArray) {
        int leftPointer = 0;
        final int lengthArray = intArray.length;
        int rightPointer = lengthArray - 1;
        final int[] anotherArray = new int[lengthArray];
        int j = lengthArray - 1;
        while (leftPointer != rightPointer) {
            if (Math.abs(intArray[leftPointer]) > Math.abs(intArray[rightPointer])) {
                anotherArray[j] = (int) Math.pow(intArray[leftPointer], 2);
                leftPointer++;
            } else {
                anotherArray[j] = (int) Math.pow(intArray[rightPointer], 2);
                rightPointer--;
            }
            j--;
        }
        return anotherArray;
    }

    public static void main(final String[] args) {
        //final int[] intArray = {-7, -4, -2, -1, 0, 3, 5, 15};
        //final int[] intArray = { 0, 3, 5, 15};
        //final int[] intArray = { -5, -4, -3, -2, -1, 0, 6};
        final int[] intArray = {-5, -4, -3, -2, -1};
        System.out.println(Arrays.toString(intArray));
        //squaring(intArray);
        //System.out.println(Arrays.toString(intArray));
        //System.out.println(n);
        System.out.println(Arrays.toString(squaring(intArray)));
    }
}
