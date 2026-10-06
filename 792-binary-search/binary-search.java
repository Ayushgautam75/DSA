class Solution {
    public int search(int[] arr, int target) {

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid=(start+end) /2;

        while(start <= end){
            //compare target with midvalue
            if(arr[mid] == target){
                return mid;
            }

            else if(target>arr[mid]){
                //go  to rigth side
                start = mid+1;
            }

            else {
                end = mid -1;
            }
            mid = (start + end)/2;
        }
        return -1;
        
    }
}