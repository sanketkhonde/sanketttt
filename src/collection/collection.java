package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class collection {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("sanket");
		a.add("32");
		a.add("ron");
		System.out.println(a);
		a.add(1,"roniy");
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		a.set(0,"raja");
		System.out.println(a);
		System.out.println(a.get(2));
		a.clear();
		System.out.println(a);
		
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("jack");
		l.add("mack");
		System.out.println(l);
		l.addFirst("ros");//add addFirst addLast
		System.out.println(l);
		l.removeFirst();//remove remove first las
		System.out.println(l);
		Stack<String> a1=new Stack<>();//lifo
		a1.push("sanket1");
		a1.add("ram1");
		a1.add("ron1");
		System.out.println(a1);
		a1.pop();
		a1.push("rosa");
		System.out.println(a1);
		
		
		ArrayDeque a2 =new ArrayDeque();
		a2.push(5);
		a2.push("abbc");
		a2.push("adcd");
		System.out.println(a2);//fifo
		//a2.pop();
		System.out.println(a2);
		
	}

}
