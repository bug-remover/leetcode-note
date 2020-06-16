package com.liuliuge.leetcode;

/**
 * DESCRIPTION:
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * <p>
 *
 * @author liuliuge
 * @Date: 2020/6/12 18:30  <br/>
 */
public class Subject07 {

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int i = x % 10;
            result = result * 10 + i;
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(324));
        System.out.println(reverse(12));
        System.out.println(reverse(12346));
    }
}
