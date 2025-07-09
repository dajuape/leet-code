package leetcode.solution.strings;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        final String cols = "abcdefghijklmnopqrstuvwxyz";

        String rdo = "";
        while (columnNumber > 0) {
            columnNumber--;
            int mod = columnNumber % 26;
            rdo = cols.charAt(mod) + rdo;
            columnNumber /= 26;
        }

        return rdo.toUpperCase();

    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(1));
    }
}
