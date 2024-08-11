package org.example;

//int[] arr = {1, 0, 6, -5, -6, 8, 9, 23, -30, 56, 12};
//int k = 4;
// {23, -30, 56, 12} -> 15.25
@SuppressWarnings("uncommentedmain")
public class LargestAverageSum {
    public static double findMaxAvarage(final int[] arr, final int k) {
        int curr = 4;
        double res = 0;
        int sum = arr[0] + arr[1] + arr[2] + arr[3];
        while (curr < arr.length) {
            res = Math.max(sum, sum + arr[curr] - arr[curr - 4]);
            sum = sum + arr[curr] - arr[curr - 4];
            curr++;
        }
        return (double) res / k;
    }

    public static void main(final String[] args) {
        final int[] arr = {1, 0, 6, -5, -6, 8, 9, 23, -30, 56, 12};
        final int k = 4;
        final double avg = findMaxAvarage(arr, k);
        System.out.println(avg);
    }
}
