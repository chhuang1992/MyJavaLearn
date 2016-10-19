package algTool.week4;

import java.util.LinkedList;
import java.util.Scanner;

public class MergeSortUseList {
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
		LinkedList<Integer> l1 = new LinkedList<>();
		for(int i=0;i<len1;i++){
			l1.add(a[i]);
		}
		int len2 = b.length;
		LinkedList<Integer> l2 = new LinkedList<>();
		for(int i=0;i<len2;i++){
			l2.add(b[i]);
		}
		LinkedList<Integer> mer = merge(l1,l2);
		int len = len1+len2;
		int[] res = new int[len];
		for(int i=0;i<len;i++){
			res[i]=mer.get(i);
		}
		return res;
	}
	public static LinkedList<Integer> merge(LinkedList<Integer> l1, LinkedList<Integer> l2){
		if(l1.size()==0) return l2;
		if(l2.size()==0) return l1;
		if(l1.peek() < l2.peek()){
			int a=l1.removeFirst();
			LinkedList<Integer> mer = merge(l1, l2);
			mer.addFirst(a);
			return mer;
		} else{
			int b=l2.removeFirst();
			LinkedList<Integer> mer = merge(l1, l2);
			mer.addFirst(b);
			return mer;
		}
	}
}
