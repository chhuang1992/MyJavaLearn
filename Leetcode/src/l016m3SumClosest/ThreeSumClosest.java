package l016m3SumClosest;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] = scanner.nextInt();
		}
		int target = scanner.nextInt();
		int result = threeSumClosest(nums,target);
		System.out.println(result);
	}
	
	public static int threeSumClosest(int[] nums, int target) {
        if(nums.length<3)
        	throw new IllegalArgumentException("No three numbers");
		Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        int len = nums.length;
		for(int i=0;i<len-2;i++){
			if(i==0||(i>0&&nums[i]!=nums[i-1])){
				int lo=i+1,hi=len-1;
				while(lo<hi){
					if(nums[i]+nums[lo]+nums[hi]==target){
						return target;
					}
					if(Math.abs(nums[i]+nums[lo]+nums[hi]-target)<Math.abs(closest-target)){
						closest = nums[i]+nums[lo]+nums[hi];
					}
					while(lo<hi&&nums[lo]==nums[lo+1]) lo++;
					while(lo<hi&&nums[hi]==nums[hi-1]) hi--;
					if(nums[lo]+nums[hi]<target-nums[i]) lo++;
					else hi--;
				}
			}
		}
        
        return closest;
    }
}
