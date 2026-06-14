import java.util.Scanner;

class SecondLargest  {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int arr[] = {10, 5, 30, 20, 40};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int val : arr){
            if(val > largest){
                secondLargest = largest;
                largest = val;
            }
            else if(val < largest && secondLargest > val){
                secondLargest = val;
            }
        }

        System.out.println(secondLargest);
    }
}
