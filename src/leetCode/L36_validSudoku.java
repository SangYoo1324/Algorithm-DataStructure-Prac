package leetCode;

import java.util.HashSet;
import java.util.Set;

public class L36_validSudoku {
    public static void main(String[] args) {

        // int[row][column]
        char[][] arr = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        Set<Character> test = new HashSet<>();

    }
}

class Solution36 {
    public boolean isValidSudoku(char[][] board) {

        Set<String> dupChecker = new HashSet<>();

        //row dup chk
        for(int j=0; j<9; j++) {
            for (int i = 0; i <9; i++) {
                if(board[j][i] != '.'){

                    if(!dupChecker.add(i+" row "+board[j][i]) ||
                            !dupChecker.add(j+" column "+"" + board[j][i]) ||
                            !dupChecker.add(i/3+ "-"+j/3 +" "+board[j][i])
                    )
                        return false;

                }


            }
        }

        return true;
    }
}
