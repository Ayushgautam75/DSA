//class Solution {
//     public int singleNumber(int[] nums) {

//    Map<Integer, Integer> map = new HashMap<>();
// //2 2 1
// //n
// //<{2:1}>
//     for(int num : nums){
//         if(!map.containsKey(num)){
//             map.put(num,0);
//         }
//         map.put(num, map.get(num)+1);
//     }
//     for(int num : nums) {
//         //Jiski frequency exactly 1 hai, wahi answer hai.
//         if(map.get(num) ==1) {
//             return num;
//         }
//     }
//     return -1;
   
// }
//Is problem ko XOR se O(1) extra space mein solve kar sakte hai.
//  public int singleNumber(int[] nums) {
//      int ans = 0;

//         for (int num : nums) {
//             ans = ans ^ num;
//         }

//         return ans;
//  }




//  }

class Solution {
    public int singleNumber(int[] nums) {

        int[] f = new int[60001];

        for (int i = 0; i < nums.length; i++) {
            f[nums[i] + 30000]++;
        }

        for (int i = 0; i < f.length; i++) {
            if (f[i] == 1) {
                return i - 30000;
            }
        }

        return -1;
    }

}