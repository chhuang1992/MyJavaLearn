package l015m3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum2Sort {
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
		List<List<Integer>> results = new ArrayList<>();
		//List<Integer> result = new ArrayList<>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			if(i==0||(i>0&&nums[i]!=nums[i-1])){
				int lo=i+1,hi=nums.length-1,target=0-nums[i];
				while(lo<hi){
					if(nums[lo]+nums[hi]==target){
						results.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
						while(lo<hi&&nums[lo]==nums[lo+1]) lo++;
						while(lo<hi&&nums[hi]==nums[hi-1]) hi--;
						lo++;hi--;
					}
					else if(nums[lo]+nums[hi]<target) lo++;
					else hi--;
				}
			}
		}
		return results;
	}
}
