package leetcode.solution.arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int validElementsPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[validElementsPointer] = nums[i];
                validElementsPointer++;
            }
        }

        return validElementsPointer;
    }

    public static void main(String[] args) {
        int[] n1 = new int[]{4, 5};
        int[] n2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(n1, 5));
    }
}
