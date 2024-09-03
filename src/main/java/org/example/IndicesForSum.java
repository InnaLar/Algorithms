package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array of integers nums and an integer target,
// return indices of two numbers such that they add up to target.
// You cannot use the same index twice.
@SuppressWarnings("uncommentedmain")
public class IndicesForSum {
    public static int[] getTwoIndicesToTarget(final int[] nums, final int target) {
        final Map<Integer, Integer> map = new HashMap<>();
        final int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return res;
    }

    public static void main(final String[] args) {
        //final int[] nums = {1, 23, 8, 89, 7, 12, 22, 29};
        final int[] nums = {0, 1, 0};
        final int target = 0;
        final int[] res = getTwoIndicesToTarget(nums, target);
        System.out.printf("%d = %d(%d) + %d(%d)%n", target, res[0], nums[res[0]], res[1], nums[res[1]]);
    }
}
