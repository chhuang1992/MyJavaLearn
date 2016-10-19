package l011ContainerWithMostWater;

import java.util.Scanner;

public class ContainerWithMostWater {

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
		int area=0;
		for(int i=0;i<height.length-1;i++){
			for(int j=i+1;j<height.length;j++){
				area=Math.max(Math.min(height[i], height[j])*(j-i), area);
			}
		}
		return area;
	}

}
