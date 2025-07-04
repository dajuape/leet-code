package leetcode.solution.arrays;

import leetcode.solution.util.TestUtils;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            }else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while(p2>=0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }


        System.out.println(TestUtils.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}
