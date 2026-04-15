package com.dsa.day3;

public class ShortestDistToTargetArray {

    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int direct = Math.abs(i - startIndex);
                int circular = n - direct;
                int dist = Math.min(direct, circular);
                min = Math.min(min, dist);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;

    }
}
