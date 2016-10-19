package l036ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[]
					{".87654321","2........","3........","4........","5........",
					 "6........","7........","8........","9........"};
		char[][] board = new char[9][9];
		for(int i=0;i<9;i++){
			board[i] = s[i].toCharArray(); 
		}
		System.out.println(isValidSudoku(board));
	}
	public static boolean isValidSudoku(char[][] board) {
	    for (int i=0; i<9; i++) {
	        if (!isParticallyValid(board,i,0,i,8)) return false;
	        if (!isParticallyValid(board,0,i,8,i)) return false;
	    }
	    for (int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            if (!isParticallyValid(board,i*3,j*3,i*3+2,j*3+2)) return false;
	        }
	    }
	    return true;
	}
	private static boolean isParticallyValid(char[][] board, int x1, int y1,int x2,int y2){
	    Set<Character> singleSet = new HashSet<>();
	    for (int i= x1; i<=x2; i++){
	        for (int j=y1;j<=y2; j++){
	            if (board[i][j]!='.') if(!singleSet.add(board[i][j])) return false;
	        }
	    }
	    return true;
	}
}
