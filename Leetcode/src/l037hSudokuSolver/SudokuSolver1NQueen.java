package l037hSudokuSolver;

import java.util.LinkedList;

public class SudokuSolver1NQueen {

	/**
	 @input ["53..7....","6..195...",".98....6.","8...6...3","4..8.3..1",
	 "7...2...6",".6....28.","...419..5","....8..79"]
	 @output ["534678912", "672195348", "198342567", "859761423", "426853791", 
	 "713924856", "961537284", "287419635", "345286179"]
	 
	 @input ["..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",
	 ".98...3..","...8.3.2.","........6","...2759.."]
	 @output ["519748632","783652419","426139875","357986241","264317598",
	 "198524367","975863124","832491756","641275983"]
	 */
	
	public static void main(String[] args) {
		String[] s = new String[]
				{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",
				 ".98...3..","...8.3.2.","........6","...2759.."};
		char[][] board = new char[9][9];
		for(int i=0;i<9;i++){
			board[i] = s[i].toCharArray(); 
		}
		solveSudoku(board);
		LinkedList<String> str = new LinkedList<String>();
		for(int i=0;i<9;i++){
			str.add(new String(board[i]));
		}
		System.out.println(str);
	}
	public static void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return;
        solve(board);
    }
    
    public static boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9 for each cell
                        if(isValid(board, i, j, c)){
                            board[i][j] = c; //Put c for this cell
                            
                            if(solve(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isValid(char[][] board, int i, int j, char c){
        //Check colum
        for(int row = 0; row < 9; row++)
            if(board[row][j] == c)
                return false;
                
        //Check row
        for(int col = 0; col < 9; col++)
            if(board[i][col] == c)
                return false;
                
        //Check 3 x 3 block
        for(int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
            for(int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                if(board[row][col] == c)
                    return false;
        return true;
    }

}
