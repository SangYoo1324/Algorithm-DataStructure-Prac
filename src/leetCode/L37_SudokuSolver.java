package leetCode;

public class L37_SudokuSolver {
    public static void main(String[] args) {

    }
}

class Solution37 {
    public void solveSudoku(char[][] board) {
        backtrack(board, 0);
    }

    public boolean backtrack(char[][] board, int idx){
        if(idx == 81) return true;
        int row = idx /9;
        int col = idx%9;
        char cur = board[row][col];
        // 숫자가 존재
        if(cur != '.'){
            return backtrack(board, idx+1);
        }else { // 빈 공간
        for(int i = 1; i<=9; i++){

        }
        }

        return true;
    }
}
