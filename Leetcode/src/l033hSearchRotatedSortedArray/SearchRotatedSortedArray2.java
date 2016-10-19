package l033hSearchRotatedSortedArray;

public class SearchRotatedSortedArray2 {

	public static void main(String[] args) {
		int[] nums = new int[]{4,5,6,7,0,1,2};
		int target = 1;
		System.out.println(search(nums,target));
	}
	public static int search(int[] nums, int target) {
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
        lo=0; hi=len-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int realmid=(mid+rot)%len;
            if(nums[realmid]==target)return realmid;
            if(nums[realmid]<target)lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }
}
