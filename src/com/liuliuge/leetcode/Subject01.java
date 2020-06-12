package com.liuliuge.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * DESCRIPTION:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * <br/>
 *
 * @author liuliuge
 * @Date: 2020/6/12 10:34  <br/>
 */
public class Subject01 {

    /**
     * @Function: 暴力破解 <br/>
     * @Condition: TODO <br/>
     * @Notice: TODO <br/>
     * @Date: 2020/6/12 11:42
     * *
     * @author qihzongju
     */

    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * @Function: hash解法 <br/>
     * @Condition: TODO <br/>
     * @Notice: TODO <br/>
     * @Date: 2020/6/12 12:02
     * *
     * @author liuliuge
     */

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            map.put(num, index++);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return new int[]{-1, -1};
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3, 6, 7, 4, 9};
        printArr(twoSum1(nums, 15));
        printArr(twoSum2(nums, 15));
    }

}
