package com.liuliuge.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * DESCRIPTION:
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。<br/>
 *
 * @author liuliuge
 * @Date: 2020/6/15 13:42  <br/>
 */
public class Subject09 {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        List<Integer> nums = new ArrayList<>();
        while (x > 0) {
            nums.add(x % 10);
            x = x / 10;
        }
        int index = nums.size() / 2 - 1;
        for (int i = 0; i <= index; i++) {
            if (nums.get(i) != nums.get(nums.size()-1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1121));
        System.out.println(isPalindrome(10));
    }

}
