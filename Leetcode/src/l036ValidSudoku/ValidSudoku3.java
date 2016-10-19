package l036ValidSudoku;

public class ValidSudoku3 {

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
        //from @hsmishka
		int [] vset = new int [9];
	    int [] hset = new int [9];
	    int [] bckt = new int [9];
	    int idx = 0;
	    for (int i = 0; i < 9; i++) {
	        for (int j = 0; j < 9; j++) {
	            if (board[i][j] != '.') {
	                idx = 1 << (board[i][j] - '0') ;
	                if ((hset[i] & idx) > 0 ||
	                    (vset[j] & idx) > 0 ||
	                    (bckt[(i / 3) * 3 + j / 3] & idx) > 0) 
	                	return false;
	                hset[i] |= idx;
	                vset[j] |= idx;
	                bckt[(i / 3) * 3 + j / 3] |= idx;
	            }
	        }
	    }
	    return true;
    }
}
