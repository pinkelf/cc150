package com.example.pack1to100;

import com.example.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by majie on 15/12/16.
 */


public class MergeKSortList {
    /**
     * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
     *
     * @param lists
     * @return
     */

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        ListNode result = new ListNode(0);
        ListNode index = result;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.offer(lists[i]);
            }
        }

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            index.next = node;
            index = index.next;
            if (node.next != null) {
                pq.offer(node.next);
            }
        }
        return result.next;
    }

}
