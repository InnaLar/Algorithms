package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("uncommentedmain")
public class IndicesForSum {
    public static List<int[]> getTwoIndicesToTarget(final int[] nums, final int target) {
        final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        final List<int[]> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                final int[] mas = {map.get(nums[i]), i};
                res.add(mas);
                map.remove(nums[i]);
            } else {
                map.put(target - nums[i], i);
            }
        }
        return res;
    }

    public static void main(final String[] args) {
        final int[] nums = {1, 23, 8, 89, 7, 12, 22, 29};
        final int target = 30;
        final List<int[]> res = getTwoIndicesToTarget(nums, target);
        for (int[] indices : res) {
            System.out.printf("%d = %d(%d) + %d(%d)%n", target, nums[indices[0]], indices[0], nums[indices[1]], indices[1]);
        }
    }
}
