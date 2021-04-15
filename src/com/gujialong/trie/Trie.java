package com.gujialong.trie;

public class Trie {

    class TrieNode {
        Boolean isEnd = false;
        TrieNode[] trieNodes = new TrieNode[26];
    }
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.trieNodes[c - 'a'] == null) {
                cur.trieNodes[c - 'a'] = new TrieNode();
            }
            cur = cur.trieNodes[c - 'a'];
        }
        cur.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.trieNodes[c - 'a'] == null) {
                return false;
            }
            cur = cur.trieNodes[c - 'a'];
        }
        return cur.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (cur.trieNodes[c - 'a'] == null) {
                return false;
            }
            cur = cur.trieNodes[c - 'a'];
        }
        return true;
    }
}
