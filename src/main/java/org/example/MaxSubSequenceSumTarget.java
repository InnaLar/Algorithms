package org.example;

//int[] arr = { 1, 13, 2, 15, 5, 88, 1, 8} int target = 30
@SuppressWarnings("uncommentedmain")
public class MaxSubSequenceSumTarget {
    public static int lengthMaxSubSequence(final int[] arr, final int target) {
        int res = 0;
        int cnt = 0;
        int left = 0;
        int sum = 0;
        int curr = 0;
        while (curr < arr.length) {
            sum += arr[curr];
            cnt++;
            if (sum > target) {
                sum -= arr[left];
                cnt--;
                left++;
            }
            curr++;
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
