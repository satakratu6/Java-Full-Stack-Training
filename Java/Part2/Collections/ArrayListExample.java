package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
	 List l=new ArrayList();
	 l.add(12);
	 l.add(14);
	 l.add(15);
	 l.add(0, 13);
	 System.out.println(l);
	 
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		List l1=new LinkedList();
		l1.addAll(l);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(12));
		System.out.println(l1.reversed());
		System.out.println(l1);

		l1.removeFirst();
		System.out.println(l1);

		l1.addLast(16);
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1.removeLast());
		System.out.println(l1);
		l1.remo
		System.out.println(l1.contains(12));
//		System.out.println(a.get(0));
//		System.out.println(a.get(1));
//		System.out.println(a.get(2));
//		System.out.println(a.get(3));
//		ArrayList b=new ArrayList(a);
//		for(int i=0;i<b.size();i++) {
//			System.out.println(b.get(i));
//		}
		
	}
}
