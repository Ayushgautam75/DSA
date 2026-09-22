class Solution {
    public String[] findWords(String[] words) {

        int[] f = new int[26];

        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";

        for (int i = 0; i < a.length(); i++) {
            f[a.charAt(i) - 'a'] = 1;
        }

   
        for (int i = 0; i < b.length(); i++) {
            f[b.charAt(i) - 'a'] = 2;
        }

        for (int i = 0; i < c.length(); i++) {
            f[c.charAt(i) - 'a'] = 3;
        }

        String[] ans = new String[words.length];
        int k = 0;

        for (String word : words) {

            String ch = word.toLowerCase();

            int row = f[ch.charAt(0) - 'a'];
            boolean same = true;

            for (int i = 1; i < ch.length(); i++) {

                if (row != f[ch.charAt(i) - 'a']) {
                    same = false;
                    break;
                }
            }

            if (same) {
                ans[k] = word;
                k++;
            }
        }

        // Exact size ka answer array
        String[] result = new String[k];

        for (int i = 0; i < k; i++) {
            result[i] = ans[i];
        }

        return result;
    }
}