package leetcode.mergeSortedArray_88;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        new Solution().merge(nums1, m, nums2, n);
        for (int i: nums1) {
            System.out.println(i);
        }
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++){
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
