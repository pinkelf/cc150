package com.example.pack101to200;

/**
 * Created by majie on 16/5/6.
 */
public class GasStation {

    /**
     * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
     * <p/>
     * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
     * <p/>
     * Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
     *
     * @param gas
     * @param cost
     * @return
     */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gass = 0;
        int costs = 0;
        for (int i = 0; i < cost.length; i++) {
            gass += gas[i];
            costs += cost[i];
        }
        if (gass < costs) {
            return -1;
        }

        int tank = 0, start = 0;
        for (int i = 0; i < cost.length; i++) {
            tank = tank + gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return start;
    }
}
