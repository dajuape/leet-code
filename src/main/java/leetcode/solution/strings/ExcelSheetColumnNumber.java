package leetcode.solution.strings;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        columnTitle = columnTitle.trim();
        int result = 0;
        int exp = columnTitle.length() - 1;
        for (char c : columnTitle.toCharArray()) {
            result += (int) ((Character.getNumericValue(c) - 9) * (Math.pow(26, exp)));
            exp--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ABC "));
    }
}
