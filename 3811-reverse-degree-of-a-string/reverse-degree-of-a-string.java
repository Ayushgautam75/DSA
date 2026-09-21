class Solution {
    public int reverseDegree(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // normal alphabet position
            int pos = ch - 'a' + 1;

            // reverse degree
            int reverse = 26 - pos + 1;

            // position in string
            int index = i + 1;

            sum = sum + (reverse * index);
        }

        return sum;
    }
}