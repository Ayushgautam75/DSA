import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. Har number ki frequency count karo
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Frequencies ko Set mein store karo
        HashSet<Integer> set = new HashSet<>();

        for (int freq : map.values()) {

            if (set.contains(freq)) {
                return false;
            }

            set.add(freq);
        }

        return true;
    }
}