package algTool.week5;

import java.util.*;

/**
Knapsack ( W )
initialize all value ( 0 , j ) ← 0
initialize all value (w , 0) ← 0
for i from 1 to n:
	for w from 1 to W:
		value(w , i) ← value(w , i − 1)
		if wi ≤ w:
			val ← value(w − wi , i − 1) + vi
			if value(w , i) < val
				value(w , i) ← val
return value(W , n)

Memoization:
Knapsack ( w )
if w is in hash table:
	return value (w )
value (w ) ← 0
for i from 1 to n:
	if wi ≤ w:
		val ← Knapsack (w − wi ) + vi
		if val > value (w ):
			value (w ) ← val
insert value (w ) into hash table with key w
return value (w )
 */
public class Knapsack {
    static int optimalWeight(int W, int[] w) {
        //write you code here
    	/**
        int result = 0;
        for (int i = 0; i < w.length; i++) {
          if (result + w[i] <= W) {
            result += w[i];
          }
        }
        */
    	/**
    	int[] result = new int[W+1];
        result[0]=0;
        int weight = 0;
        List<Integer> _w = new ArrayList<Integer>(w.length);
        for(int i=0;i<w.length;++i){
        	_w.add(w[i]);
        }
        Collections.sort(_w);
        
        for (int i = 1; i <= W; ++i){
        	result[i] = 0;
        	for(int j=0;j<=w.length;++j){
        		if(i==w[j]){
        			result[i]=w[j];
        		}else if(i>w[j]){
        			weight = result[i - w[j]] + w[j];
        		}       	
        	}
        }
        return result[W];
        */
    	int[] v = w.clone();
    	int[][] value = new int[W+1][w.length+1];
    	for(int j=0;j<=w.length;++j){
    		value[0][j]=0;
    	}
    	for(int k=0;k<=W;++k){
    		value[k][0]=0;
    	}
    	int val;
    	for(int i=1;i<=w.length;++i){
    		for(int wt=1;wt<=W;++wt){
    			value[wt][i]=value[wt][i-1];
    			if(w[i-1]<=wt){
    				val = value[wt-w[i-1]][i-1]+v[i-1];
    				if(value[wt][i]<val){
    					value[wt][i]=val;
    				}
    			}
    		}
    	}
    	
    	for(int wt=0;wt<=W;++wt){
    		System.out.print("\t"+wt);
    	}
    	System.out.print("\t\n");
    	for(int i=0;i<=w.length;++i){
    		System.out.print(i+"\t");
    		for(int wt=0;wt<=W;++wt){
    			System.out.print(value[wt][i]+"\t");
    		}
    		System.out.print("\n");
    	}
    	
    	return value[W][w.length];
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

