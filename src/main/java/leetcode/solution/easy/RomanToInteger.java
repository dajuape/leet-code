package leetcode.solution.easy;

import java.util.HashMap;
import java.util.SimpleTimeZone;

public class RomanToInteger {


    public static int romanToInt(String s) {
        HashMap<Character, Integer> relations = new HashMap<>();
        {
            relations.put('I', 1);
            relations.put('V', 5);
            relations.put('X', 10);
            relations.put('L', 50);
            relations.put('C', 100);
            relations.put('D', 500);
            relations.put('M', 1000);
        }

        int lastNum = 0;
        int finalNum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentNum = relations.get(s.charAt(i));
            if (currentNum > lastNum || (lastNum == currentNum && (currentNum == 1 || currentNum % 10 ==0))) {
                finalNum += currentNum;
            } else {
                finalNum = (finalNum - currentNum);
            }
            lastNum = currentNum;
        }
        return finalNum;
    }

    public static void main(String[] args) {
        String case1 = "III";
        String case2 = "LVIII";
        String case3 = "MCMXCIV";
        String case4 = "DCXXI";


        assert romanToInt(case1) == 3 : "case1 failed";
        assert romanToInt(case2) == 58 : "case2 failed";
        assert romanToInt(case3) == 1994 : "case3 failed";
        assert romanToInt(case4) == 621 : "case4 failed";

        System.out.println("All tests passed.");
    }
}
