class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows and columns
        for (int i = 0; i < 9; i++) {
            HashMap<Character, Integer> rowMap = new HashMap<>();
            HashMap<Character, Integer> colMap = new HashMap<>();
            for (int j = 0; j < 9; j++) {
                // Row check
                if (board[i][j] != '.') {
                    rowMap.put(board[i][j], rowMap.getOrDefault(board[i][j], 0) + 1);
                    if (rowMap.get(board[i][j]) > 1) {
                        return false;
                    }
                }
                // Column check
                if (board[j][i] != '.') {
                    colMap.put(board[j][i], colMap.getOrDefault(board[j][i], 0) + 1);
                    if (colMap.get(board[j][i]) > 1) {
                        return false;
                    }
                }
            }
        }

        // Check 3x3 boxes separately
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashMap<Character, Integer> boxMap = new HashMap<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.') {
                            boxMap.put(board[i][j], boxMap.getOrDefault(board[i][j], 0) + 1);
                            if (boxMap.get(board[i][j]) > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
