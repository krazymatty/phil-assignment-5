package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		int i = 0;
		for (i = 0; items[i] != null; i++)
			if (i == (items.length - 1)) {
				int newArraySize = items.length * 2;
				items = Arrays.copyOf(items, newArraySize);
			}
		items[i] = item;
		return false;
	}

	@Override
	public int getSize() {
		int theSize = items.length;
		return theSize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}
}
