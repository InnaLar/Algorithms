package org.example;

//int[] arr = { 1, 13, 2, 15, 5, 88, 1, 8} int target = 30
@SuppressWarnings("uncommentedmain")
public class MaxSubSequenceSumTarget {
    public static int lengthMaxSubSequence(final int[] nums, final int target) {
        int res = 0;
        int cnt = 0;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            cnt++;
            while (sum > target) {
                sum -= nums[left];
                cnt--;
                left++;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }

    public static void main(final String[] args) {
        final int[] arr = {1, 13, 2, 15, 5, 88, 1, 8, 1, 1, 1};
        final int target = 30;
        final int res = lengthMaxSubSequence(arr, target);
        System.out.println(res);
    }
}
