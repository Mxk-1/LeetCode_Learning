package com.mxk.java;

/**
 * @author MXK
 * @version 1.0
 * @description TODO
 * @date 2023/1/28 14:17
 */

import org.junit.Test;

import java.util.*;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target 的那 两个 整数，
 * 并返回它们的数组下标。
 */

public class liang_shu_zhi_he {

    /**
     * 自己写的版本
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (i != j && nums[i] + nums[j] == target) {
                    res = new int[]{i, j};
                }
            }
        }
        return res;
    }

    /**
     * 自己写的版本
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {

        int[] res = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res = new int[]{i, j};
                }
            }
        }
        return res;
    }

    /**
     * LeetCode暴力法
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum3(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 哈希表解法
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum4(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            // 将x插入哈希表中，确保不会让x和自己匹配
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    @Test
    public void testTwoSum() {
        liang_shu_zhi_he lszh = new liang_shu_zhi_he();
        int[] res = lszh.twoSum3(new int[]{1, 2, 3, 4}, 4);
        System.out.println(Arrays.toString(res));
    }
}



    