class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int r = 0; r < 9; r = r + 1) {

            for (int c = 0; c < 9; c = c + 1) {

                // If cell is empty
                if (board[r][c] == '.') {
                    continue;
                }

                // Convert character '1'-'9' to index 0-8
                int val = board[r][c] - '1';

                if (rows[r][val] == 1) {
                    return false;
                }
                rows[r][val] = 1;

                if (cols[c][val] == 1) {
                    return false;
                }
                cols[c][val] = 1;

                // Find box number
                int boxIdx = 3 * (r / 3) + (c / 3);

                
                if (boxes[boxIdx][val] == 1) {
                    return false;
                }
                boxes[boxIdx][val] = 1;
            }
        }

        return true;
    }
}