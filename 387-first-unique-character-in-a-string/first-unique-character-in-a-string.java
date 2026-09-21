// class Solution {
//     public int firstUniqChar(String s) {

//         int[] freq = new int[26];

       
//         for (char ch : s.toCharArray()) {
//             freq[ch - 'a']++;
//         }

//         for (int i = 0; i < s.length(); i++) {
//             if (freq[s.charAt(i) - 'a'] == 1) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }
// // class Solution {
// //     public int firstUniqChar(String s) {
// //         for (int i = 0; i < s.length(); i++) {
// //             int count = 0;
// //             for (int j = 0; j < s.length(); j++) {
// //                 if (s.charAt(i) == s.charAt(j)) {
// //                     count++;
// //                 }
// //             }
// //             if (count == 1) {
// //                 return i;
// //             }
// //         }
// //         return -1;
// //     }
// // }

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: frequency count
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: first character whose frequency is 1
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
}