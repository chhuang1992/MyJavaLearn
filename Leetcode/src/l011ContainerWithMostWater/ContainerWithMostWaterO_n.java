package l011ContainerWithMostWater;

import java.util.Scanner;

public class ContainerWithMostWaterO_n {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scanner.nextInt();
		}
		System.out.println(maxArea(arr));
	}
	public static int maxArea(int[] height){
		int l=0;
		int r=height.length-1;
		int area=0;
		while(l<r){
			area=Math.max(Math.min(height[l], height[r])*(r-l), area);
			if(height[l]<height[r]){
				l++;
			}else{
				r--;
			}
		}
		return area;
	}

}
