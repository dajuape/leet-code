package leetcode.solution.arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {


        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int current = nums[mid];
            if (current == target) {
                return mid;
            }
            if (target < current) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }

    public static void main(String[] args) {
        int[] n = new int[]{1, 3};

        System.out.println(searchInsert(n, 0));
    }
}
