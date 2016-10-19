package l004hMedianOfTwoSortedArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
    		a1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
    		a2[i] = scanner.nextInt();
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(findMedianSortedArrays(a1, a2));
        int k = scanner.nextInt();
        System.out.println(getkth(a1, 0, a2, 0, k));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //from https://discuss.leetcode.com/topic/28602/concise-java-solution-based-on-binary-search
        //from @CHENG_ZHANG
        int m = nums1.length, n = nums2.length;
	    int l = (m + n + 1) / 2;
	    int r = (m + n + 2) / 2;
	    return (getkth(nums1, 0, nums2, 0, l) + getkth(nums1, 0, nums2, 0, r)) / 2.0;
    }
    
    public static double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
	    if (aStart > A.length - 1) return B[bStart + k - 1];            
	    if (bStart > B.length - 1) return A[aStart + k - 1];                
	    if (k == 1) return Math.min(A[aStart], B[bStart]);
	
	    int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
	    if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1]; 
	    if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];        
	
	    if (aMid < bMid) 
	        return getkth(A, aStart + k/2, B, bStart,       k - k/2);// Check: aRight + bLeft 
	    else 
		    return getkth(A, aStart,       B, bStart + k/2, k - k/2);// Check: bRight + aLeft
    }
}
