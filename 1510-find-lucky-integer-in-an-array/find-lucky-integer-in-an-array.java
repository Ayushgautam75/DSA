class Solution {
    public int findLucky(int[] arr) {

        int[] freq = new int[501];

        // Frequency count
        for (int num : arr) {
            freq[num]++;
        }

        int ans = -1;

        // Find lucky number
        for (int num = 1; num <= 500; num++) {

            if (freq[num] == num) {
                ans = num;
            }
        }

        return ans;
    }
}