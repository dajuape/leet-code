package leetcode.solution.easy;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else if (closes(stack.peek(), c)) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }

    public static boolean closes(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    public static boolean isOpenBracket(char c1) {
        return c1 == '(' || c1 == '[' || c1 == '{';
    }

    public static void main(String[] args) {
        String case1 = "()";
        String case2 = "()[]{}";
        String case3 = "(]";
        String case4 = "([])";
        String case5 = "({[()]})";
        String case6 = "[{[()()(){}{}]}]";


        assert isValid(case1) : "case1 failed";
        assert isValid(case2) : "case2 failed";
        assert !isValid(case3) : "case3 failed";
        assert isValid(case4) : "case4 failed";
        assert isValid(case5) : "case5 failed";
        assert isValid(case6) : "case6 failed";

        System.out.println("All tests passed.");
    }

}
