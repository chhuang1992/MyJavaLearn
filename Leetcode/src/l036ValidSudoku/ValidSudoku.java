package l036ValidSudoku;

import java.util.HashSet;

public class ValidSudoku {

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
        //from Lorraine921
        for(int i = 0; i<9; i++){
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9;j++){
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }
}
