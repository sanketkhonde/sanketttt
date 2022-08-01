package collection;

import java.util.*;

public class collection_list {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("sanket");
		a.add("5.3");
		a.add('g');
		a.add(null);
		a.add(null);
		a.add("");
		a.add(' ');
		a.remove(2);
//	System.out.println(a);
//	a.remove("sanket");
//	System.out.println(a);
		
		
		
		for (int i = a.size() - 1; i >= 0; i--) {
			System.out.println(a.get(i) + " f");

		}
		Iterator i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		ListIterator ii = a.listIterator();
		while (ii.hasPrevious()) {
			System.out.println(ii.previous());
		}
		for (Object t : a) {
			System.out.println(t + "   fe");

		}
		System.out.println("==========================================================");

		// linkedlist
		LinkedList l = new LinkedList();

		l.add("ankit");
		l.add("5.5");
		l.add('g');
		l.add(null);
		l.add(null);
		l.add("");
		l.add("5.5");
		System.out.println(l.get(0));
		System.out.println(l.getLast() + "      is last");
		System.out.println(l.pop() + "     pop");// remove first element
		System.out.println(l.remove() + "     remove");
		System.out.println(l.size());

		Iterator u = l.iterator();
		
		
		
		while (u.hasNext()) {
			System.out.println(u.next() + "    ");
		}
		
		
		
		
		ListIterator ui = l.listIterator();
		while (ui.hasNext()) {

			System.out.println(ui.next() + "     f ");
		}
		
		
		
		while (ui.hasPrevious()) {

			System.out.println(ui.previous() + "      reverse");
		}
		
		
		
		
		
		System.out.println("============================================");
		//==============================vector
		
		Vector V=new Vector();
		
		
		V.add("aniket");
		V.add("8.5");
		V.add('k');
		V.add(null);
		V.add(null);
		V.add("");
		V.add("8.5");
		System.out.println(V);
		System.out.println(V.remove(0));
		System.out.println(V);
		System.out.println(V.get(0));
		System.out.println(V.size()+"        is the size");
		
		Enumeration en=V.elements();  //use to retrive data
		while(en.hasMoreElements()) 
		{
			System.out.println(en.nextElement()+"     enmrt");
			
		}
		
		//  using for each
		for(Object obj:V) {
			
			
			System.out.println(obj);
		}
		
		
		
System.out.println("==============================================");
		
	//================set
	// does not allow duplicate	
	//can only use for each and iterator for retriving	
	// random ordr will show 	
		
		HashSet h=new HashSet();
		h.add("aniket");
		h.add("8.5");
		h.add('k');
		h.add(null);
		h.add(null);
		h.add("");
		h.add("");
		h.remove('k');
		System.out.println();
		
		
		Iterator hi=h.iterator();
		while(hi.hasNext()) 
		{
			System.out.println(hi.next()+"    i");
		}
		
		
		
		for(Object tf:h) 
		{
			
			System.out.println(tf+"   forech");
		}
		
	System.out.println("=======================================");	
		
	//linked hash set
	//doesnt allow duplicate 0ne null// hetero
	//order insertn mntn
	//linear hstbl ds
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("usa");
		lhs.add("uk");
		lhs.add(9);
		lhs.add(null);
		lhs.add(5.5);
		lhs.add(null);
		//System.out.println(((List) lhs).get(1));
		 Iterator itr=lhs.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next()+" lhs");
			 
		 }
		 
		 
		 
		 System.out.println("=====================================");
		 //treeset
		 //value shud b uniq not evn null
		 //homo //insrt vlu in asc order //
		//hastbl//tr.add(null);===>classcast exception
		 
		 
		 
		 TreeSet tr=new TreeSet();
		 
		 tr.add(9);
			tr.add(6);
			tr.add(9);
			
			tr.add(5);
			
			System.out.println(tr);
			tr.remove(9);
			System.out.println(tr);
			
		 
		 HashMap<Integer,Character>ma=new HashMap<>();
		 
		 ma.put(1,'d');
//		 ma.put("taa",2,'a');
//		 ma.put("yaa",3,'u');
//		 ma.put("uaa",4,'o');
//		 System.out.println(ma);
//		
		 System.out.println(ma);
		
	}

}
