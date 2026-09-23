class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for(int i =0; i<k;i = i+1){
            sum = sum + nums[i];
        }       
        max = Math.max(max, sum);
        for(int i = k;i<nums.length; i = i+1){
            //expand windowe
            sum = sum + nums[i];
            sum = sum - nums[i-k];
            max = Math.max(max,sum);
        } 
        return max/k;
    }
}