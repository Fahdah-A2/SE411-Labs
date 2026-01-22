package se411lab;

import java.util.List;
import java.util.Arrays;

public class App {
	public static void printList(List<?> list) {
		for (Object item : list) {
			System.out.println(item);
		}
	}

	public static double sumNumbers(List<? extends Number> list) {
		double sum = 0.0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] words = { "Java", "Generics", "SE411" };
		PrintableList<String> stringList = new PrintableList<>(words);
		System.out.println("String List:");
		stringList.printItems();
		System.out.println("------------");
		Integer[] numbers = { 10, 20, 30 };
		PrintableList<Integer> intList = new PrintableList<>(numbers);
		System.out.println("Integer List:");
		intList.printItems();
		System.out.println("============");
		NumberBox<Integer> intBox = new NumberBox<>();
		intBox.setItem(10);
		System.out.println("Integer Sum: " + intBox.add(5));
		NumberBox<Double> doubleBox = new NumberBox<>();
		doubleBox.setItem(2.5);
		System.out.println("Double Sum: " + doubleBox.add(3.5));
		System.out.println("============");
		List<String> names = Arrays.asList("Alia", "Sarah", "Gahdah");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		System.out.println("Names list:");
		printList(names);
		System.out.println("Nums list:");
		printList(nums);
		System.out.println("Sum of nums = " + sumNumbers(nums));
	}
}
