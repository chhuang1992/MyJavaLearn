package algTool.week3;

import java.util.*;

public class DotProduct {
    private static long minDotProduct(int[] a, int[] b) {
        //write your code here
        long result = 0;
        
        int index,temp;       
        for (int i = 0; i < a.length; i++) {
        	index=i;
            for(int j=i+1;j<a.length; j++){
            	if(a[j]<a[index]){
            		index =j;
            	}
            }
            if(index!=i){
            	temp = a[i];
            	a[i] = a[index];
            	a[index] = temp;
            }
        }
        for (int i = 0; i < b.length; i++) {
        	index=i;
            for(int j=i+1;j<b.length; j++){
            	if(b[j]>b[index]){
            		index =j;
            	}
            }
            if(index!=i){
            	temp = b[i];
            	b[i] = b[index];
            	b[index] = temp;
            }
        }
        
        for (int i = 0; i < a.length; i++){
        	result += a[i]*b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(minDotProduct(a, b));
    }
}

