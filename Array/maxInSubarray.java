class maxInSubarray{
    static void Kadanes(int[] arr){
        int max = Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs =cs + arr[i];
            if(cs < 0){
                cs =0;
            }
            max = Math.max(cs,max);
        }

        System.out.println(max);
    }
    static void MaxSubarry(int[] arr){
        int k=1;

        for(int i=1;i<arr.length;i++){
            arr[i] += arr[i - 1];
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max:"+max);
    }
    public static void main(String args[]){
        int arr[] =  {1,-2,6,-1,3};
        int arr1[] =  {1,-2,6,-1,3};
        System.out.println();
        MaxSubarry(arr);
        Kadanes(arr1);
    }
}