package l021eMergeTwoSortedLists;

import java.util.Scanner;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        ListNode l1;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        if(n1==0)  l1=null;
        else{
        	int[] a1 = new int[n1];
        	for (int i = 0; i < n1; i++) {
        		a1[i] = scanner.nextInt();
        		curr.next = new ListNode(a1[i]);
        		curr = curr.next;
        	}
        	l1=dummyHead.next;
        }
        int n2 = scanner.nextInt();
        ListNode l2;
        dummyHead = new ListNode(0);
        curr = dummyHead;
        if(n2==0)  l2=null;
        else{
            int[] a2 = new int[n2];
            for (int i = 0; i < n2; i++) {
            	a2[i] = scanner.nextInt();
            	curr.next = new ListNode(a2[i]);
        		curr = curr.next;
            }
            l2=dummyHead.next;
        }
        ListNode mergeOf2l = mergeTwoLists(l1,l2);
		ListNode p = mergeOf2l;
		while(p!=null){
			if(p.next!=null)
				System.out.print(p.val+", ");
			else
				System.out.print(p.val);
			p=p.next;
		}
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //from @YANGLIGUANG
        if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
}
