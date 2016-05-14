package ua.nure.kovtunets.Practice2;

import java.util.Arrays;
import java.util.Iterator;

public class MyListImpl implements MyList {

	private Object[] obj;
	private int index;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	public MyListImpl() {
		obj = new Object[DEFAULT_CAPACITY]; // пояснить
	}

	@Override
	public void add(Object e) {
		if (index == obj.length) {
			growArray();

		}
		obj[index] = e;
		index++;
		size++;

	}

	@Override
	public void clear() {
		for (int i = 0; i < size; i++)
			obj[i] = null;

		size = 0;
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
		Object[] newArray = (Object[]) new Integer[(obj.length * 3) / 2 + 1];
		System.arraycopy(obj, 0, newArray, 0, index - 1);
		obj = newArray;
	}

	private void fastRemove(int index) {
		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(obj, index + 1, obj, index, numMoved);
		obj[--size] = null; // clear to let GC do its work
	}

	@Override
	public String toString() {

		StringBuffer stringList = new StringBuffer();
		if (this.size() == 0) {
			return new String("Emty list");
		}
		for (Object o : this.toArray()) {
			stringList.append(o.toString());
			stringList.append("\n");
		}
		// stringList.setLength(stringList.length() - 1);
		return stringList.toString();
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator<Object> {

		private int currentIndex = 0;

		@Override
		public boolean hasNext() {

			return currentIndex < size && obj[currentIndex] != null;
		}

		@Override
		public Object next() {
			return obj[currentIndex++];
		}

		@Override
		public void remove() {

			if (obj[currentIndex] != null) {
				MyListImpl.this.remove(obj[currentIndex]);
				obj[currentIndex] = null;

			}

			else {
				throw new IllegalStateException();
			}
		}
	}

}
