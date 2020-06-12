package com.liuliuge.leetcode;

import java.util.HashSet;

/**
 * DESCRIPTION:
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <br/>
 *
 * @author liuliuge
 * @Date: 2020/6/12 14:43  <br/>
 */
public class Subject03 {

    /**
     * @Function: TODO <br/>
     * @Condition: 假设str不为空 <br/>
     * @Notice: TODO <br/>
     * @Date: 2020/6/12 14:47
     * *
     * @author liuliuge
     */

    public static int lengthOfLongestSubstring(String str) {
        if (str.length() < 2) {
            return str.length();
        }
        char[] charArr = str.toCharArray();
        int length = 1;

        for (int i = 0; i < charArr.length - 1; i++) {
            HashSet set = new HashSet();
            set.add(charArr[i]);
            for (int j = i + 1; j < charArr.length; j++) {
                set.add(charArr[j]);
                if (j - i != set.size() - 1) {
                    break;
                }
            }
            if (set.size() > length) {
                length = set.size();
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("ab"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}
