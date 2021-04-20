package com.gujialong.strStr;

public class strStr {

    //实现 strStr() 函数。
    //给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
    public int strStr(String haystack, String needle)
    {
        if (haystack.length() == 0 || needle.length() == 0) return 0;
        char[] main = haystack.toCharArray(), from = needle.toCharArray();
        int postion = 0;
        for (int i = 0; i < main.length; i++) {
            if (main[i] == from[0]) {
                postion = i;
                for (int j = 1; j < from.length; j++) {
                    if (main[i+j] != from[j]) {
                        postion = 0;
                    }
                }
                if (postion != 0) return postion;
            }
        }
        return postion;
    }
}
