class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int size = Integer.MAX_VALUE;
        int sum = 0;

        int i = 0;
        int j = 0;

        while (j < nums.length) {

            // window mein right element add
            sum = sum + nums[j];

            // target mil gaya, window ko chhota karo
            while (sum >= target) {

                size = Math.min(size, j - i + 1);

                sum = sum - nums[i];

                i = i + 1;
            }

            j = j + 1;
        }

        // agar koi valid subarray nahi mila
        return size == Integer.MAX_VALUE ? 0 : size;
    }
}