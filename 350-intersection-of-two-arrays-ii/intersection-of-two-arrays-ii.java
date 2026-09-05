// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {

//         Map<Integer, Integer> map = new HashMap<>();

//         // Frequency count of nums1
//         for (int num : nums1) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         int[] res = new int[Math.min(nums1.length, nums2.length)];
//         int k = 0;

//         // Check nums2
//         for (int num : nums2) {

//             int count = map.getOrDefault(num, 0);

//             if (count == 0) {
//                 continue;
//             }

//             res[k] = num;
//             k++;

//             map.put(num, count - 1);
//         }

//         return Arrays.copyOfRange(res, 0, k);
//     }
// }

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // Smaller array ko nums1 banane ke liye
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();

        // Frequency of nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[nums1.length];
        int k = 0;

        // Traverse nums2
        for (int num : nums2) {

            int count = map.getOrDefault(num, 0);

            if (count == 0) {
                continue;
            }

            res[k++] = num;

            map.put(num, count - 1);
        }

        return Arrays.copyOfRange(res, 0, k);
    }
}