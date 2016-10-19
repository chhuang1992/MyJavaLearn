package l002mAddTwoNumbers;

import java.util.Scanner;

/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbersWithInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        ListNode sumOf2l = addTwoNumbers(l1,l2);
		ListNode p = sumOf2l;
		while(p!=null){
			System.out.print(p.val+", ");
			p=p.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //from Editorial Solution
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
