package org.example;

import java.util.Arrays;

//[-7; -4; -2; -1; 0; 3; 5; 15] -> [0; 1; 4; 9; 16; 25; 49; 225]
@SuppressWarnings({"UncommentedMain", "ExecutableStatementCount"})
public class ArraySquaring {

    public static void squaring(final int[] intArray) {
        int item;
        int posItem = -1;
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
        int j = posItem;

        while (posItem > 0) {
            if (intArray[0] > intArray[j]) {
                shift(intArray, j);
                j++;
            } else {
                shift(intArray, j - 1);
            }
            posItem--;
        }
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
        final int[] intArray = {-7, -4, -2, -1, 0, 3, 5, 15};
        //final int[] intArray = { 0, 3, 5, 15};
        //final int[] intArray = { -5, -4, -3, -2, -1, 0, 6};
        //final int[] intArray = { -5, -4, -3, -2, -1};
        System.out.println(Arrays.toString(intArray));
        //squaring(intArray);
        //System.out.println(Arrays.toString(intArray));
        //System.out.println(n);
        System.out.println(Arrays.toString(anotherSquaring(intArray)));
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
