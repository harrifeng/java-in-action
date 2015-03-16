package org.hfeng.oj.leet.gasstation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int[] diff = new int[len];

        for (int i = 0; i < len; i++) {
            diff[i] = gas[i] - cost[i];
        }

        int leftGas = 0;
        int sum = 0;
        int startNode = 0;

        for (int i = 0; i < len; i++) {
            leftGas += diff[i];
            sum += diff[i];
            // They must be bigger than Zero at the very first round
            if (sum < 0) {
                startNode = i + 1;
                sum = 0;
            }
        }

        if (leftGas < 0) {
            return -1;
        } else {
            return startNode;
        }
    }
}
