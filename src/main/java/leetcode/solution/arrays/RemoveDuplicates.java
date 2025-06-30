package leetcode.solution.arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {

        int lastNum = nums[0];
        int pointer = 1;
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            if (current != lastNum) {
                lastNum = nums[i];
                nums[pointer] = nums[i];
                pointer++;
            }
        }


        return pointer;
    }

    public static void main(String[] args) {
        int[] n1 = new int[]{1,1,2};
        System.out.println(removeDuplicates(n1));
    }
}
