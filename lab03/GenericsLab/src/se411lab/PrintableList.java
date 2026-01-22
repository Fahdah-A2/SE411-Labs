package se411lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {

	private List<T> list;

	public PrintableList(T[] items) {
		list = new ArrayList<>(Arrays.asList(items));
	}

	public List<T> getList() {
		return list;
	}

	public void printItems() {
		for (T item : list) {
			System.out.println(item);
		}
	}
}
