package com.seeyiseeya.dsa.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LC001_TwoSum {

    /**
     * https://leetcode.cn/problems/two-sum/description/
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
     * 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * <p>
     * 考察点：
     * 1 利用哈希表进行高效查找的思维
     * 2 空间换时间的优化思想
     *
     * @param nums   整数数组
     * @param target 目标值
     * @return 返回两个整数的数组下标
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
