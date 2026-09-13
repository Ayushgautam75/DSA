class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long max = 0;

        Map<Integer, Integer> map = new HashMap<>();

        int dups = 0;

        // First window
        for (int i = 0; i < k; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }

            map.put(nums[i], map.get(nums[i]) + 1);

            sum = sum + nums[i];

            if (map.get(nums[i]) > 1) {
                dups++;
            }
        }

        // If first window has no duplicate
        if (dups == 0) {
            max = Math.max(max, sum);
        }

        // Sliding window
        for (int i = k; i < nums.length; i++) {

            int numToAdd = nums[i];
            int numToRemove = nums[i - k];

            // Add new number
            if (!map.containsKey(numToAdd)) {
                map.put(numToAdd, 0);
            }

            map.put(numToAdd, map.get(numToAdd) + 1);

            if (map.get(numToAdd) > 1) {
                dups++;
            }

            sum = sum + numToAdd;

            // Remove old number
            if (map.get(numToRemove) > 1) {
                dups--;
            }

            map.put(numToRemove, map.get(numToRemove) - 1);

            sum = sum - numToRemove;

            // Check distinct window
            if (dups == 0) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}