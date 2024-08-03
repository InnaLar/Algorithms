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

    public static void reverseArray(final int[] intArray, final int endPos) {
        int temp;
        final int rightBound = endPos == -1 ? intArray.length : endPos;
        for (int i = 0; i < rightBound / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[rightBound - 1 - i];
            intArray[rightBound - 1 - i] = temp;
        }
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

    public static void shift(final int[] intArray, final int targetPos) {
        final int temp;
        temp = intArray[0];
        for (int i = 1; i <= targetPos; i++) {
            intArray[i - 1] = intArray[i];
        }
        intArray[targetPos] = temp;
    }

    public static int[] anotherSquaring(final int[] intArray) {
        int item;
        int posItem = -1;
        final int[] sortedIntArray = new int[intArray.length];
        boolean foundPos = false;
        for (int i = 0; i < intArray.length; i++) {
            item = intArray[i];
            if (!foundPos && item >= 0) {
                posItem = i;
                foundPos = true;
            }
            intArray[i] = (int) Math.pow(item, 2);
        }
        reverseArray(intArray, posItem);
        if (posItem == 0) {
            return intArray;
        }
        if (posItem == -1) {
            return intArray;
        }
        int i = 0;
        int j = posItem;
        int k = 0;
        while (i < posItem || j < intArray.length) {
            if (i == posItem) {
                sortedIntArray[k] = intArray[j];
                j++;
                continue;
            }
            if (j == intArray.length) {
                sortedIntArray[k] = intArray[i];
                i++;
                continue;
            }
            if (intArray[i] < intArray[j]) {
                sortedIntArray[k] = intArray[i];
                i++;
            } else {
                sortedIntArray[k] = intArray[j];
                j++;
            }
            k++;
        }
        return sortedIntArray;
    }

}
