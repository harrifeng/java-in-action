package org.hfeng.oj.leet.gasstation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int leftGas = 0;
        int sum = 0;
        int startPoint = 0;
        for (int i = 0; i < gas.length; i++) {
            leftGas += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            // sum should be bigger than Zero at the very first round.
            if (sum < 0) {
                // Failed here, hope startPoint can be next one.
                startPoint = i + 1;
                sum = 0;
            }
        }
        return leftGas >= 0 ? startPoint : -1;
    }
}
