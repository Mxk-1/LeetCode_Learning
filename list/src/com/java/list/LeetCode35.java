package com.java.list;

/**
 * @author MXK
 * @version 1.0
 * @description 搜索插入位置
 * @date 2023/3/16 21:00
 */

public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        // 定义target在左闭右闭的区间，[low, high]
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return high + 1;
    }
}

    