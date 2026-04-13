public class End_zero{
    public static void main(String[] args) {
        int [] arr={0,23,90,0,0};
        int n=arr.length;
        int temp;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]==0 && arr[j+1]!=0)
                {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                }
            }
        }

        System.out.println("After Sorting:");
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
}