package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by majie on 16/2/16.
 */
public class ReconstructItinerary {

    /**
     * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.
     * <p>
     * Note:
     * If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string. For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
     * All airports are represented by three capital letters (IATA code).
     * You may assume all tickets form at least one valid itinerary.
     * Example 1:
     * tickets = [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
     * Return ["JFK", "MUC", "LHR", "SFO", "SJC"].
     * Example 2:
     * tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
     * Return ["JFK","ATL","JFK","SFO","ATL","SFO"].
     * Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"]. But it is larger in lexical order.
     *
     * @param tickets
     * @return
     */
    public static List<String> findItinerary(String[][] tickets) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> result = new LinkedList<String>();

        //init hashmap
        for (int i = 0; i < tickets.length; i++) {
            String start = tickets[i][0];
            String end = tickets[i][1];
            List<String> list = map.get(start);
            if (list == null) {
                List<String> value = new ArrayList<String>();
                value.add(end);
                map.put(start, value);
            } else {
                list.add(end);
                Collections.sort(list);
            }
        }

        result.add("JFK");
        checkNext(map, result);
        return result;
    }

    private static boolean checkNext(HashMap<String, List<String>> map, List<String> result) {
        while (!map.isEmpty()) {
            String target = result.get(result.size() - 1);
            List<String> list = map.get(target);
            if (list == null || list.isEmpty()) {
                return false;
            } else if (list.size() == 1) {
                result.add(list.get(0));
                map.remove(target);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    String string = list.get(i);
                    result.add(string);
                    list.remove(string);

                    if (!checkNext(map, result)) {
                        result.remove(result.size() - 1);
                        list.add(string);
                        Collections.sort(list);
                    }
                }
            }
        }
        return true;
    }
}
