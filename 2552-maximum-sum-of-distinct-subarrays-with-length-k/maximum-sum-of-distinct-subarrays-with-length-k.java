class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long max = 0;

        HashMap<Integer, Integer> map = new HashMap<>(k * 2);

        int distinct = 0;

        // First window
        for (int i = 0; i < k; i++) {

            int num = nums[i];

            if (!map.containsKey(num)) {
                map.put(num, 1);
                distinct++;
            } else {
                map.put(num, map.get(num) + 1);
            }

            sum += num;
        }

        if (distinct == k) {
            max = sum;
        }

        // Sliding window
        for (int right = k; right < nums.length; right++) {

            int add = nums[right];
            int remove = nums[right - k];

            // Add
            if (!map.containsKey(add)) {
                map.put(add, 1);
                distinct++;
            } else {
                map.put(add, map.get(add) + 1);
            }

            sum += add;

            // Remove
            int count = map.get(remove);

            if (count == 1) {
                map.remove(remove);
                distinct--;
            } else {
                map.put(remove, count - 1);
            }

            sum -= remove;

            // All k elements are distinct
            if (distinct == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}