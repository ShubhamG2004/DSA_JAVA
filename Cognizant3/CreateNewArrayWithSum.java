package Cognizant3;

public class CreateNewArrayWithSum {
    public static int[] createNewArray(int input1, int[] input2, int[] input3){
        int N = input1;
        if (input2 == null || input3 == null || input2.length < N || input3.length < N) {
            throw new IllegalArgumentException("Input arrays must not be null and must have at least " + N + " elements.");
        }
        int[] result = new int[N];

        for(int i=0;i<N;i++){
            if(input2[i] == input3[i]){
                result[i] = input2[i];
            }
            else{
                result[i] = Math.max(input2[i], input3[i]);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // Example input
        int input1 = 5;
        int[] input2 = {1, 4, 3, 7, 5};
        int[] input3 = {2, 4, 6, 1, 5};

        int[] result = createNewArray(input1, input2, input3);

        // Print the result array
        System.out.print("Result array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
