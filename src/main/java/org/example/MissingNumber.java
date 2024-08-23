package org.example;

import java.util.HashSet;

@SuppressWarnings("uncommentedmain")
public class MissingNumber {
    public static int getMissingNumber(final int[] nums) {
        final HashSet<Integer> numSet = HashSet.newHashSet(nums.length);
        for (int i = 0; i <= nums.length; i++) {
            numSet.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            numSet.remove(nums[i]);
        }
        return numSet.iterator().next();
    }

    public static void main(final String[] args) {
        final int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        final int res = getMissingNumber(nums);
        System.out.println(res);
    }
}
