class NumArray {

    int[] Prefix;

    public NumArray(int[] nums) {

        Prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            Prefix[i + 1] = Prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        return Prefix[right + 1] - Prefix[left];
    }
}