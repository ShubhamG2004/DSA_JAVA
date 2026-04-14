package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	private static final Scanner scanner = new Scanner(System.in);
	private static final ArrayList<String> items = new ArrayList<>();

	public static void main(String[] args) {
		int choice;

		do {
			printMenu();
			choice = readInt("Enter your choice: ");

			switch (choice) {
				case 1:
					insertElement();
					break;
				case 2:
					updateElement();
					break;
				case 3:
					deleteElement();
					break;
				case 4:
					viewElements();
					break;
				case 5:
					System.out.println("Exiting program...");
					break;
				default:
					System.out.println("Invalid choice. Please select between 1 and 5.");
			}
		} while (choice != 5);

		scanner.close();
	}

	private static void printMenu() {
		System.out.println("\n--- ArrayList Operations ---");
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. View");
		System.out.println("5. Exit");
	}

	private static void insertElement() {
		System.out.print("Enter value to insert: ");
		String value = scanner.nextLine();
		items.add(value);
		System.out.println("Inserted: " + value);
	}

	private static void updateElement() {
		if (items.isEmpty()) {
			System.out.println("List is empty. Nothing to update.");
			return;
		}

		viewElements();
		int index = readInt("Enter index to update: ");

		if (index < 0 || index >= items.size()) {
			System.out.println("Invalid index.");
			return;
		}

		System.out.print("Enter new value: ");
		String newValue = scanner.nextLine();
		String oldValue = items.set(index, newValue);
		System.out.println("Updated index " + index + " from '" + oldValue + "' to '" + newValue + "'.");
	}

	private static void deleteElement() {
		if (items.isEmpty()) {
			System.out.println("List is empty. Nothing to delete.");
			return;
		}

		viewElements();
		int index = readInt("Enter index to delete: ");

		if (index < 0 || index >= items.size()) {
			System.out.println("Invalid index.");
			return;
		}

		String removed = items.remove(index);
		System.out.println("Deleted: " + removed);
	}

	private static void viewElements() {
		if (items.isEmpty()) {
			System.out.println("List is empty.");
			return;
		}

		System.out.println("\nCurrent List:");
		for (int i = 0; i < items.size(); i++) {
			System.out.println(i + " -> " + items.get(i));
		}
	}

	private static int readInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = scanner.nextLine();

			try {
				return Integer.parseInt(input.trim());
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number.");
			}
		}
	}
}
