
class Solution {
    public boolean isSubsequence(String s, String t) {

        StringBuilder sb = new StringBuilder(s);

        int j = 0;

        for (int i = 0; i < t.length(); i++) {

            if (j < sb.length() && sb.charAt(j) == t.charAt(i)) {
                j++;
            }

            if (j == sb.length()) {
                return true;
            }
        }

        return sb.length() == 0;
    }
}

