public class quick_sort {
    static void display(int[] arr, int str, int end)
    {
        for(int val:arr)
        {
            System.out.print(val+ " ");
        }
    }
    static void swap(int[] arr, int x,int y)
    {
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    } 
    static int partition(int[] arr, int str, int end)
    {
        int pivot =arr[str];
        int count=0;

        for(int i=str+1;i<=end;i++)
        {
            if(arr[i]<=pivot) count++;
        }
        int PivotIndex = str+count;
        swap(arr,str,PivotIndex);
        int i=str, j=end;
        while(i< PivotIndex && j>PivotIndex)
        {
            while(arr[i] <= pivot)i++;
            while(arr[j] > pivot)j--;

            if(i < PivotIndex && j > PivotIndex )
            {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return PivotIndex;
    }
    static void quic_sot(int[] arr, int str, int end){
        if(str >= end)return;
        int pi=partition(arr, str, end);
        quic_sot(arr, str, pi-1);
        quic_sot(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr={23,9,8,23,10,6};
        System.out.println("Array Before Sorting");
        display(arr,0,arr.length-1);
        quic_sot(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Array After Sorting");
        display(arr,0,arr.length-1);
    }   
}
