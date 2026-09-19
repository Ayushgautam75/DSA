import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum and maximum
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Range size
        boolean[] present = new boolean[max - min + 1];

        // Mark elements
        for (int num : nums) {
            present[num - min] = true;
        }

        // Find missing elements
        for (int i = 0; i < present.length; i++) {

            if (!present[i]) {
                ans.add(i + min);
            }
        }

        return ans;
    }
}