
class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int n = arr.length;

        // Step 1: Increasing order
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Step 2: Peak cannot be first or last
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Step 3: Decreasing order
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 4: Check whether we reached the end
        return i == n - 1;
    }
}
