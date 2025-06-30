package leetcode.solution.strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int minLength = strs[0].length();

        for (String s : strs) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }

        int pointer = 0;
        char lastChar = '\0';
        StringBuilder result = new StringBuilder();

        while (pointer < minLength) {
            int matchesCounter = 0;
            for (String s : strs) {

                if (lastChar == '\0') {
                    lastChar = s.charAt(pointer);
                    matchesCounter = 1;
                    continue;
                }

                if (lastChar != s.charAt(pointer)) {
                    break;
                } else {
                    matchesCounter++;
                }
            }

            if (matchesCounter == strs.length) {

                result.append(lastChar);

            } else {
                if (pointer == 0) {
                    return "";
                }

                return result.toString();


            }
            lastChar = '\0';
            pointer++;
        }


        return result.toString();
    }


    public static void main(String[] args) {
        String[] case1 = new String[]{"flower", "flow", "flight"};

        String[] case2 = new String[]{"dog", "racecar", "car"};


        assert longestCommonPrefix(case1).equals("fl") : "case1 failed";

        assert longestCommonPrefix(case2).isBlank() : "case2 failed";


        System.out.println("All tests passed.");
    }
}
