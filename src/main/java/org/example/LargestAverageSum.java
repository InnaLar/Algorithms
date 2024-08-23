package org.example;

//int[] arr = {1, 0, 6, -5, -6, 8, 9, 23, -30, 56, 12};
//int k = 4;
// {23, -30, 56, 12} -> 15.25
@SuppressWarnings("uncommentedmain")
public class LargestAverageSum {
    public static double findMaxAverage(final int[] nums, final int k) {
        double res = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        res = 1.0 * sum / k;
        for (int right = k; right < nums.length; right++) {
            sum = sum + nums[right] - nums[right - k];
            res = Math.max(res, 1.0 * sum / k);
        }
        return res;
    }

    public static void main(final String[] args) {
        final int[] arr = {1, 0, 6, -5, -6, 8, 9, 23, -30, 56};
        final int k = 4;
        final double avg = findMaxAverage(arr, k);
        System.out.println(avg);
    }
}
