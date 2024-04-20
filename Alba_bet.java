public class Alba_bet {
    public static void main(String[] args) {
        String[] arr = {"shubham","virat","rohit","rahul"};
        int n=arr.length;
        
        for(String val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        
        for(int i=0;i<n;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j].compareTo(arr[min_index]) < 0){
                    min_index=j;
                }
            }
            String temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }

        for(String val:arr){
            System.out.print(val+" ");
        }
    }
}
