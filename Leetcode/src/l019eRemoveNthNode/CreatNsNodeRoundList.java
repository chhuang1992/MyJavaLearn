package l019eRemoveNthNode;

import java.util.Scanner;

public class CreatNsNodeRoundList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        ListNode l1;
        ListNode head;
        ListNode tail;
        ListNode dummyHead = new ListNode(0);
        ListNode dummyTail = new ListNode(0);
        ListNode curr = dummyHead;
        if(n1<=0)  l1=null;
        else{
        	int[] a1 = new int[n1];
        	for (int i = 0; i < n1; i++) {
        		a1[i] = scanner.nextInt();
        		curr.next = new ListNode(a1[i]);
        		curr = curr.next;
        	}
        	dummyTail.next = curr;
        	curr.next = dummyHead.next;
        	l1=dummyHead.next;
        	head = dummyHead.next;
        	tail = dummyTail.next;
        }
        curr = dummyHead;
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
        	curr = curr.next;
        }
        ListNode mark = curr;
        do{
        	System.out.print(curr.val+" ");
        	curr=curr.next;
        }while(curr!=mark);
	}

}
