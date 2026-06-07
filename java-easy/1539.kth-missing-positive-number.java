/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> missed = new ArrayList<>(k);

        Set<Integer> sorted = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        int i = 1;
        while (missed.size() < k) {
            if (!sorted.contains(i))
                missed.add(i);
            i++;
        }

        return missed.get(k - 1);
    }
}
// @lc code=end

