class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int count = 0;
        int start = 0;

        while (count < n) {
            int idx = start;
            int curr = nums[idx];

            do {
                int next = nums[(idx + k) % n];
                nums[(idx + k) % n] = curr;

                curr = next;
                idx = (idx + k) % n;
                count++;

            } while (idx != start);

            start++;
        }
    }
}