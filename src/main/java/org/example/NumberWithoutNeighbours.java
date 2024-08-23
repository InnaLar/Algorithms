package org.example;

import java.util.HashSet;

@SuppressWarnings("uncommentedmain")
public class NumberWithoutNeighbours {
    public static HashSet<Integer> findNumbersWithoutNeighbours(final int[] nums) {
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i]) && !set.contains(nums[i] + 1) && !set.contains(nums[i] - 1)) {
                set.add(nums[i]);
            }
        }
        return set;
    }

    public static void main(final String[] args) {
        final int[] nums = {1, 4, 6, 5, 13, 6, 7};
        HashSet<Integer> set = new HashSet<>();
        set = findNumbersWithoutNeighbours(nums);
        System.out.println(set);
    }
}
