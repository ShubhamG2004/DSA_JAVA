public class count_sort {
    static int findmax(int[] arr){
        int n=arr.length;

        int a = Integer.MIN_VALUE;
        for (int i= 0;i<n;i++)
        {
            if(a < arr[i]){
                a =arr[i];
            }
        }
        return a;
    }

    static void countsort(int[] arr){
        int n=arr.length;
        int[] output = new int[n];
        int max = findmax(arr);
        int[] count = new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //making the prefix of the count
        for(int i=1;i<count.length;i++)
        {
            count[i]+=count[i-1];
        }

        //find the index of each element in the original array and put t in the output array
        for(int i=n-1;i>=0;i--){
            int idex=count[arr[i]]-1;
            output[idex]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=output[i];
        }

    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,2,1,4};
        countsort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
