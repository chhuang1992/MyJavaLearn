package algTool.week5;

import java.util.*;

public class PrimitiveCalculator {
    private static ArrayList<Integer> optimal_sequence(int n) {
        /**
         * greedy algorith,but its not safe move;
         * examples
         * 10: 1->2->4->5->10  4 step  (greedy);
         * the optimal: 10: 1->3->9->10   3 step;
         * 28: 28->14->7->6->2->1   5 step  (greedy);
         * the optimal: 28: 1->3->9->27->28   4 step;
         * so we need to use dynamic programming to solve the problem
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        while (n >= 1) {
            sequence.add(n);
            if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
        }
        Collections.reverse(sequence);
        return sequence;
        */
    	
    	/**
    	 * dynamic programing
    	 */
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);
        
        map.put(1, sequence);
        /**
        sequence.clear();        
        sequence.add(1);
        sequence.add(2);
        map.put(2, sequence);
        sequence.clear();
        sequence.add(1);
        sequence.add(3);
        map.put(3, sequence);
        sequence.clear();
        sequence.add(1);
        sequence.add(2);
        sequence.add(4);
        map.put(4, sequence);
        sequence.clear();
        sequence.add(1);
        sequence.add(2);
        sequence.add(4);
        sequence.add(5);
        map.put(5, sequence);
        sequence.clear();
        sequence.add(1);
        sequence.add(2);
        sequence.add(6);
        map.put(6, sequence);
        */
        int min;
        for (int i=2;i<=n;++i){
        	
        	min = Integer.MAX_VALUE;
        	if(i%3==0){
        		if(min>map.get(i/3).size()){
        			min = map.get(i/3).size();
        			
        			/**
        			 * java using ArrayList's reference value
        			 * so we need to create new memory for sequence
        			 * prevent map form being changed.
        			 */
        			sequence = new ArrayList<Integer>();
        			//for(int j=0;j<map.get(i/3).size();++j){
                	//	sequence.add(map.get(i/3).get(j));
                	//}
        			sequence.addAll(map.get(i/3));
        		}
        	}
        	        	
        	if(i%2==0){
        		if(min>map.get(i/2).size()){
        			min = map.get(i/2).size();
        			sequence = new ArrayList<Integer>();
        			sequence.addAll(map.get(i/2));                	
        		}
        	}
        	
        	if(min>map.get(i-1).size()){
        		min = map.get(i-1).size();
            	sequence = new ArrayList<Integer>();
            	sequence.addAll(map.get(i-1));
        	}
        	        	
        	sequence.add(i);
        	map.put(i, sequence);
        	
        }
        return map.get(n);
        
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + "  ");
        }
    }
}

