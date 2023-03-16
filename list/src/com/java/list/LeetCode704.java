package com.java.list;

/**
 * @author MXK
 * @version 1.0
 * @description 二分查找 二分查找，数组有序，且无重复元素
 * @date 2023/3/16 20:49
 */

public class LeetCode704 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int search = search(nums, 5);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        // 避免当target小于nums[0] || target > nums[nums.length - 1]时多次循环
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int L = 0, R = nums.length - 1, M;
        while (L <= R) {
            M = (L + R) / 2;
            if (nums[M] == target) {
                return M;
            } else if (nums[M] < target) {
                L = M + 1;
            } else {
                R = M - 1;
            }
        }
        return -1;
    }
}

    