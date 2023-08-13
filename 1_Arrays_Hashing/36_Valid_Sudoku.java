//Beats 69% in Time and 60% in space
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = null; 
        Set<Character> col = null; 

        for(int i = 0 ; i < 9 ; i++){
            row = new HashSet<>(); 
            col = new HashSet<>(); 
            for(int j = 0 ; j < 9 ; j++){
                char r = board[i][j];
                char c = board[j][i];
                if(r != '.'){
                    if(row.contains(r)) {
                        return false;
                    }
                    else row.add(r);
                }
                if(c != '.'){
                    if(col.contains(c)) {
                        return false;
                    }
                    else col.add(c);
                }
            }
        }

        for(int i = 0 ; i < 9 ; i+=3){
            for(int j = 0 ; j < 9 ; j+=3){
                if(!ingrid(i,j,board)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean ingrid(int idx1, int idx2, char[][] board){
        Set<Character> grid = new HashSet<>(); 
        int row = idx1 + 3;
        int col = idx2 + 3;

        for(int i = idx1 ; i < row ; i++){
            for(int j = idx2 ; j < col ; j++){
                char c = board[i][j];
                if(c == '.') continue;
                if(grid.contains(c)) {
                    return false;
                }
                grid.add(c);
            }
        }

        return true;
    }
}
