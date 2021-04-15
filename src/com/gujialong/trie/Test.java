package com.gujialong.trie;

public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        boolean ishave = trie.search("apple");
        boolean ishave1 = trie.startsWith("pp");
        System.out.println(ishave);
        System.out.println(ishave1);
    }
}
