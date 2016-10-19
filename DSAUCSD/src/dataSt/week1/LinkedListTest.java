package dataSt.week1;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		//XXX peek=get;peek=peekFirst;
		//remove=poll=pop;remove = removeFisrt;poll=pollFirst;
		//add=offer;add=addlast;offer=offerlast;push=addFirst;
		LinkedList<Integer> l1= new LinkedList<>();
		l1.add(1);
		l1.add(11);
		l1.add(5);
		l1.add(17);
		l1.add(13);
		l1.add(3);
		l1.add(9);		
		int a=0;
		System.out.println("peek:");
		a=l1.peek();
		System.out.println(a);
		System.out.println(l1);
		a=l1.peekFirst();
		System.out.println(a);
		System.out.println(l1);
		a=l1.peekLast();
		System.out.println(a);
		System.out.println(l1);
		
		System.out.println("get:");
		a=l1.getFirst();
		System.out.println(a);
		System.out.println(l1);
		a=l1.getLast();
		System.out.println(a);
		System.out.println(l1);
		a=l1.get(3);
		System.out.println(a);
		System.out.println(l1);
		
		System.out.println("remove,add:");
		a=l1.remove();
		System.out.println(a);
		System.out.println(l1);
		l1.addFirst(a);
		System.out.println(l1);
		
		a=l1.removeFirst();
		System.out.println(a);
		System.out.println(l1);
		l1.addFirst(a);
		System.out.println(l1);
		
		a=l1.removeLast();
		System.out.println(a);
		System.out.println(l1);
		l1.addLast(a);
		System.out.println(l1);
		
		a=l1.removeLast();
		System.out.println(a);
		System.out.println(l1);
		l1.add(a);
		System.out.println(l1);
		
		a=l1.remove(2);
		System.out.println(a);
		System.out.println(l1);
		l1.add(2,a);
		System.out.println(l1);
		
		int idx = l1.indexOf((Integer)11);
		l1.remove((Integer)11);		
		System.out.println(l1);
		l1.add(idx,11);
		System.out.println(l1);
		
		System.out.println("poll:");
		a=l1.poll();
		System.out.println(a);
		System.out.println(l1);
		l1.addFirst(a);
		
		a=l1.pollFirst();
		System.out.println(a);
		System.out.println(l1);
		l1.addFirst(a);
		
		a=l1.pollLast();
		System.out.println(a);
		System.out.println(l1);
		l1.add(a);
		
		System.out.println("offer:");
		l1.offer(15);
		System.out.println(l1);
		l1.pollLast();
		
		l1.offerFirst(15);
		System.out.println(l1);
		l1.poll();
		
		l1.offerLast(15);
		System.out.println(l1);
		l1.pollLast();
		
		System.out.println("push,pop:");
		l1.push(57);
		System.out.println(l1);
		a = l1.pop();
		System.out.println(a);
		System.out.println(l1);
		
		System.out.println("set:");
		l1.push(57);
		l1.set(0, 67);
		System.out.println(l1);
		a = l1.pop();
		
		System.out.println("test Collections:");
		a = Collections.max(l1);
		System.out.println(a);
		
		Collections.reverse(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		
		LinkedList<Integer> l2= new LinkedList<>(l1);
		l2.add(31);
		l2.addAll(l1);
		System.out.println(l2);
		l2.addAll(5,l1);
		System.out.println(l2);
		
		l2= new LinkedList<>();
		l2.addAll(l1);
		System.out.println(l2);
		
		LinkedList<Integer> l3 = l1;
		l1.add(35);
		System.out.println(l3);
		
		Collections.swap(l1, 5, 3);
		System.out.println(l3);
		
		Collections.sort(l1);
		System.out.println(l3);
		
	}

}
