class Solution {
    public int singleNumber(int[] nums) {

   Map<Integer, Integer> map = new HashMap<>();
//2 2 1
//n
//<{2:1}>
    for(int num : nums){
        if(!map.containsKey(num)){
            map.put(num,0);
        }
        map.put(num, map.get(num)+1);
    }
    for(int num : nums) {
        //Jiski frequency exactly 1 hai, wahi answer hai.
        if(map.get(num) ==1) {
            return num;
        }
    }
    return -1;
   
}
}