package com.example.pack101to200;

import com.example.RandomListNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by majie on 16/7/5.
 */
public class CopyWithRandomList {

    /**
     * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
     * <p/>
     * Return a deep copy of the list.
     *
     * @param head
     * @return
     */
    public static RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode, Integer> map = new HashMap<RandomListNode, Integer>();
        ArrayList<RandomListNode> list = new ArrayList<RandomListNode>();

        int dex = 0;
        RandomListNode node = head;
        while (node != null) {
            RandomListNode index = new RandomListNode(node.label);
            index.random = node.random;
            list.add(index);
            map.put(node, dex);
            dex++;
            node = node.next;
        }

        for (int i = 0; i < list.size(); i++) {
            //next
            list.get(i).next = (i + 1 == list.size()) ? null : list.get(i + 1);
            //random
            RandomListNode listNode = list.get(i).random;
            if (listNode != null) {
                list.get(i).random = list.get(map.get(listNode));
            }
        }

        return list.isEmpty() ? null : list.get(0);

    }
}
