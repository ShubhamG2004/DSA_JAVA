package Cognizant2;

import java.util.Scanner;

public class InsertAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to add: ");
        int adder = sc.nextInt();

     
        System.out.print("Enter at which position you want to add: ");
        int index = sc.nextInt();

        int[] newArr = new int[n+1];
        for(int i=0;i< index;i++){
            newArr[i] = arr[i];
        }

        newArr[index] = adder;

        for(int i=index;i<n;i++){
            newArr[i+1] = arr[i];
        }

        System.out.println("New Updated Array");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+ " ");
        }
    }
}
