import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Maximum frequency
        int maxFreq = 0;

        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Total elements having maximum frequency
        int ans = 0;

        for (int freq : map.values()) {
            if (freq == maxFreq) {
                ans += freq;
            }
        }

        return ans;
    }
}