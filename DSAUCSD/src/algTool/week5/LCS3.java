package algTool.week5;

import java.util.*;

public class LCS3 {

    private static int lcs3(int[] a, int[] b, int[] c) {
        //Write your code here
    	/**
    	 * wrong answer
    	 * example
    	 * a = 1 2 3
    	 * b = 2 1 3
    	 * c = 1 3 5
    	 * the answer should be 2,that is 1 3;
    	 * but this method get ab = 2 3
    	 * then lcs(ab c) = 1
    	 * so we need improve the method
    	int l1 = a.length;
    	int l2 = b.length;
    	int l3 = c.length;
    	int[][] match12 = new int[l1+1][l2+1];
   	 	for(int i=0;i<=l1;++i){
   	 		match12[i][0] = 0;
   	 	}
   	 	for(int j=0;j<=l2;++j){
   	 		match12[0][j] = 0;
   	 	}
   	 	for(int j=1;j<=l2;++j){
   	 		for(int i=1;i<=l1;++i){
   	 			if(a[i-1]==b[j-1]){
   	 				match12[i][j] = 1+match12[i-1][j-1];
   	 			}else{
   	 				match12[i][j] = Math.max(match12[i-1][j], match12[i][j-1]);
   	 			}
   	 		}
   	 	}
   	 	int[] ab = new int[match12[l1][l2]];
   	 	for(int match=1;match<=match12[l1][l2];match++){
   	 		for(int find = 1; find<=l2; find++){
   	 			if(match12[l1][find]==match){
   	 				ab[match-1]=b[find-1];  break;
   	 			}
   	 		}
   	 			
   	 	}
   	 	
   	 	int l12 = ab.length;
   	 	int[][] match123 = new int[l12+1][l3+1];
	 	for(int i=0;i<=l12;++i){
	 		match123[i][0] = 0;
	 	}
	 	for(int j=0;j<=l3;++j){
	 		match123[0][j] = 0;
	 	}
	 	for(int j=1;j<=l3;++j){
	 		for(int i=1;i<=l12;++i){
	 			if(a[i-1]==b[j-1]){
	 				match123[i][j] = 1+match123[i-1][j-1];
	 			}else{
	 				match123[i][j] = Math.max(match123[i-1][j], match123[i][j-1]);
	 			}
	 		}
	 	}
   	 	   	 	
        return match123[l12][l3];
        */
    	
    	/**
    	 * match a b c at the same time
    	 */
    	int l1 = a.length;
    	int l2 = b.length;
    	int l3 = c.length;
    	int[][][] match = new int[l1+1][l2+1][l3+1];
   	 	for(int i=0;i<=l1;++i){
   	 		for(int j=0;j<=l2;++j)
   	 		match[i][j][0] = 0;
   	 	}
   	 	for(int i=0;i<=l1;++i){
	 		for(int k=0;k<=l3;++k)
	 		match[i][0][k] = 0;
	 	}
   	 	for(int j=0;j<=l2;++j){
	 		for(int k=0;k<=l3;++k)
	 		match[0][j][k] = 0;
	 	}
   	 	
   	 	for(int k=1;k<=l3;++k){
   	 		for(int j=1;j<=l2;++j){
   	 			for(int i=1;i<=l1;++i){
   	 				if(a[i-1]==b[j-1]&&a[i-1]==c[k-1]){
   	 					match[i][j][k] = 1+match[i-1][j-1][k-1];
   	 				}else{
   	 					match[i][j][k] = Math.max(Math.max(match[i-1][j][k], match[i][j-1][k]),match[i][j][k-1]);
   	 				}
   	 			}
   	 		}
   	 	}
   	 return match[l1][l2][l3];
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        int[] a = new int[an];
        for (int i = 0; i < an; i++) {
            a[i] = scanner.nextInt();
        }
        int bn = scanner.nextInt();
        int[] b = new int[bn];
        for (int i = 0; i < bn; i++) {
            b[i] = scanner.nextInt();
        }
        int cn = scanner.nextInt();
        int[] c = new int[cn];
        for (int i = 0; i < cn; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println(lcs3(a, b, c));
    }
}

