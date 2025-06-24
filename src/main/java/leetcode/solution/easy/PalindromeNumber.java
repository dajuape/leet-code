package leetcode.solution.easy;

import java.util.Stack;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; //A palindrome number can never be negative.
        }

        Stack<Integer> stack = new Stack<>();
        int originNumber = x;
        while (x > 0) {
            stack.add(x % 10);
            x /= 10;
        }
        int exponent = (int) Math.pow(10, stack.size() - 1);
        int result = 0;
        for (Integer digit : stack) {
            result += (digit * exponent);

            exponent /= 10;
        }

        return result == originNumber;
    }

    public static void main(String[] args) {


        int case1 = 121;
        int case2 = -121;
        int case3 = 10;
        int case4 = 1221; // 1, 2, 2, 1

        assert isPalindrome(case1) : "case1 failed";
        assert !isPalindrome(case2) : "case2 failed";
        assert !isPalindrome(case3) : "case3 failed";
        assert isPalindrome(case4) : "case4 failed";

        System.out.println("All tests passed.");
    }
}
