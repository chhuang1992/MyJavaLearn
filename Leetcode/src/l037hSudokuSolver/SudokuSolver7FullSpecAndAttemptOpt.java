package l037hSudokuSolver;

import java.util.LinkedList;

public class SudokuSolver7FullSpecAndAttemptOpt {

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
				{"...2...63","3....54.1","..1..398.",".......9.","...538...",
				 ".3.......",".263..5..","5.37....8","47...1..."};
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
        solveSpecific(board);
    }
	public static boolean solveSpecific(char[][] board){
		boolean result = false;
		int minCount = 10;
		int markRow =0;
		int markCol =0;
		char[] markChar = null;
		int firstMinBigThan1 = 10;
		char temp ='.';
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(board[i][j] == '.'){
					int count = 0;
					LinkedList<Character> list = new LinkedList<Character>();
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9 for each cell
                    	if(isValid(board, i, j, c)){
                            count++;
                            if(count==1){
                            	temp = c;
                            	list = new LinkedList<Character>();
                            	list.add(temp);
                            }else if(count>1){
                            	list.add(c);                           	
                            }
                    	}
                    }
                    minCount = Math.min(minCount, count);
                    if(count==0){
                    	result = false;
                    	return result;
                    }
                    if(count==1){
                    	board[i][j] = temp;
                    }
                    if(count>1&&count<firstMinBigThan1){
                    	firstMinBigThan1 = count;
                    	markRow = i;
                    	markCol = j;
                    	markChar = new char[count];
                    	for(int k=0;k<count;++k){
                    		markChar[k] = list.removeFirst();
                    	}
                    }
				}
			}
		}
		if(minCount == 10){
			result = true;
			return result;
		}
		else if(minCount==1){
			return solveSpecific(board);
		}else{
			char[][] copyBoard = new char[9][9];
			for(int k1 = 0; k1 < 9; k1++){
				for(int k2 = 0; k2 < 9; k2++){
					copyBoard[k1][k2]=board[k1][k2];
				}
			}
            for(char c : markChar){
            	board[markRow][markCol] = c;
        		boolean solved = solveSpecific(board);
        		if(solved){
        			result=true;
        			return result;
        		}else{
        			for(int k1 = 0; k1 < 9; k1++){
            			for(int k2 = 0; k2 < 9; k2++){
            				board[k1][k2]=copyBoard[k1][k2];
            			}
            		}
        		}
            }
            result = false;
            return result;
		}
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
