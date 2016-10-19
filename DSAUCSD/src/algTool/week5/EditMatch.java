package algTool.week5;

import java.util.*;

/**
EditDistance( A[1 . . . n], B[1 . . . m])
D( i, 0) ← 0 and D(0, j) ← 0 for all i, j
for j from 1 to m:
	for i from 1 to n:
		insertion ← D(i, j − 1)
		deletion ← D(i − 1, j)
		match ← D(i − 1, j − 1) + 1
		mismatch ← D(i − 1, j − 1)
		if A[i] = B[j]:
			D(i, j) ← match
		else:
			D(i, j) ← max(insertion, deletion)
return D(n, m)
 */
class EditMatch {
  public static int EditMatching(String s, String t) {
    //write your code here
	 int l1 = s.length();
	 int l2 = t.length();
	 /*String a = "0";
	 String _s = a.concat(s);
	 String _t = a.concat(t);
	 char[] ss = _s.toCharArray();
	 char[] ts = _t.toCharArray();*/
	 char[] ss = s.toCharArray();
	 char[] ts = t.toCharArray();
	 int[][] match = new int[l1+1][l2+1];
	 for(int i=0;i<=l1;++i){
		 match[i][0] = 0;
	 }
	 for(int j=0;j<=l2;++j){
		 match[0][j] = 0;
	 }
	 for(int j=1;j<=l2;++j){
		 for(int i=1;i<=l1;++i){
			if(ss[i-1]==ts[j-1]){
				match[i][j] = 1+match[i-1][j-1];
			}else{
				match[i][j] = Math.max(match[i-1][j], match[i][j-1]);
			}
		 }
	 }
	 
	 
    return match[l1][l2];
  }
  public static void main(String args[]) {
    @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditMatching(s, t));
  }

}
