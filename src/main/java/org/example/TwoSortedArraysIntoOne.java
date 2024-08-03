package org.example;

import java.util.Arrays;

@SuppressWarnings("uncommentedmain")
public class TwoSortedArraysIntoOne {
    private static int[] combineTwoSortedArrays(final int[] firstSortedIntArray, final int[] secondSortedIntArray) {
        int i = 0;
        int j = 0;
        int k = 0;
        final int resultSize = firstSortedIntArray.length + secondSortedIntArray.length;
        final int[] resultIntArray = new int[resultSize];
        while (i < firstSortedIntArray.length || j < secondSortedIntArray.length) {
            if (i == firstSortedIntArray.length) {
                for (int l = k; l < resultSize; l++) {
                    resultIntArray[l] = secondSortedIntArray[j];
                    j++;
                }
                continue;
            }
            if (j == firstSortedIntArray.length) {
                for (int l = k; l < resultSize; l++) {
                    resultIntArray[l] = firstSortedIntArray[i];
                    i++;
                }
                continue;
            }
            if (firstSortedIntArray[i] < secondSortedIntArray[j]) {
                resultIntArray[k] = firstSortedIntArray[i];
                i++;
            } else {
                resultIntArray[k] = secondSortedIntArray[j];
                j++;
            }
            k++;
        }
        return resultIntArray;
    }

    public static void main(final String[] args) {
        final int[] firstIntArray = {-3, -2, 2, 6};
        final int[] secondIntArray = {5, 6, 7, 8, 13};
        System.out.println(Arrays.toString(combineTwoSortedArrays(firstIntArray, secondIntArray)));
    }
}
