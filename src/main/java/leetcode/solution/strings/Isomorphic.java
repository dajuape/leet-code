package leetcode.solution.strings;

import java.util.HashMap;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        int[] sMapping = new int[s.length()];
        int[] tMapping = new int[t.length()];

        int pointer = 0;
        int sDigit = 0;
        int tDigit = 0;
        while (pointer < s.length()) {
            char sChar = s.charAt(pointer);
            char tChar = t.charAt(pointer);

            if (!sMap.containsKey(sChar)) {
                sMapping[pointer] = sDigit;
                sMap.put(sChar, sDigit);
                sDigit++;
            } else {
                sMapping[pointer] = sMap.get(sChar);
            }

            if (!tMap.containsKey(tChar)) {
                tMapping[pointer] = tDigit;
                tMap.put(tChar, tDigit);
                tDigit++;
            } else {
                tMapping[pointer] = tMap.get(tChar);
            }

            pointer++;
        }
        pointer = 0;
        while (pointer < s.length()) {
            if (sMapping[pointer] != tMapping[pointer]) {
                return false;
            }
            pointer++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }
}
