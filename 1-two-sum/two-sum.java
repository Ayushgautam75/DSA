class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        // Store: number -> index
        for (int i = 0; i < nums.length; i = i + 1) {
            map.put(nums[i], i);
        }

        // Find complement
        for (int i = 0; i < nums.length; i = i + 1) {

            int lookupNumber = target - nums[i];

            if (map.containsKey(lookupNumber) &&
                map.get(lookupNumber) != i) {

                return new int[]{i, map.get(lookupNumber)};
            }
        }

        return new int[]{};
    }
}