class Solution {

    public int findPivotIndex(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        if (nums[s] <= nums[e]) {
            return 0; // Array is not rotated
        }

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return s; // Index of smallest element
    }

    public int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;

        if (n == 0) {
            return -1;
        }

        int pivotIndex = findPivotIndex(nums);

        if (nums[pivotIndex] <= target && target <= nums[n - 1]) {
            return binarySearch(nums, pivotIndex, n - 1, target);
        } else {
            return binarySearch(nums, 0, pivotIndex - 1, target);
        }
    }
}