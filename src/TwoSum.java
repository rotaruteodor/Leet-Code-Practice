// https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    
    static public int[] twoSum(int[] nums, int target) {
        int arrayLength = nums.length;
        HashMap<Integer, Integer> savedNumbers = new HashMap<>();
        for (int i = 0; i < arrayLength; i++) {
            if (savedNumbers.containsKey(target - nums[i])) {
                return new int[]{savedNumbers.get(target - nums[i]), i};
            } else {
                savedNumbers.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
