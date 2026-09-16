
class Solution {
    public int characterReplacement(String s, int k) {

        int max = 0;

        int i = 0;
        int j = 0;

        int maxC = 0;

        int[] counts = new int[26];

        while (j < s.length()) {

            char c = s.charAt(j);

            counts[c - 'A'] = counts[c - 'A'] + 1;

            maxC = Math.max(maxC, counts[c - 'A']);

            int ops = (j - i + 1) - maxC;

            while (ops > k) {

                char leftChar = s.charAt(i);

                counts[leftChar - 'A'] = counts[leftChar - 'A'] - 1;

                i++;

                ops = (j - i + 1) - maxC;
            }

            max = Math.max(max, j - i + 1);

            j++;
        }

        return max;
    }
}

