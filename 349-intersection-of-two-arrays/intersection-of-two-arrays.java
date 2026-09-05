import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            s2.add(num);
        }

        Set<Integer> result = new HashSet<>();

        for (int num : s1) {
            if (s2.contains(num)) {
                result.add(num);
            }
        }

        int[] res = new int[result.size()];
        int k = 0;

        for (int num : result) {
            res[k] = num;
            k++;
        }

        return res;
    }
}