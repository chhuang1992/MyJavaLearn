package l040mCombinationSum2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		
		/*int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
		int target = 8;*/
		int[] candidates = new int[]{1, 2};
		int target = 1;
		System.out.println(combinationSum(candidates,target));
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new LinkedList<List<Integer>>();
        int len = candidates.length;
        if(candidates==null||candidates.length==0)
            return results;
        Arrays.sort(candidates);
        if(candidates[0]>target)
        	return results;
        int end = len-1;
        results = findNums(candidates, end, target);
        return results;
    }
	public static List<List<Integer>> findNums(int[] candidates, int end, int target){
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		if(candidates==null||candidates.length==0)
            return results;
		if(candidates[0]>target) 
            return results;
		if(target==candidates[0]){
			List<Integer> result = new LinkedList<Integer>();
    		result.add(candidates[0]);
    		results.add(result);
    		return results;
		}
        int lo=0;
        int hi=end;
        while(lo<hi){
            int mid = (lo+hi)/2+1;
            if(candidates[mid]>target)
                hi=mid-1;
            else
                lo=mid;
        }
        int idx=lo;
        for(int i=idx;i>=1;--i){
        	if(i<idx&&candidates[i]==candidates[i+1])
        		continue;
        	if(target==candidates[i]){
        		List<Integer> result = new LinkedList<Integer>();
        		result.add(candidates[i]);
        		results.add(result);
        	}else{
        		List<Integer> resultSub = new LinkedList<Integer>();
        		resultSub.add(candidates[i]);
        		List<List<Integer>> resultsSub = findNums(candidates,i-1,target-candidates[i]);
        		if(resultsSub!=null){
        			merge(resultSub,resultsSub);
        			results.addAll(resultsSub);
        		}        	
        	}
        }
        return results;
	}
	public static List<List<Integer>> findNumsSpecific(int[] candidates, int idx, int target) {
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		if(candidates==null||candidates.length==0)
            return results;
		if(candidates[0]>target) 
            return results;
		if(target==candidates[0]){
			List<Integer> result = new LinkedList<Integer>();
    		result.add(candidates[0]);
    		results.add(result);
    		return results;
		}
		for(int i=idx;i>=1;--i){
        	if(i<idx&&candidates[i]==candidates[i+1])
        		continue;
        	if(target==candidates[i]){
        		List<Integer> result = new LinkedList<Integer>();
        		result.add(candidates[i]);
        		results.add(result);
        	}else{
        		List<Integer> resultSub = new LinkedList<Integer>();
        		resultSub.add(candidates[i]);
        		List<List<Integer>> resultsSub = findNums(candidates,i-1,target-candidates[i]);
        		if(resultsSub!=null){
        			merge(resultSub,resultsSub);
        			results.addAll(resultsSub);
        		}        	
        	}
        }
        return results;
	}
	public static void merge(List<Integer> resultSub, List<List<Integer>> resultsSub){
		for(int i=0;i<resultsSub.size();++i){
			resultsSub.get(i).addAll(0, resultSub);
		}
	}
}
