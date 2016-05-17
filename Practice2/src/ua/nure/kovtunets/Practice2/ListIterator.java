package ua.nure.kovtunets.Practice2;


import java.util.Iterator;

public interface ListIterator extends Iterator<Object>{
boolean hasPrevious();
Object previus();
void set (Object e);
void remove();

	
}
