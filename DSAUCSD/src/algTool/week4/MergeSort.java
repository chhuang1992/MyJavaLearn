package algTool.week4;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scanner.nextInt();
		}
		for(int res:mergeSort(arr)){
			System.out.print(res+",");
		}
	}
	public static int[] mergeSort(int[] a){
		int len = a.length;
		return mergeSort(a,0,len-1);
	}
	public static int[] mergeSort(int[] a, int l, int r){
		if(l==r) return new int[]{a[l]};
		int m=(l+r)/2;
		return merge(mergeSort(a,l,m),mergeSort(a,m+1,r));
	}
	public static int[] merge(int[] a, int[] b){		
		int len1 = a.length;		
		int len2 = b.length;		
		int len = len1+len2;
		int[] res = new int[len];
		int i=0,j=0;
		while(i<len1||j<len2){
			if(i<len1&&j<len2){
				if(a[i]<b[j]){
					res[i+j] = a[i];
					i++;
				}else{
					res[i+j] = b[j];
					j++;
				}				
			}else if(i==len1){
				res[i+j]=b[j];
				j++;
			}else{
				res[i+j]=a[i];
				i++;
			}
		}
		return res;
	}
	
}
