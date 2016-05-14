package ua.nure.kovtunets.Practice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
MyListImpl con = new MyListImpl();
con.add("A");
con.add("B");
con.add(new Integer(45));
//System.out.println(con.size());
//System.out.println(con.remove("A"));
//System.out.println(con.size());
//System.out.println(con);

for (Object o : con){
	System.out.println(o);
}

Iterator<Object> it = con.iterator();
while(it.hasNext())
	System.out.println(it.next());
	}

}
