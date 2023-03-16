package com.java.list;

/**
 * @author MXK
 * @version 1.0
 * @description 移除元素 快慢指针
 * @date 2023/3/16 21:19
 */

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length - 1; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}

    