package com.example.pack301to400;

import com.example.NestedInteger;

import java.util.Iterator;
import java.util.List;

/**
 * Created by majie on 16/6/12.
 */
public class NestedIterator implements Iterator<Integer> {
    List<NestedInteger> list;
    int index;

    public NestedIterator(List<NestedInteger> nestedList) {
        list = nestedList;
        index = 0;
    }

    private void flatten(List<NestedInteger> nestedList, int index) {
        for (int i = nestedList.size() - 1; i > -1; i--) {
            list.add(index, nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        index++;
        return list.get(index - 1).getInteger();
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            while (!list.get(index).isInteger()) {
                flatten(list.get(index).getList(), index);
            }
            return true;
        } else {
            return false;
        }
    }

    //Not for the problem
    @Override
    public void remove() {

    }
}
