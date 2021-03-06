package algTool.week3;

import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        //write your code here
        int remainder =n;
        int sum=0;
        for(int i=1;i<n;++i){
        	remainder -= i;
        	if(remainder > i){
        		summands.add(i);
        		sum+=i;
        	} else break;
        }
        summands.add(n-sum);
        
        return summands;
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

