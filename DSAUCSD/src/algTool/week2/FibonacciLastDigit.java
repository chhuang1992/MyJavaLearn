package algTool.week2;

import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
    	int[] fibonacci = new int[n+1];
    	fibonacci[0]=0;
    	fibonacci[1]=1;
    	for(int i=2;i<=n;++i){
    		fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
    	}
        return fibonacci[n]%10;
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

