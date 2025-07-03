package leetcode.solution.arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        boolean carry = false;

        for (int i = digits.length - 1; i >= 0; i--) {
            int current = digits[i];

            if (current + 1 < 10) {
                digits[i]++;
                carry = false;
                break;
            } else {
                digits[i] = 0;
                carry = true;
            }
        }
        if (!carry) {
            return digits;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < digits.length - 1; i++) {
            result[i] = digits[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] n1 = new int[]{1, 2, 3};
        int[] n2 = new int[]{4, 3, 2, 1};
        int[] n3 = new int[]{9};
        int[] n4 = new int[]{9, 8, 9};
        int[] n5 = new int[]{9, 9, 9};

        assert Arrays.equals(plusOne(n1), new int[]{1, 2, 4}) : "case1 failed";
        assert Arrays.equals(plusOne(n2), new int[]{4, 3, 2, 2}) : "case2 failed";
        assert Arrays.equals(plusOne(n3), new int[]{1, 0}) : "case3 failed";
        assert Arrays.equals(plusOne(n4), new int[]{9, 9, 0}) : "case4 failed";
        assert Arrays.equals(plusOne(n5), new int[]{1, 0, 0, 0}) : "case5 failed";
    }
}