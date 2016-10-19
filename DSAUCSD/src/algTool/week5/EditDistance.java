package algTool.week5;

import java.util.*;

/**
EditDistance( A[1 . . . n], B[1 . . . m])
D( i, 0) ← i and D(0, j) ← j for all i, j
for j from 1 to m:
	for i from 1 to n:
		insertion ← D(i, j − 1) + 1
		deletion ← D(i − 1, j) + 1
		match ← D(i − 1, j − 1)
		mismatch ← D(i − 1, j − 1) + 1
		if A[i] = B[j]:
			D(i, j) ← min(insertion, deletion, match)
		else:
			D(i, j) ← min(insertion, deletion, mismatch)
return D(n, m)
 */
class EditDistance {
  public static int EditDist(String s, String t) {
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
	 int[][] dist = new int[l1+1][l2+1];
	 for(int i=0;i<=l1;++i){
		 dist[i][0] = i;
	 }
	 for(int j=0;j<=l2;++j){
		 dist[0][j] = j;
	 }
	 for(int j=1;j<=l2;++j){
		 for(int i=1;i<=l1;++i){
			int insertion = dist[i][j - 1] + 1;
			int deletion = dist[i - 1][j] +1;
			int match = dist[i - 1][j - 1];
			int mismatch = dist[i - 1][j - 1] + 1;
			if(ss[i-1]==ts[j-1]){
				dist[i][j] = Math.min(Math.min(insertion, deletion), match);
			}else{
				dist[i][j] = Math.min(Math.min(insertion, deletion), mismatch);
			}
		 }
	 }
	 
	 
    return dist[l1][l2];
  }
  public static void main(String args[]) {
    @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDist(s, t));
  }

}
