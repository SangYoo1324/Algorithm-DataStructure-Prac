package leetCode;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'a','b','c','s'},
                {'s','f','c','s'},
                {'a','d','e','e'}
        };

        System.out.println(exist(board, "seee"));  // false
        System.out.println(exist(board, "see"));  // true


    }

        public static boolean visited[][];

    /*
   i 세로 j가로
 [  j = column =0   두번째 array   가로
    [a,b,c,e]   i = row = 0  첫번째 array  세로
    [s,f,c,s]   i = row = 1
    [a,d,e,e]
     ]

     abcced return true
     see return true
     abcd return false
     seee return false 근데 visited 로 이미 간 자리 false로 안바꿔주면 true 뜬다
     */


    public static boolean exist(char[][] board, String word){
        int rows = board.length;  // 세로
         int columns = board[0].length;  // 가로
        int index = 0; // 첫글자 0
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                // 첫글자를 찾았고, 상하좌우에서 그 다음 char들을 찾는다면, true를 반환하는 searchword로
                // 재귀해서 쭉 끝 글자까지 찾았으면 true 리턴
                if(word.charAt(index)== board[i][j] && searchWord(i,j,index,word,board)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean searchWord(int i , int j , int index, String word, char[][] board){

        // 0글자인 경우나, index가 word 마지막 글자 index랑 같은 경우 종료
        // word.length-1 = index일때 단어 찾기 성공 했을 경우, 그 다음 재귀에서 word.length == index+1
        // 된거에서 무조건 true를 리턴해줌(모든 글자 다 찾은 후 다음 재귀니까)
        if(index == word.length()) return true;

        // i가 0이하, i가 board.length보다 크고, j가 0이하, j가 board[i].length(두번째array)보다 크고
        // 해당 번째(index)의 글자가 board[i][j] 하고 다르거나, 이미 방문했다면 false 리턴 if재귀문으로 안넘어감
        if(i<0 || i>=board.length || j<0 || j>=board[i].length || word.charAt(index) != board[i][j]
        || visited[i][j]){
            return false;
        }
        // 위에껄 통과했다면, 해당 index 글자가 있다는 뜻이니 해당자리는 search 했어요 표시 해줌
        visited[i][j] = true;
        // 다음 글자 찾으러 ㄱㄱ
        if(     searchWord(i+1, j,  index+1,word, board) ||
                searchWord(i-1, j,  index+1,word, board) ||
                searchWord(i, j+1,  index+1,word, board) ||
                searchWord(i, j-1,  index+1,word, board)){
            //한개라도 있으면 true 리턴(단, 재귀라서 1번이라도 4쪽 다 없는 상황 발생 시 false리턴)
            return true;
        }

        // if문 빠져나왔다는건 word 못찾았다는 뜻이므로 return false 하고 다시 방문 안했다고 바꿔줌
        visited[i][j] = false;
        return false;


    }
}