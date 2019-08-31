package algorithm;

import java.util.*;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        try {
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] + nums[j] == target) {
//                        return new int[]{i, j};
//                    }
//                }
//            }
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (map.containsKey(diff)) {
                    return new int[]{map.get(diff), i};
                }
                map.put(nums[i], i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("No Solutions");
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length <= 0) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1] || nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (j > i + 1 && nums[j] == nums[j - 1] || nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //int target = 10;
        List<List<Integer>> lists = threeSum(nums);
        System.out.print(lists);
    }
}
