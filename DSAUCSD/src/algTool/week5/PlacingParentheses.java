package algTool.week5;

import java.util.Scanner;

/**
MinAndMax ( i , j )
min ← +∞
max ← −∞
for k from i to j − 1:
	a ← M (i , k ) opk M (k + 1 , j )
	b ← M (i , k ) opk m (k + 1 , j )
	c ← m (i , k ) opk M (k + 1 , j )
	d ← m (i , k ) opk m (k + 1 , j )
	min ← min (min , a , b , c , d )
	max ← max (max , a , b , c , d )
return (min , max )

Parentheses ( d1 op1 d2 op2 . . . dn )
for i from 1 to n:
	m (i , i ) ← di, M (i , i ) ← di
for s from 1 to n − 1:
	for i from 1 to n − s:
		j ← i + s
		m (i , j ) , M (i , j ) ← MinAndMax (i , j )
return M (1 , n )
 */
public class PlacingParentheses {
    private static long getMaximValue(String exp) {
      //write your code here
    	int n = exp.length()/2;  //n is op number;n+1 is digit number;
    	long[] digit = new long[n+1];
    	char[] op = new char[n];
    	for(int i=0;i<=n;++i){
    		digit[i]=Integer.parseInt(""+exp.charAt(2*i));
    	}
    	for(int i=0;i<n;++i){
    		op[i]=exp.charAt(2*i+1);
    	}
    	long[][] M = new long[n+1][n+1];
    	long[][] m = new long[n+1][n+1];
    	for(int i=0;i<=n;++i){
    		M[i][i]=digit[i];
    		m[i][i]=digit[i];
    	}
    	
    	for(int s=1;s<=n;++s){
    		for(int i=0;i<=n-s;++i){
    			int j=i+s;
    			long min = Long.MAX_VALUE;
    			long max = Long.MIN_VALUE;
    			for(int k=i;k<j;++k){
    				long a= eval(M[i][k],M[k+1][j],op[k]);
    				long b= eval(M[i][k],m[k+1][j],op[k]);
    				long c= eval(m[i][k],M[k+1][j],op[k]);
    				long d= eval(m[i][k],m[k+1][j],op[k]);
    				max =Math.max(max, Math.max(Math.max(a, b),Math.max(c, d)));
    				min =Math.min(min, Math.min(Math.min(a, b),Math.min(c, d)));
    			}
    			M[i][j] = max;
    			m[i][j] = min;
    		}
    	}
    	for(int i=0;i<=n;i++){
    		for(int j=0;j<=n;j++){
    			System.out.print(m[i][j]+"\t");
    		}
    		System.out.print("\n");
    	}
    	System.out.print("\n");
    	for(int i=0;i<=n;i++){
    		for(int j=0;j<=n;j++){
    			System.out.print(M[i][j]+"\t");
    		}
    		System.out.print("\n");
    	}
      return M[0][n];
    }

	private static long eval(long a, long b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            assert false;
            return 0;
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String exp = scanner.next();
        System.out.println(getMaximValue(exp));
    }
}

