package com.java.hashtable;

import java.util.HashMap;

/**
 * @author MXK
 * @version 1.0
 * @description 两数之和
 * @date 2023/3/16 20:06
 */

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        // 定义长度为2的空数组
        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }

        // 定义一个map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 遍历当前元素，并在map中寻找是否有匹配的key
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[1] = i;
                res[0] = map.get(temp);
                break;
            }
            // 没有找到匹配，把访问过的元素和下标加入到map中
            map.put(nums[i], i);
        }
        return res;
    }
}

    