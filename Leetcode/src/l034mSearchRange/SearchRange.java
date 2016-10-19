package l034mSearchRange;

public class SearchRange {

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
        int position = -1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target){
                position = mid;
                break;
            }else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        if(position==-1)
            return res; 
        int left = lo==0?0:lo-1;
        int right = hi==len-1?len-1:hi+1;
        if(nums[position]==nums[left]){
            res[0]=left;
        }else{
            lo=left;
            hi=position;
            while(lo<hi){
                int mid=(lo+hi)/2+1;
                if(nums[mid]==target) hi=mid-1;
                else lo=mid;
            }
            res[0]=lo+1;
        }
        if(nums[position]==nums[right]){
            res[1]=right;
        }else{
            lo=position;
            hi=right;
            while(lo<hi){
                int mid=(lo+hi)/2;
                if(nums[mid]==target) lo=mid+1;
                else hi=mid;
            }
            res[1]=lo-1;
        }
        return res;
    }
}
