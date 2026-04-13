public class check_sort {
static boolean sort(int[] arr)
{
    boolean check=true;
    for(int i=1; i<arr.length; i++)
    {
        if(arr[i] < arr[i-1])
        {
            check=false;
            break;
        }
    }
    return check;
}

    public static void main(String[] args) {
        int[] arr={23,3,43,50};
        System.out.println("Is sorted "+ sort(arr));
    }
}
