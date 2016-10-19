package l039CombinationSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		
		int[] candidates = new int[]{2,3,6,7};
		int target = 7;
		System.out.println(combinationSum(candidates,target));
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new LinkedList<List<Integer>>();
        if(candidates==null||candidates.length==0)
            return results;
        Arrays.sort(candidates);
        if(candidates[0]>target)
        	return results;
        results = findNums(candidates, target);
        return results;
    }
	public static List<List<Integer>> findNums(int[] candidates, int target){
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		if(candidates==null||candidates.length==0)
            return results;
		if(candidates[0]>target) 
            return results;
		if(candidates.length==1){
			if(target%candidates[0]==0){
				int n = target/candidates[0];
				List<Integer> result = new LinkedList<Integer>();
        		for(int j=0;j<n;j++){
        			result.add(candidates[0]);
        		}
        		results.add(result);
        		return results;
			}
		}
        int idx = -1;
        int lo=0;
        int hi=candidates.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2+1;
            if(candidates[mid]==target){
                idx=mid;
                break;
            }
            if(candidates[mid]>target)
                hi=mid-1;
            else
                lo=mid;
        }
        if(idx == -1){
            idx=lo;
        }
        
        for(int i=idx;i>=1;--i){
        	if(target%candidates[i]==0){
        		int n = target/candidates[i];
        		List<Integer> result = new LinkedList<Integer>();
        		for(int j=0;j<n;j++){
        			result.add(candidates[i]);
        		}
        		results.add(result);
        		if(n>1){
        			for(int j=n-1;j>0;j--){
        				int[] candidatesSub = new int[i];
        				for(int k=0;k<i;k++){
        					candidatesSub[k]=candidates[k];
        				}
        				List<Integer> resultSub = new LinkedList<Integer>();
        				for(int k=0;k<j;k++){
        					resultSub.add(candidates[i]);
        				}
        				List<List<Integer>> resultsSub = findNums(candidatesSub,target-j*candidates[i]);
        				if(resultsSub!=null){
        					merge(resultSub,resultsSub);
        					results.addAll(resultsSub);
        				}
        			}
        		}
        	}else{
        		int n = target/candidates[i];
        		if(n>0){
        			for(int j=n;j>0;j--){
        				int[] candidatesSub = new int[i];
        				for(int k=0;k<i;k++){
        					candidatesSub[k]=candidates[k];
        				}
        				List<Integer> resultSub = new LinkedList<Integer>();
        				for(int k=0;k<j;k++){
        					resultSub.add(candidates[i]);
        				}
        				List<List<Integer>> resultsSub = findNums(candidatesSub,target-j*candidates[i]);
        				if(resultsSub!=null){
        					merge(resultSub,resultsSub);
        					results.addAll(resultsSub);
        				}
        			}
        		}
        	}
        }
        if(target%candidates[0]==0){
			int n = target/candidates[0];
			List<Integer> result = new LinkedList<Integer>();
    		for(int j=0;j<n;j++){
    			result.add(candidates[0]);
    		}
    		results.add(result);
		}
        return results;
	}
	public static void merge(List<Integer> resultSub, List<List<Integer>> resultsSub){
		for(int i=0;i<resultsSub.size();++i){
			resultsSub.get(i).addAll(0, resultSub);
		}
	}
}
