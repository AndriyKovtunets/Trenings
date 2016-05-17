package ua.nure.kovtunets.Practice2;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		MyListImpl con = new MyListImpl();
		
		MyListImpl con2 = new MyListImpl();
		con2.add("A");
		con2.add("B");
		con2.add("C");
		con2.add("D");
		con2.add("E");
		
		con.add("A");
		con.add("B");
		con.add(new Object());
		con.add(new Object());
		con.add(new Object());
		
		
		System.out.println("Object con: \n"+con);
		System.out.println("Object con2: \n"+con2);
		
		System.out.println("Size con="+con.size()+" size con2="+con2.size()+"\n");
		System.out.println("Con have dsf? "+con.contains("dsf")+"\n");
		System.out.println("Con == con2? "+ con.containsAll(con2) +"\n");
		con.remove("B");
		System.out.println("con after remuve A: \n"+con);
		
		System.out.println("iteration con2(foreach)");
		for (Object o: con2){
			System.out.println(o);
		}
		
		System.out.println("\n iteration con(while)");
		
		Iterator<Object> it = con2.iterator();
		ListIterator it2 = con2.listIterator();
		
		System.out.println(it2.hasPrevious());
		System.out.println(it2.previus());
	
		
		
		while(it.hasNext()){
			System.out.println(it.next());

		}
		
		

		
		

	}

}
