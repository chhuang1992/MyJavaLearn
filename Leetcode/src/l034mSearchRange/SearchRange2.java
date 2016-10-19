package l034mSearchRange;

public class SearchRange2 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,4};
		int target = 4;
		int[] res = searchRange(nums, target);
		System.out.println("["+res[0]+","+res[1]+"]");
		nums = new int[]{5, 7, 7, 8, 8, 10};
		target = 8;
		res = searchRange(nums, target);
		System.out.println("["+res[0]+","+res[1]+"]");
		nums = new int[]{1};
		target = 1;
		res = searchRange(nums, target);
		System.out.println("["+res[0]+","+res[1]+"]");
		nums = new int[]{2, 2};
		target = 2;
		res = searchRange(nums, target);
		System.out.println("["+res[0]+","+res[1]+"]");
		nums = new int[]{3, 3, 3};
		target = 3;
		res = searchRange(nums, target);
		System.out.println("["+res[0]+","+res[1]+"]");
	}
	public static int[] searchRange(int[] nums, int target) {
		int[] res = new int[]{-1,-1};
        int len = nums.length;
        int lo=0; 
        int hi=len-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(nums[mid]<target) lo=mid+1;
            else hi=mid;
        }
        if(nums[lo]!=target){
            return res;
        }
        res[0]=lo;
        hi=len-1;
        while(lo<hi){
            int mid=(lo+hi)/2+1;
            if(nums[mid]>target) hi=mid-1;
            else lo=mid;
        }
        res[1]=hi;
        return res;
    }
}
