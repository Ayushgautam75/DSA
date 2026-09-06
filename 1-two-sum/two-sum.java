class Solution {
    public int[] twoSum(int[] arr, int x) {

        int[] ans = new int[2];
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            boolean flag = false;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == x) {
                    ans[0] = i;
                    ans[1] = j;

                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }
        }

        return ans;
    }
}