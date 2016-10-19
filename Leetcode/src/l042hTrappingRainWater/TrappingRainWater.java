package l042hTrappingRainWater;

import java.util.LinkedList;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
	public static int trap(int[] height) {
		int result = 0;
		int maxHeight = 0;
		int len = height.length;
		if(height==null||len == 0){
			return result;
		}
		for(int i=0;i<len;++i){
			if(height[i]>maxHeight){
				maxHeight = height[i];
			}
		}
		for(int hi=1;hi<=maxHeight;++hi){
			LinkedList<Integer> listIndex= new LinkedList<Integer>();
			for(int i=0;i<len;++i){
				if(height[i]>=hi){
					listIndex.add(i);
				}
			}
			int listSize = listIndex.size();
			if(listSize==1)
				break;
			for(int i=1;i<listIndex.size();++i){
				result += listIndex.get(i)-listIndex.get(i-1)-1;
			}
		}
		return result;
	}
}
