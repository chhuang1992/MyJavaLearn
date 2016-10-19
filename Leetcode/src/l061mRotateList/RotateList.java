package l061mRotateList;

import java.util.Scanner;

public class RotateList {

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
        int n = scanner.nextInt();
        
        ListNode result = rotateRight(l1,n);
		ListNode p = result;
		while(p!=null){
			if(p.next!=null)
				System.out.print(p.val+", ");
			else
				System.out.print(p.val);
			p=p.next;
		}
	}
	public static ListNode rotateRight(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode curr;
        curr = dummyHead;
        int len = 0;
        while(curr.next!=null){
            curr = curr.next;
            len++;
        }
        curr.next = dummyHead.next;
        curr = dummyHead;
        for(int i=0;i<len-k;i++){
            curr = curr.next;
        }
        dummyHead.next = curr.next;
        curr.next = null;
        return dummyHead.next;
    }
}
