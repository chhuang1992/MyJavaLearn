package l042hTrappingRainWater;

public class TrappingRainWater2 {

	public static void main(String[] args) {
		int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
	public static int trap(int[] height) {
		int len = height.length;
		if(height==null||len == 0){
			return 0;
		}
		int result = 0;
		int maxIndex = 0;
		for(int i=1;i<len;++i){
			if(height[i]>height[maxIndex]){
				maxIndex = i;
			}
		}
		result = trapMaxInRight(height,maxIndex)+trapMaxInLeft(height,maxIndex);
		return result;
	}
	
	public static int trapMaxInRight(int[] height, int right) {
		if(right==0)
			return 0;
		int result=0;
		int maxIndex = 0;
		for(int i=1;i<right;++i){
			if(height[i]>height[maxIndex]){
				maxIndex = i;
			}
		}
		result += trapMaxInRight(height, maxIndex)+sumL2RMaxInRight(height, maxIndex, right);
		return result;
	}
	public static int trapMaxInLeft(int[] height, int left) {
		int len = height.length;
		if(left==len-1)
			return 0;
		int result=0;
		int maxIndex = len-1;
		for(int i=len-2;i>left;--i){
			if(height[i]>height[maxIndex]){
				maxIndex = i;
			}
		}
		result += trapMaxInLeft(height, maxIndex)+sumL2RMaxInLeft(height, left, maxIndex);
		return result;
	}
	public static int sumL2RMaxInRight(int[] height, int left, int right) {
		int result = 0;
		if(left+1==right){
			return 0;
		}
		for(int i=left+1;i<right;++i){
			result+=height[left]-height[i];
		}
		return result;
	}
	public static int sumL2RMaxInLeft(int[] height, int left, int right) {
		int result = 0;
		if(left+1==right){
			return 0;
		}
		for(int i=left+1;i<right;++i){
			result+=height[right]-height[i];
		}
		return result;
	}
}
