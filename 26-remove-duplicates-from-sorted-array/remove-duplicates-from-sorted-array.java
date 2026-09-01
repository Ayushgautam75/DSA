class Solution {
    public int removeDuplicates(int[] nums){
        int count = 1;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[j-1]) {
                nums[count] = nums[j];
                count++;
            }
        } return count;
    } 

}
