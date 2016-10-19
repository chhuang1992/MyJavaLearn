package l033hSearchRotatedSortedArray;

public class FindRot {

	public static void main(String[] args) {
		int[] nums = new int[]{10,11,0,1,2,4,5,6,7,8};
		int len = nums.length;
		int lo=0,hi=len-1;
        // find the index of the smallest value using binary search.
        // Loop will terminate since mid < hi, and lo or hi will shrink by at least 1.
        // Proof by contradiction that mid < hi: if mid==hi, then lo==hi and loop would have been terminated.
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>nums[hi]) lo=mid+1;
            else hi=mid;
        }
        int rot = lo;
        System.out.println(rot);
        
        lo=0;hi=len-1;
        while(lo<hi){
            int mid=(lo+hi)/2+1;
            if(nums[mid]<nums[lo]) hi=mid-1;
            else lo=mid;
        }
        rot = lo;
        System.out.println(rot);
	}

}
