package leetcode.solution.easy;

import leetcode.solution.util.TestUtils;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> checked = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            if (checked.containsKey(complement)) {
                return new int[]{checked.get(complement), i};
            }

            checked.put(current, i);
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int[] b = {3, 2, 4};
        int[] c = {3, 3};
        int[] d = {3, 2, 3};

        System.out.println("Case 1 " + TestUtils.toString(twoSum(a, 9)));
        System.out.println("Case 2 " + TestUtils.toString(twoSum(b, 6)));
        System.out.println("Case 3 " + TestUtils.toString(twoSum(c, 6)));
        System.out.println("Case 4 " + TestUtils.toString(twoSum(d, 6)));
    }
}


