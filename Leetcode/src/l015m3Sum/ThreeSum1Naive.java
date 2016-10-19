package l015m3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum1Naive {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = scanner.nextInt();
		}
		List<List<Integer>> results= new ArrayList<>();
		results = threeSum(nums);
		System.out.println(results);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
        
		/**
        Wrong Answer
		Input:
		[-1,0,1,2,-1,-4]
		Output:
		[[-1,0,1],[-1,2,-1],[0,1,-1]]
		Expected:
		[[-1,-1,2],[-1,0,1]]
         */
		/**
		List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<nums.length-2;i++){
        	for(int j=i+1;j<nums.length-1;j++){
        		for(int k=j+1;k<nums.length;k++){
        			if(nums[i]+nums[j]+nums[k]==0){
        				result = new ArrayList<Integer>();
        				result.add(nums[i]);
        				result.add(nums[j]);
        				result.add(nums[k]);
        				results.add(result);
        			}
        		}
        	}
        }
        return results;
        */
		
		//Time Limit Exceeded
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		List<List<Integer>> sortedResults = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> sortedResult = new ArrayList<Integer>();
        int[] arr = new int[3];
        for(int i=0;i<nums.length-2;i++){
        	for(int j=i+1;j<nums.length-1;j++){
        		for(int k=j+1;k<nums.length;k++){
        			if(nums[i]+nums[j]+nums[k]==0){
        				arr[0]=nums[i];
        				arr[1]=nums[j];
        				arr[2]=nums[k];
        				Arrays.sort(arr);
        				sortedResult = new ArrayList<Integer>();
        				sortedResult.add(arr[0]);
        				sortedResult.add(arr[1]);
        				sortedResult.add(arr[2]);
        				if(!sortedResults.contains(sortedResult)){
        					sortedResults.add(sortedResult);
        					result = new ArrayList<Integer>();
            				result.add(nums[i]);
            				result.add(nums[j]);
            				result.add(nums[k]);
            				results.add(result);
        				}
        			}
        		}
        	}
        }
        return results;
    }
}
