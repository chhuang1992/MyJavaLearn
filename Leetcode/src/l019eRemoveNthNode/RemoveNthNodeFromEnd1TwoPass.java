package l019eRemoveNthNode;

import java.util.Scanner;

public class RemoveNthNodeFromEnd1TwoPass {
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
        
        ListNode result = removeNthFromEnd(l1,n);
		ListNode p = result;
		while(p!=null){
			if(p.next!=null)
				System.out.print(p.val+", ");
			else
				System.out.print(p.val);
			p=p.next;
		}
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode first = head;
		int length=0;
		while(first!=null){
			length++;
			first = first.next;
		}
		length -= n;
		first = dummyHead;
		while(length>0){
			length--;
			first = first.next;
		}
		first.next = first.next.next;
		return dummyHead.next;
    }
}
