package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/6/12.
 */
public class NestedInteger {
    private List<NestedInteger> list = new ArrayList<NestedInteger>();
    private int num = 0;

    public boolean isInteger() {
        return list.isEmpty();
    }

    public Integer getInteger() {
        return num;
    }

    public List<NestedInteger> getList() {
        return list;
    }


}
