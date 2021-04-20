package com.gujialong.strStr;

public class strStr {

    //实现 strStr() 函数。
    //给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
    public int strStr(String haystack, String needle)
    {
        char[] main = haystack.toCharArray(), from = needle.toCharArray();
        int mainLen = main.length, fromLen = from.length;
        if (fromLen == 0) return 0;
        if (mainLen == 0 || mainLen < fromLen) return -1;
        int postion = -1;
        for (int i = 0; i < mainLen; i++) {
            if (main[i] == from[0]) {
                postion = i;
                for (int j = 1; j < fromLen; j++) {
                    if ((i + j) >= mainLen || main[i+j] != from[j]) {
                        postion = -1;
                        break;
                    }
                }
                if (postion != -1) return postion;
            }
        }
        return postion;
    }
}
