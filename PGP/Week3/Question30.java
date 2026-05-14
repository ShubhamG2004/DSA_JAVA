package PGP.Week3;

public class Question30 {

	public static void main(String[] args) {
		runTestCase("Test Case 1", "Sample input 1", "Expected output 1");
		runTestCase("Test Case 2", "Sample input 2", "Expected output 2");
		runTestCase("Test Case 3", "Sample input 3", "Expected output 3");
	}

	private static void runTestCase(String testName, String input, String expectedOutput) {
		System.out.println(testName);
		System.out.println("Input:    " + input);
		System.out.println("Expected: " + expectedOutput);
		System.out.println();
	}
}
