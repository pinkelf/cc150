package com.example.pack101to200;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
 * <p/>
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 * <p/>
 * <p/>
 * Created by majie on 16/6/23.
 */
public class LRUCache {
    LinkedHashMap<Integer, Integer> map;

    public LRUCache(final int capacity) {
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.get(key) == null ? -1 : map.get(key);
    }

    public void set(int key, int value) {
        map.put(key, value);
    }
}
