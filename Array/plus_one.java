import java.util.Arrays;

public class plus_one {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int mul = 0; // Initialize mul to 0
        
        for (int i = 0; i < a.length; i++) {
            mul = (mul * 10) + a[i]; // Multiply by 10 and add the current digit from the array
        }
        
        mul++; 
        System.out.println(mul);


        int temp =mul;
        int digit=0;
        while(temp > 0){
            temp = temp/10;
            digit++;
        }
        int[] arr=new int[digit];

        for(int i=arr.length-1;i>=0;i--){
            arr[i]=mul%10;
            mul =mul/10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
