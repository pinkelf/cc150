package com.example.pack201to300;

import java.util.Iterator;

/**
 * Given an Iterator class interface with methods: next() and hasNext(), design and implement a PeekingIterator that support the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().
 * <p/>
 * Here is an example. Assume that the iterator is initialized to the beginning of the list: [1, 2, 3].
 * <p/>
 * Call next() gets you 1, the first element in the list.
 * <p/>
 * Now you call peek() and it returns 2, the next element. Calling next() after that still return 2.
 * <p/>
 * You call next() the final time and it returns 3, the last element. Calling hasNext() after that should return false.
 * Created by majie on 16/6/17.
 */
public class PeekingIterator implements Iterator<Integer> {
    Integer next;
    boolean isNext;
    Iterator<Integer> iter;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        isNext = false;
        next = null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (!isNext) {
            isNext = true;
            next = iter.next();
        }
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (isNext) {
            isNext = false;
            return next;
        } else {
            return iter.next();
        }
    }

    @Override
    public void remove() {
    }

    @Override
    public boolean hasNext() {
        if (isNext) {
            return true;
        } else {
            return iter.hasNext();
        }
    }
}