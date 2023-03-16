package com.java.list;


/**
 * @author MXK
 * @version 1.0
 * @description TODO
 * @date 2023/3/16 21:27
 */

public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        int fastIndex = 1;
        while (fastIndex < nums.length - 1) {
            if (nums[slowIndex] != nums[fastIndex]) {
                slowIndex++;
            }
            nums[slowIndex] = nums[fastIndex];
        }
        return slowIndex;
    }
}

    