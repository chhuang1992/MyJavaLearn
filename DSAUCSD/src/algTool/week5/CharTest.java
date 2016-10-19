package algTool.week5;

import java.util.ArrayList;
import java.util.HashMap;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='1';
		
		Character ch = a;
		String str = ch.toString();
		String b = ""+a;
		
		int c;
		c=Integer.parseInt(b);
		System.out.println(b);
		System.out.println(c);
		int e = Integer.parseInt(str);
		System.out.println(str);
		System.out.println(e);
		
		String d = "12645";
		int f= Integer.getInteger(d, 3);
		System.out.println(f);
		
		String exp = "5-8+7*4-8+9";
		int n = exp.length()/2;  //n is op number;n+1 is digit number;
		System.out.println(n);
    	long[] digit = new long[n+1];
    	char[] op = new char[n];
    	for(int i=0;i<=n;++i){
    		digit[i]=Integer.parseInt(""+exp.charAt(2*i));
    		System.out.print(digit[i]);
    	}
    	for(int i=0;i<n;++i){
    		op[i]=exp.charAt(2*i+1);
    		System.out.print(op[i]);
    	}
    	
    	 HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
         ArrayList<Integer> sequence = new ArrayList<Integer>();
         sequence.clear();
         sequence.add(1);
         System.out.println(sequence.get(0));
         map.put(1, sequence);
         System.out.println(map.get(1).size());
         
         sequence.clear();        
         sequence.add(1);
         sequence.add(2);
         map.put(2, sequence);
         System.out.println(sequence.get(1));
         sequence.clear();
         sequence = map.get(2);
         System.out.println(sequence.size());
         
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
         sequence.clear();  //it will also clear map's ArrayList<Integer>
         sequence = map.get(6);
         //Integer index=6;
         //System.out.println(map.get(index).get(1)); so it will be wrong
	}

}
