package se411lab;

public class NumberBox<T extends Number> {

	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public double add(T other) {
		return item.doubleValue() + other.doubleValue();
	}
}
