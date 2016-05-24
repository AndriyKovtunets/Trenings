package ua.nure.kovtunets.Practice2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyListImpl implements MyList, ListIterable {
	private Object[] obj;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	public MyListImpl() {
		obj = new Object[DEFAULT_CAPACITY];
	}

	@Override
	public void add(Object e) {

		if (size == obj.length) {
			growArray();

		}
		obj[size] = e;

		size++;

	}

	@Override
	public void clear() {
		Arrays.fill(obj, null);

	}

	@Override
	public boolean remove(Object o) {

		if (o == null) {
			for (int index = 0; index < size; index++)
				if (obj[index] == null) {
					fastRemove(index);
					return true;
				}
		} else {
			for (int index = 0; index < size; index++)
				if (o.equals(obj[index])) {
					fastRemove(index);
					return true;
				}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(obj, size);
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean contains(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++)
				if (obj[i] == null)
					return true;
		} else {
			for (int i = 0; i < size; i++)
				if (o.equals(obj[i]))
					return true;
		}

		return false;

	}

	@Override
	public boolean containsAll(MyList c) {

		for (Object o : c.toArray()) {
			if (!this.contains(o)) {
				return false;
			}
		}
		return true;
	}

	private void growArray() {
		Object[] newArray = new Object[(obj.length * 3) / 2 + 1];
		System.arraycopy(obj, 0, newArray, 0, size);
		obj = newArray;
	}

	private void fastRemove(int index) {
		int numMoved = size - index;
		if (numMoved > 0)
			System.arraycopy(obj, index + 1, obj, index, numMoved);
		obj[--size] = null;
	}

	@Override
	public String toString() {
		StringBuffer stringList = new StringBuffer();
		if (size() == 0) {
			return new String("Emty list");
		}
		for (Object o : toArray()) {
			stringList.append(o + "\n");
		}

		return stringList.toString();
	}

	@Override
	public Iterator<Object> iterator() {

		return new IteratorImpl();
	}

	@Override
	public ListIterator listIterator() {

		return new ListIteratorImpl();
	}

	private class IteratorImpl implements Iterator<Object> {

		protected int currentIndex = 0;
		protected boolean accessToChange = false;

		@Override
		public boolean hasNext() {

			return currentIndex < size;
		}

		@Override
		public Object next() {
			accessToChange = true;
			return obj[currentIndex++];
		}

		@Override
		public void remove() {

			if (currentIndex != 0 && accessToChange) {
				MyListImpl.this.remove(obj[currentIndex]);
				accessToChange = false;
			}

			else {
				throw new IllegalStateException();
			}
		}
	}

	private class ListIteratorImpl extends IteratorImpl implements ListIterator {

		@Override
		public boolean hasPrevious() {
			if (currentIndex != 0)
				return true;
			return false;
		}

		@Override
		public Object previus() {
			if (currentIndex != 0) {
				accessToChange = true;
				return obj[--currentIndex];
			}
			throw new NoSuchElementException();
		}

		@Override
		public void set(Object e) {
			if (currentIndex != 0 && accessToChange == true)
				obj[currentIndex] = e;
			accessToChange = false;
		}

	}

}
