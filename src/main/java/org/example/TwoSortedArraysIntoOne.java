package org.example;

import java.util.Arrays;

@SuppressWarnings("uncommentedmain")
public class TwoSortedArraysIntoOne {
    private static int[] combineTwoSortedArrays(final int[] arr1, final int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        final int resultSize = arr1.length + arr2.length;
        final int[] result = new int[resultSize];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(final String[] args) {
        final int[] firstIntArray = {-3, -2, 2, 6};
        final int[] secondIntArray = {5, 6, 7, 8, 13};
        System.out.println(Arrays.toString(combineTwoSortedArrays(firstIntArray, secondIntArray)));
    }
}
