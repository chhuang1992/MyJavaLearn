package l023hMergeKLists;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MergeKLists2UseQueue {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<ListNode> lists = new LinkedList<>();
        for(int i=0;i<num;i++){
        	ListNode dummyHead = new ListNode(0);
            ListNode curr = dummyHead;
            int n = scanner.nextInt();
            if(n==0)  lists.add(null);
            else{
            	int[] arr = new int[n];
            	for (int j = 0; j < n; j++) {
            		arr[j] = scanner.nextInt();
            		curr.next = new ListNode(arr[j]);
            		curr = curr.next;
            	}
            	lists.add(dummyHead.next);
            }
        }
        ListNode mergeOfKl = mergeKLists(lists);
		ListNode p = mergeOfKl;
		while(p!=null){
			if(p.next!=null)
				System.out.print(p.val+", ");
			else
				System.out.print(p.val);
			p=p.next;
		}
        
	}
	
	
	//XXX don't understand yet;
	@SuppressWarnings("rawtypes")
	public static ListNode mergeKLists(List<ListNode> lists) {
        @SuppressWarnings("unchecked")
		Queue<ListNode> heap = new PriorityQueue(new Comparator<ListNode>(){
            @Override public int compare(ListNode l1, ListNode l2) { 
                return l1.val - l2.val; 
            }
        });
        ListNode dummyHead = new ListNode(0), curr = dummyHead;
        for (ListNode node : lists) if (node != null) heap.offer(node);
        while (!heap.isEmpty()) {
            curr.next = heap.poll();
            curr = curr.next;
            if (curr.next != null) heap.offer(curr.next);
        }
        return dummyHead.next;
    }
}
