package com.example.pack201to300;

import java.util.HashMap;

/**
 * Created by majie on 16/5/9.
 * Implement a trie with insert, search, and startsWith methods.
 * <p/>
 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.
 */
class TrieNode {
    // Initialize your data structure here.
    public HashMap<Character, TrieNode> map = new HashMap<Character, TrieNode>();
    public boolean marked = false;

    public TrieNode() {
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode next = node.map.get(c);
            if (next == null) {
                next = new TrieNode();
                node.map.put(c, next);
            }
            node = next;
        }
        node.marked = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode next = node.map.get(c);
            if (next == null) {
                return false;
            }
            node = next;
        }
        return node.marked;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            TrieNode next = node.map.get(c);
            if (next == null) {
                return false;
            }
            node = next;
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
