package com.example.package401to500;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/12/9.
 */

public class FrogJump {

    /**
     * A frog is crossing a river. The river is divided into x units and at each unit there may or may not exist a stone.
     * The frog can jump on a stone, but it must not jump into the water.
     * <p>
     * Given a list of stones' positions (in units) in sorted ascending order, determine if the frog is able to cross the river by landing on the last stone.
     * Initially, the frog is on the first stone and assume the first jump must be 1 unit.
     * <p>
     * If the frog's last jump was k units, then its next jump must be either k - 1, k, or k + 1 units. Note that the frog can only jump in the forward direction.
     * <p>
     * Note:
     * <p>
     * The number of stones is ≥ 2 and is < 1,100.
     * Each stone's position will be a non-negative integer < 231.
     * The first stone's position is always 0.
     * Example 1:
     * <p>
     * [0,1,3,5,6,8,12,17]
     * <p>
     * There are a total of 8 stones.
     * The first stone at the 0th unit, second stone at the 1st unit,
     * third stone at the 3rd unit, and so on...
     * The last stone at the 17th unit.
     * <p>
     * Return true. The frog can jump to the last stone by jumping
     * 1 unit to the 2nd stone, then 2 units to the 3rd stone, then
     * 2 units to the 4th stone, then 3 units to the 6th stone,
     * 4 units to the 7th stone, and 5 units to the 8th stone.
     *
     * @param stones
     * @return
     */
    public static boolean canCross(int[] stones) {
        //FIXME get LTE for special cases
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < stones.length; i++) {
            list.add(new ArrayList<Integer>());
        }
        list.get(1).add(1);

        for (int i = 2; i < stones.length; i++) {
            for (int j = 0; j < list.get(i - 1).size(); j++) {
                int step = list.get(i - 1).get(j);
                if (judge(stones[i], step, stones[i - 1])) {
                    list.get(i).add(stones[i] - stones[i - 1]);
                }
            }
        }

        return !list.get(list.size() - 1).isEmpty();
    }

    private static boolean judge(int target, int step, int source) {
        return target < step + source + 2 && target > source + step - 2;
    }
}
